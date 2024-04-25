package ch31_JDBC.transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transaction01 {
    // 트랜잭션 처리 : 작업의 최소단위, All or Nothing, 모두 성공하거나 모두 실패해야 함
    public static void main(String[] args) {
        // 접속 정보 (jdbc 스키마)
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String pw = "1234";

        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, pw);

            // 연결 객체에서 자동 커밋 끄기
            conn.setAutoCommit(false);

            // 트랜잭션 시작
            // 1. 출금
            String withdraw = "UPDATE accounts SET balance = balance - ? WHERE accountNo = ?";

            PreparedStatement pstmtWithdraw = conn.prepareStatement(withdraw);
            pstmtWithdraw.setInt(1, 100000);
            pstmtWithdraw.setString(2, "111-111-1111");

            int rows1 = pstmtWithdraw.executeUpdate();

            if (rows1 == 0) {
                System.out.println("출금에 실패하였습니다.");
                // 실패할 경우 예외 발생
                throw new Exception("출금실패");
            }

            pstmtWithdraw.close();

            // 2. 입금
            String deposit = "UPDATE accounts SET balance = balance + ? WHERE accountNo = ?";

            PreparedStatement pstmtDeposit = conn.prepareStatement(deposit);
            pstmtDeposit.setInt(1, 100000);
            pstmtDeposit.setString(2, "222-222-2222");

            int rows2 = pstmtDeposit.executeUpdate();

            if (rows2 == 0) {
                System.out.println("입금에 실패하였습니다.");
                // 실패할 경우 예외 발생
                throw new Exception("입금실패");
            }

            pstmtDeposit.close();

            // 커밋
            conn.commit();
            
            // 트랜잭션 종료
            System.out.println("계좌이체가 성공하였습니다.");


        } catch (Exception e) {
            try {
                // 트랜잭션 중간에 예외를 만나게 되면, 롤백 => 모든 SQL 문 실패처리
                conn.rollback();
                conn.setAutoCommit(true);       // 자동 커밋 원상복구
                System.out.println("계좌이체에 실패하였습니다.");
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            e.printStackTrace();                // 예외 내용 출력
        } finally {
            try {
                if (conn != null) {
                    conn.setAutoCommit(true);   // 자동 커밋 원상복구
                    conn.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
