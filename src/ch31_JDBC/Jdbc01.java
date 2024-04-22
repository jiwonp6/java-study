package ch31_JDBC;

public class Jdbc01 {
    // 연결하기
    public static void main(String[] args) {
        // JDBC 드라이버가 성공적으로 로딩되는지 확인
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("성공적으로 드라이버 호출");
        } catch (ClassNotFoundException e) {
            System.out.println("드라이버 클래스를 찾을 수 없습니다.");
            throw new RuntimeException(e);
        }
    }
}
