package ch31_JDBC;

import java.sql.*;

public class Jdbc03 {
    // SQL 문 사용
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/scott";
        String user = "root";
        String password = "1234";

        // 연결 객체
        Connection conn = null;
        // 실행문 객체
        Statement stmt = null;
        // 결과문 객체
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            
            // SQL 쿼리 실행문
            stmt = conn.createStatement();
            String sql = "SELECT * FROM emp";

            // 쿼리문 실행
            rs = stmt.executeQuery(sql);

            // rs.next() : 읽어올 행의 정보 O -> true, 커서 한 행 이동 / X -> false
            while (rs.next()) {
                // 결과 셋에서 ename 컬럼의 데이터를 가져옴(데이터 타입이 일치해야 함)
                String ename = rs.getString("ename");
                System.out.println(ename);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                // 데이터 베이스 리소스 해제
                rs.close();
                stmt.close();
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
