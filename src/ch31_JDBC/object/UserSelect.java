package ch31_JDBC.object;

import java.sql.*;

public class UserSelect {
    public static void main(String[] args) {
        // 접속 정보 (jdbc 스키마)
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String pw = "1234";

        String sql = "SELECT userId, userName, password, age, email FROM users WHERE userId = ?";

        // 연결 객체
        try (
                Connection conn = DriverManager.getConnection(url, user, pw);
                PreparedStatement pstmt = conn.prepareStatement(sql);
        ){
            pstmt.setString(1, "hkd");

            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {    // -> 결과 셋에 데이터가 1개만 있는 경우
                // 데이터에서 객체로 값을 매핑
                User user1 = new User(rs.getString("userId"),
                                    rs.getString("userName"),
                                    rs.getString("password"),
                                    rs.getInt("age"),
                                    rs.getString("email"));
                // 객체 출력
                System.out.println(user1);
            }

        } catch (SQLException e) {
            System.out.println("에러: " + e.getMessage());
        }

    }
}
