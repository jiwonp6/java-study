package ch31_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Jdbc02 {
    // 데이터 베이스에 연결
    public static void main(String[] args) {
        // URL (jdbc:서브프로토콜://호스트이름:포트번호/데이터베이스이름)
        String url = "jdbc:mysql://localhost:3306/scott";
        String user = "root";
        String password = "1234";

        // DriverManager 에서 연결 객체 가져오기
        Connection conn = null;
        try {
            // JDBC 드라이버에서 연결 객체 반환
            conn = DriverManager.getConnection(url, user, password);
            if (conn != null) {
                System.out.println("데이터베이스에 성공적으로 연결되었습니다.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (conn != null) {
                try {
                    // 데이터 베이스 리소스 해제
                    conn.close();
                    System.out.println("데이터 베이스 연결 종료");
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
