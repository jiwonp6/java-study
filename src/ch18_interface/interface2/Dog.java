package ch18_interface.interface2;
// #17 인터페이스 (2024-02-27)
public class Dog implements Animal{
    // 인터페이스를 상속 받을 때는 extends(확장)가 아닌 implements(구현)라는 키워드를 사용
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("강아지가 움직입니다.");
    }
}
