package ch17_polymorphism.abstraction2;
// #16 추상화 (2024-02-27)
public class Dog extends Animal{
    @Override
    public void sound() {
        System.out.println("월월");
    }

    @Override
    public void move() {
        System.out.println("강아지가 움직입니다.,");
    }
}
