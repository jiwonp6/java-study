package ch31_JDBC;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;

public class Jdbc09 {
    // Update 데이터 수정
    public static void main(String[] args) {
        // 접속 정보 (jdbc 스키마)
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "1234";

        // 문자열, StringBuilder 를 활용해 쿼리문 작성
        String sql = new StringBuilder().append("UPDATE boards SET ")
                                        .append("title = ?, ")
                                        .append("content = ?, ")
                                        .append("filename = ?, ")
                                        .append("filedata = ? ")
                                        .append("WHERE boardNo = ?")
                                        .toString();

        try (
                Connection conn = DriverManager.getConnection(url, user, password);
                PreparedStatement pstmt = conn.prepareStatement(sql);
        ){
            pstmt.setString(1,"홍길동전 후기");
            pstmt.setString(2,"홍길동전 너무 재밌어요!!!");
            pstmt.setString(3, "hkd.jpg");
            pstmt.setBlob(4, new FileInputStream("src/ch31_JDBC/hkd.jpg"));
            pstmt.setInt(5, 1);
            
            int rows = pstmt.executeUpdate();

            if (rows == 1) {
                System.out.println("수정완료");
            }
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
        }
    }
}
