package ch17_polymorphism.abstraction1;
// #16 추상화 (2024-02-26)

// 추상 클래스 : 부모 클래스는 제공하지만 실제 생성되면 안되는 클래스
public abstract class Animal {
    // 추상 메소드 : 추상적인 개념을 제공하는 메소드, 실체가 없고, 메소드 본문이 존재 X
        // => 상속받는 자식 클래스가 오버라이딩해서 사용해야 한다.
        // => 반드시 추상 클래스 내에서 정의 가능
        // => 상속받는 하위 클래스는 반드시 추상 메소드를 구현해야 한다.(강제)
    public abstract void sound();
    
}
