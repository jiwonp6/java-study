package ch17_polymorphism.abstraction;
// #16 추상화 (2024-02-26)
public class AnimalMain3 {
    public static void main(String[] args) {
        // 추상 클래스는 인스턴스화가 될 수 없다. => 생성 제약
        // Animal animal = new Animal();
        
        // 1. 추상적인 상위 메소드 생성 문제 해결
        Animal[] animals = {new Cat(), new Dog(), new Pig(), new Chicken()};

        // 2. 추상 메소드로 오버라이딩 되지 않는 문제 해결
        for (Animal animal : animals) {
            animal.sound();
        }
    }
}
