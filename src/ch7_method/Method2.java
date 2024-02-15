package ch7_method;
// #8-2 메소드 (2024-02-15)
public class Method2 {
    public static void main(String[] args) {
        header();
        System.out.println("\t중간부\t");
        footer();
    }
    // 메소드 선언 : 매개변수(입력값)와 리턴(출력값)이 없는 메소드
    public static void header(){
        System.out.println("=== 자바 프로그램이 시작되었습니다. ===");
        return;     // 아무것도 반환하지 않고 함수를 종료한다.   -> void 타입의 경우 return이 생략 가능하다.
        // System.out.println("abcdefg");   -> return 이후의 코드는 반환하지 않는다.
    }

    public static void footer(){
        System.out.println("=== 자바 프로그램이 종료되었습니다. ===");
    }
}
