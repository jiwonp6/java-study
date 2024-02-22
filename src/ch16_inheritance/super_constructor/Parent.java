package ch16_inheritance.super_constructor;
// #15 상속 (2024-02-22)
public class Parent extends Grand{
    // 기본 생성자는 매개변수가 있는 생성자 정의 시 생략된다.
    public Parent(int value) {
        this(value, null);      // this를 통해서 다른 생성자가 호출될 때, 그 생성자에서 super()가 있으면 생략 가능하다.
        // super();    // 부모생성자 호출 (생략가능)
        System.out.println("부모 생성자" + value);
    }

    // 생성자 오버로딩 (overloading)
    public Parent(int value, String str) {
        System.out.println("부모 생성자" + value + str);
    }
}
