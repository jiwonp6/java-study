package ch31_JDBC.exBook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {
    // 데이터 베이스 연결 관리 유틸리티 객체
    private static final String url = "jdbc:mysql://localhost:3306/jdbc";
    private static final String user = "root";
    private static final String pw = "1234";
    private static Connection conn;

    // 커넥션 연결
    public static Connection getConnection() {
        if (conn == null) {
            try {
                conn = DriverManager.getConnection(url, user, pw);
            } catch (SQLException e) {
                e.printStackTrace();    // 예외 메시지 출력
            }
        }
        return conn;
    }

    // 커넥션 연결 해제
    public static void close() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();    // 예외 메시지 출력
            }
        }
    }
}
