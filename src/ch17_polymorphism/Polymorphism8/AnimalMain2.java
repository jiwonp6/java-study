package ch17_polymorphism.Polymorphism8;
// #16 다형성 (2024-02-26)
public class AnimalMain2 {
    public static void main(String[] args) {
        // 문제점
        // 1. 동물이라는 추상적 개념을 직접 생성해서 사용할 수 있는 문제가 생긴다.
        Animal a = new Animal();

        // 2. 상속받은 메소드에서 해당 메소드를 오버라이딩하지 않은 문제
        Animal[] animals = {new Dog(), new Cat(), new Pig(), a, new Chicken()};     // => 업 캐스팅

        for (Animal animal : animals) {
            animal.sound();
        }
    }
}
