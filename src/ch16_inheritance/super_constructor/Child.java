package ch16_inheritance.super_constructor;
// #15 상속 (2024-02-22)
public class Child extends Parent {
    // 상속을 받으면, 생성자의 첫 줄에 super( .. )를 사용해서 부모 클래스 생성자를 호출해야 한다.
    // 매개변수가 없는 생성자(기본 생성자)의 경우 super()의 생략이 가능하다.
//    public Child() {
//        super(100);    // 부모생성자 호출 -> 매개변수가 있기 때문에 생략 불가능
//        System.out.println("자식 생성자");
//    }
    public Child() {
        super(100, "aaa");    // 부모생성자 호출 -> 매개변수가 있기 때문에 생략 불가능
        System.out.println("자식 생성자");
    }
}
