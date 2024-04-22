package ch31_JDBC;

import java.sql.*;
import java.util.Date;

public class Jdbc04 {
    // try-with-resources 구문으로 자원 정리하기
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/scott";
        String user = "root";
        String password = "1234";

        try (   // 1. 연결
                Connection conn = DriverManager.getConnection(url, user, password);
                // 2. 쿼리 생성
                Statement stmt = conn.createStatement();
                // 3. 실행
                ResultSet rs = stmt.executeQuery("SELECT * FROM emp");
        ){
            // 4. 결과처리
            while (rs.next()) {
                int eno = rs.getInt(1);             // 첫 번째 컬럼을 정수타입으로 반환
                String ename = rs.getString(2);     // 두 번째 컬럼을 문자열 타입으로 반환
                Date hiredate = rs.getDate("hiredate");
                System.out.println("사원번호: " + eno + ", 사원명: " + ename + ", 입사일: " + hiredate);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } // 5. 자원정리
        // close 메소드 사용하지 않아도 try 구문이 끝나면 객체를 안전하게 종료함
    }
}
