package ch31_JDBC.ex;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex04 {
    /*
        [연습문제]
        사용자 삭제

        [요구사항]
        사용자로부터 userId를 입력받아 해당 userId를 가진 사용자의 데이터를 데이터베이스에서 삭제하세요.

        - 사용자로부터 userId를 입력받습니다.
        - 해당 userId를 가진 사용자의 데이터를 users 테이블에서 삭제합니다.
     */
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String pw = "1234";

        String sql = "DELETE FROM users WHERE userId = ?";

        Scanner scanner = new Scanner(System.in);
        System.out.println("사용자 ID를 입력하세요: ");
        String userId = scanner.nextLine();

        try (
                Connection conn = DriverManager.getConnection(url, user, pw);
                PreparedStatement pstmt = conn.prepareStatement(sql);
            ){
            pstmt.setString(1, userId);

            int rows = pstmt.executeUpdate();

            if (rows != 0) {
                System.out.println("데이터가 성공적으로 삭제되었습니다.");
            }

        } catch (SQLException e) {
            System.out.println("오류 메세지: " + e.getMessage());
        }
    }
}
