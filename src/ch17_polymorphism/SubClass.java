package ch17_polymorphism;
// #16 다형성 (2024-02-26)
public class SubClass extends SuperClass{
    @Override
    public void method(){
        System.out.println("자식 클래스에서 오버라이팅 된 메소드");
    }
    public  void subMethod(){
        System.out.println("자식 클래스의 메소드");
    }
}
