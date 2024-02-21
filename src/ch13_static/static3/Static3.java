package ch13_static.static3;
// #12 자바 메모리 영역 구조 (2024-02-21)
public class Static3 {
    public static void main(String[] args) {
        // ● 객체 생성해서 하는 방법  => 인스턴스 메소드
        StringDecoUtil util = new StringDecoUtil();     // 1. 객체 생성
        System.out.println(util.decorate1("안녕하세요1"));       // 2. 객체를 통해 메소드에 접근해서 사용

        // ● 객체 생성 없이 static 메소드 사용 => 클래스 메소드
        System.out.println(util.decorate2("안녕하세요2"));

    }
}
