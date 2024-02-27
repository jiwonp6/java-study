package ch17_polymorphism.abstraction2;
// #16 추상화 (2024-02-27)
public class AnimalMain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Mouse mouse = new Mouse();
        Tiger tiger = new Tiger();

        sound(cat);
        sound(dog);
        sound(mouse);
        sound(tiger);

        move(cat);
        move(dog);
        move(mouse);
        move(tiger);
    }
    // 스태틱 메소드로 매개변수의 다형성 구현
    static void sound(Animal animal){
        animal.sound();
    }
    static void move(Animal animal){
        animal.move();
    }
}
