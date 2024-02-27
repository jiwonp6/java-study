package ch17_polymorphism.abstraction1;
// #16 추상화 (2024-02-26)
public class Chicken extends Animal {
    @Override
    public void sound(){    // 추상메소드를 상속 받은 하위 클래스는 추상 메소드 구현이 강제된다.
        System.out.println("꼬끼오");
    }
}
