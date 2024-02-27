package ch17_polymorphism.abstraction2;
// #16 추상화 (2024-02-27)
public class Tiger extends Animal{
    @Override
    public void sound() {
        System.out.println("어흥");
    }
    @Override
    public void move() {
        System.out.println("호랑이가 움직입니다.");
    }

    // 구현 여부가 선택적인 일반 메소드
    @Override
    public void eat() {
        System.out.println("호랑이가 고기를 먹습니다.");
    }
}
