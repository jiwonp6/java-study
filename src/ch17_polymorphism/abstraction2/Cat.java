package ch17_polymorphism.abstraction2;
// #16 추상화 (2024-02-27)
public class Cat extends Animal{

    @Override
    public void sound() {
        System.out.println("냐옹");
    }

    @Override
    public void move() {
        System.out.println("고양이가 움직입니다.");
    }
}
