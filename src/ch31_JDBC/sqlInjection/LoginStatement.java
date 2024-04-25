package ch31_JDBC.sqlInjection;

import java.sql.*;
import java.util.Scanner;

public class LoginStatement {
    // 로그인
    public static void main(String[] args) {
        // 접속 정보 (jdbc 스키마)
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String pw = "1234";

        Scanner scanner = new Scanner(System.in);
        System.out.println("ID 를 입력하세요: ");
        String userId = scanner.nextLine();
        System.out.println("PASSWORD 를 입력하세요: ");
        String password = scanner.nextLine();

        try (
                Connection conn = DriverManager.getConnection(url, user, pw);
                Statement stmt = conn.createStatement();
        ){
            // SELECT * FROM users WHERE userId = ? AND password = ?;
            String sql = "SELECT * FROM users WHERE userId = '" + userId + "' AND password = '" + password + "'";
            // => 이렇게 사용하는 경우 보안에 문제가 발생할 수 있음 (SQL Injection 공격)
            // ex. password 에 [ pw' OR 'x' = 'x ] 라고 입력 ->  
                // [ WHERE userId = 'userId' AND password = 'pw' OR 'x' = 'x' ] 로 조건 만족
            
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                System.out.println("성공적으로 로그인 되었습니다.");
            } else {
                System.out.println("존재하지 않는 회원입니다.");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
