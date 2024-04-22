package ch31_JDBC;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;

public class Jdbc08 {
    // Insert 삽입
    public static void main(String[] args) {
        // 접속 정보 (jdbc 스키마)
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "1234";

        String sql = "INSERT INTO boards (title, content, writer, filename, filedata) VALUES (?, ?, ?, ?, ?)";

        try (
                Connection conn = DriverManager.getConnection(url, user, password);
                // 두 번째 매개값에 생성된 Key 를 리턴
                PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ){
            pstmt.setString(1,"홍길동전");
            pstmt.setString(2,"홍길동전 너무 재밌어요.");
            pstmt.setString(3,"홍길동");
            pstmt.setString(4, "hkd.jpg");
            pstmt.setBlob(5, new FileInputStream("src/ch31_JDBC/hkd.jpg"));
            
            int rows = pstmt.executeUpdate();

            if (rows == 1) {
                // 실행문 결과로 생성된 키값의 결과셋 반환
                ResultSet rs = pstmt.getGeneratedKeys();
                if (rs.next()){
                    int boardNo = rs.getInt(1);
                    System.out.println(boardNo + "번 글이 입력되었습니다.");
                }
                rs.close();
            }
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
        }
    }
}
