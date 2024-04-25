package ch31_JDBC.sqlInjection;

import java.sql.*;
import java.util.Scanner;

public class LoginPrepareStatement {
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

        String sql = "SELECT * FROM users WHERE userId = ? AND password = ?";
        try (
                Connection conn = DriverManager.getConnection(url, user, pw);
                PreparedStatement pstmt = conn.prepareStatement(sql);
        ){
            pstmt.setString(1, userId);
            pstmt.setString(2, password);

            ResultSet rs = pstmt.executeQuery();

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
