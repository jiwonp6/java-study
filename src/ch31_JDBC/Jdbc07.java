package ch31_JDBC;

import java.sql.*;

public class Jdbc07 {
    // Insert 삽입
    public static void main(String[] args) {
        // 접속 정보 (jdbc 스키마)
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "1234";

        String sql = "INSERT INTO users (userId, userName, password, age, email) VALUES (?, ?, ?, ?, ?)";

        try (
                Connection conn = DriverManager.getConnection(url, user, password);
                PreparedStatement pstmt = conn.prepareStatement(sql);
        ){
            pstmt.setString(1,"hkd");
            pstmt.setString(2,"홍길동");
            pstmt.setString(3,"hkd123");
            pstmt.setInt(4, 30);
            pstmt.setString(5,"hkd@hkd.com");
            
            // 정상적으로 실행 -> 1 리턴
            int rows = pstmt.executeUpdate();

            System.out.println(rows == 1? "실행완료": "실행실패");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
