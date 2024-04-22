package ch31_JDBC;

import java.sql.*;

public class Jdbc06 {
    // PreparedStatement : 동적 쿼리
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/scott";
        String user = "root";
        String password = "1234";

        String sql = "SELECT * FROM emp WHERE deptno = ?";

        try (
                Connection conn = DriverManager.getConnection(url, user, password);
                PreparedStatement pstmt = conn.prepareStatement(sql);   // 동적 쿼리 생성하고 값 지정
        ){
                pstmt.setInt(1, 10);
                ResultSet rs = pstmt.executeQuery();

                while (rs.next()) {
                    System.out.println(rs.getInt("deptno") + ": " + rs.getString("ename"));
                }

                rs.close();

        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }
}
