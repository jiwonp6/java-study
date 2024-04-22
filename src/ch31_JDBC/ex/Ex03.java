package ch31_JDBC.ex;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex03 {
    /*
        [연습문제]
        사용자 정보 업데이트
        요구사항: 사용자로부터 userId, username, password, age, email을 입력받아 해당 userId를 가진 사용자의 정보를 업데이트하세요.

        사용자로부터 다음 정보를 입력받습니다:
        userId: 업데이트할 사용자 ID
        username: 새 사용자 이름
        password: 새 비밀번호
        age: 새 나이
        email: 새 이메일 주소
        입력받은 정보를 데이터베이스의 users 테이블에 업데이트합니다.
     */
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String pw = "1234";

        String sql = "UPDATE users SET username = ?, password = ?, age =?, email = ? WHERE userId = ?";

        Scanner scanner = new Scanner(System.in);
        System.out.println("사용자 ID를 입력하세요: ");
        String userId = scanner.nextLine();
        System.out.println("새로운 이름을 입력하세요: ");
        String userName = scanner.nextLine();
        System.out.println("새로운 비밀번호를 입력하세요: ");
        String password = scanner.nextLine();
        System.out.println("변경할 나이를 입력하세요: ");
        int age = scanner.nextInt();
        scanner.nextLine();     // buffer 제거
        System.out.println("변경할 이메일 주소를 입력하세요: ");
        String email = scanner.nextLine();

        try (
                Connection conn = DriverManager.getConnection(url, user, pw);
                PreparedStatement pstmt = conn.prepareStatement(sql);
            ){
            pstmt.setString(1, userName);
            pstmt.setString(2, password);
            pstmt.setInt(3, age);
            pstmt.setString(4, email);
            pstmt.setString(5, userId);

            int rows = pstmt.executeUpdate();

            if (rows != 0) {
                System.out.println("데이터가 성공적으로 변경되었습니다.");
            }

        } catch (SQLException e) {
            System.out.println("오류 메세지: " + e.getMessage());
        }
    }
}
