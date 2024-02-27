package ch17_polymorphism.abstraction2;
// #16 추상화 (2024-02-27)
public abstract class Animal {
    // 순수 추상 클래스 (본문 가지는 메소드가 있으면 순수 추상 메소드가 아님)
    // 모든 메소드가 추상 메소드인 클래스
    // 실행 로직, 구현부는 전혀 가지고 있지 않고, 껍데기 역할만 제공
    // Java에서는 순수 추상 클래스 => 인터페이스 개념으로 사용한다.
    
    // 추상 메소드
    public abstract void sound();
    public abstract void move();

    // 일반 메소드 : 본문을 가지는 메소드
    public void eat(){
        System.out.println("동물이 먹습니다.");
    }

}
