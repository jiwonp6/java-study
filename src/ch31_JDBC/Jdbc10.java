package ch31_JDBC;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Jdbc10 {
    // Delete 데이터 삭제
    public static void main(String[] args) {
        // 접속 정보 (jdbc 스키마)
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "1234";

        // 문자열, StringBuilder 를 활용해 쿼리문 작성
        String sql = "DELETE FROM boards WHERE boardNo = ?";
        try (
                Connection conn = DriverManager.getConnection(url, user, password);
                PreparedStatement pstmt = conn.prepareStatement(sql);
        ){
            pstmt.setInt(1, 1);
            
            int rows = pstmt.executeUpdate();

            if (rows != 0) {
                System.out.println("삭제완료");
            }
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
