package ch31_JDBC;

import java.sql.*;

public class Jdbc05 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/scott";
        String user = "root";
        String password = "1234";

        try (   // 1. 연결
                Connection conn = DriverManager.getConnection(url, user, password);
                // 2. 쿼리 생성
                Statement stmt = conn.createStatement();
                // 3. 실행
                ResultSet rs = stmt.executeQuery("SELECT * FROM no_table");
        ){

        } catch (SQLException e) {
            System.out.println("예외 메세지: " + e.getMessage());
            System.out.println("오류 종류: " + e.getSQLState());            // 표준 오류 코드 문자열
            System.out.println("MySQL 에러코드: " + e.getErrorCode());      // 특정 DBMS 의 에러코드
            System.out.println("error 난 코드 다음에 다른 error 가 존재하는지" + e.getNextException()); // 특정 DBMS 의 에러코드
        }
    }
}
