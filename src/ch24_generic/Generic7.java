package ch24_generic;

import java.util.List;

public class Generic7 {
    // 제네릭의 타입 경계(type bounds)
    // bounded type parameter
    // 하한(lower) 경계

    class Animal {
        void feed(){}
    }

    class Dog extends Animal {}
    class WildDog extends Animal {}

    class AnimalFeeder {
        // Dog 보다 상위 클래스 객체에만 동작
        // wildDog 또는 Dog 의 자식 객체를 제외한 Dog 와, Animal 타입에만 적용
        // 특정 클래스의 상위 클래스로 제한하는 경우, 컬렉션 프레임워크에서 안전하게 타입을 추가하는 경우 등에 사용
        public static void feedAnimals(List<? super Dog> animals){
            for (Object animal : animals) {
                ((Animal) animal).feed();
            }
        }
    }

}
