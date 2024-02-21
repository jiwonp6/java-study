package ch13_static.static4;
// #12 자바 메모리 영역 구조 (2024-02-21)
public class StaticTest {
    // 필드
    private int instanceVariable;       // 인스턴스 변수
    private static int classVariable;   // 클래스 변수

    // 생성자


    // 메소드
    // 클래스 메소드(= static 메소드)
    public static void staticInnerCall(){
        // instanceVariable++; // 에러발생 -> static 메소드에서 인스턴스 변수 접근 불가
        classVariable++;                  // static 메소드에서 클래스 변수 접근 가능

        // instanceMethod();   // 인스턴스 메소드 접근 불가
        classMethod();      // 클래스 메소드 접근 가능
    }
    // 인스턴스 메소드
    public void innerCall(){
        instanceVariable++;     // 인스턴스 메소드에서 인스턴스 변수 접근 가능
        classVariable++;        // 인스턴스 메소드에서 클래스 변수 접근 가능

        instanceMethod();   // 호출 가능
        classMethod();      // 호출 가능
    }

    // private
    private static void classMethod(){
        // System.out.println(instanceVariable); // 에러발생 -> static 메소드에서 인스턴스 변수 접근 불가
        System.out.println(classVariable);
    }
    private void instanceMethod(){
        System.out.println(instanceVariable);
        System.out.println(classVariable);
    }
}
