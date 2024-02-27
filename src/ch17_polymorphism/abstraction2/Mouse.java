package ch17_polymorphism.abstraction2;
// #16 추상화 (2024-02-27)
public class Mouse extends Animal{
    @Override
    public void sound() {
        System.out.println("찍찍");
    }

    @Override
    public void move() {
        System.out.println("쥐가 움직입니다.");
    }
}
