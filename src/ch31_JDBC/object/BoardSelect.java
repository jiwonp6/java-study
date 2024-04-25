package ch31_JDBC.object;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;

public class BoardSelect {
    public static void main(String[] args) {
        // 접속 정보 (jdbc 스키마)
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String pw = "1234";

        String sql = "SELECT boardNo, title, content, writer, date, filename, filedata FROM boards WHERE writer = ?";

        // 연결 객체
        try (
                Connection conn = DriverManager.getConnection(url, user, pw);
                PreparedStatement pstmt = conn.prepareStatement(sql);
        ){
            pstmt.setString(1, "홍길동");

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {    // -> 결과 셋에 데이터가 1개만 있는 경우
                // 데이터에서 객체로 값을 매핑
                Board board = new Board(rs.getInt("boardNo"),
                        rs.getString("title"),
                        rs.getString("content"),
                        rs.getString("writer"),
                        rs.getDate("date"),
                        rs.getString("filename"),
                        rs.getBlob("filedata"));

                // 파일로 저장 (IO 스트림을 통해)
                Blob filedata = board.getFiledata();
                InputStream inputStream = filedata.getBinaryStream();
                FileOutputStream outputStream = new FileOutputStream("src/ch31_JDBC/object/" + board.getFilename());
                inputStream.transferTo(outputStream);
                
                outputStream.flush();
                outputStream.close();
                inputStream.close();

                // 객체 출력
                System.out.println(board);
            }

        } catch (SQLException e) {
            System.out.println("에러: " + e.getMessage());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
