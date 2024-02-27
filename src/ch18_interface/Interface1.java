package ch18_interface;
// #17 인터페이스 (2024-02-27)
public interface Interface1 {
    // 인터페이스 선언 : 선언부에 class 대신 interface 작성
    // 인터페이스의 특징 : 추상 메소드와 상수로 구성된다.
    // (Java 8버전 이후에는 본문을 가진 특수 메소드 구현 가능)
    // 인스턴스 생성 불가
    // 상속받은 클래스는 모든 메소드를 오버라이딩 해야 한다.

    public static final double PI = 3.141592;   // 상수
    double PI2 = 3.141592;   // 인터페이스에서 상수 필드는 public static final 생략 가능
    // => 인터페이스의 모든 필드는 상수!!!

    // 추상 메소드 (public abstract 생략)
        // : 상속받은 클래스가 인터페이스에서 구성된 모든 추상메소드를 구현해야 한다.
    // 메소드 선언부만 작성하고 본문 및 접근제어자는 생략
    void turnOn();
    void turnOff();

}
