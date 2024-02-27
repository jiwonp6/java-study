package ch18_interface.interface3;
// #17 인터페이스 (2024-02-27)

public class AnimalMain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        sound(cat);
        sound(dog);

        move(cat);
        move(dog);

        charming(cat);
        charming(dog);

    }
    // 매개변수로 Animal 인터페이스를 받는다.
    // 인터페이스를 구현한 클래스들을 다형적 매개변수로 받을 수 있다.
    static void sound(Animal animal){
        animal.sound();
    }
    static void move(Animal animal){
        animal.move();
    }
    static void charming(Pet pet){
        pet.charming();
    }
}
