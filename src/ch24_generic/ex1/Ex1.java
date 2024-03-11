package ch24_generic.ex1;

public class Ex1 {
    /*
        <제네릭을 활용한 범용 Pair 클래스 구현>
        [문제 설명]
        두 개의 객체를 한 쌍으로 관리할 수 있는 제네릭 클래스 Pair를 구현하세요.
        이 클래스는 두 객체의 타입이 서로 다를 수 있도록 제네릭을 활용해야 합니다.
        Pair 클래스는 두 객체에 대해 getter 메소드를 제공해야 하며, 이 두 객체는 생성 시점에 초기화되어야 합니다.

        [요구 사항]
        Pair 클래스 정의: 두 개의 제네릭 타입 매개변수(K와 V)를 갖는 Pair 클래스를 정의합니다.
        생성자 구현: Pair 객체를 생성할 때, 두 객체를 매개변수로 받아 초기화하는 생성자를 구현합니다.
        Getter 메소드 제공: 두 객체 각각에 대한 getter 메소드 getKey()와 getValue()를 구현합니다.

        [출력 예시]
        Pair 1: 1 - Apple
        Pair 2: KeyExists - true
     */
    public static void main(String[] args) {
        // Integer와 String 타입을 가진 Pair 객체 생성
        Pair<Integer, String> pair1 = new Pair<>(1, "Apple");
        System.out.println("Pair 1: " + pair1.getKey() + " - " + pair1.getValue());

        // String과 Boolean 타입을 가진 Pair 객체 생성
        Pair<String, Boolean> pair2 = new Pair<>("KeyExists", true);
        System.out.println("Pair 2: " + pair2.getKey() + " - " + pair2.getValue());


    }
}
