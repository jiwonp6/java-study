package ch13_static.static4;
// #12 자바 메모리 영역 구조 (2024-02-21)
public class Static4 {
    public static void main(String[] args) {
        // 객체 생성없이 정적 호출
        StaticTest.staticInnerCall();

        // 객체 생성없이는 인스턴스 메소드 호출 불가

        // 객체 생성하여 인스턴스 호출
        StaticTest test = new StaticTest();
        test.innerCall();           // 인스턴스 호출
        test.staticInnerCall();     // 정적 호출, 컴파일 에러는 X, but, 선호되지 않음
            // 경고 => static 메소드 호출을 인스턴스에서 하는 방식을 권장하지 않음

    }
}
