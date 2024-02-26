package ch17_polymorphism;

// #16 다형성 (2024-02-26)
public class Polymorphism7 {
    public static void main(String[] args) {
        // 1. 부모 타입 변수에서 부모 타입 객체 생성 시
        SuperClass superClass = new SuperClass();
        superClass.superMethod();       // 부모 클래스의 메소드 호출

        // 2. 자식 타입 변수에서 자식 타입 객체
        SubClass subClass = new SubClass();
        subClass.method();      // 자식 클래스에서 오버라이팅 된 메소드 호출

        // 3. 부모 타입 변수에서 자식 타입 객체 참조 시 (다형적 참조)
        SuperClass polymorph = new SubClass();
        polymorph.method();     // 부모 타입 변수지만, 자식 클래스에서 오버라이팅 된 메소드가 호출된다.
        // ★ 오버라이딩 된 메소드는 항상 우선권을 가진다.

    }
}
