package ch16_inheritance.inheritance1;
// #15 상속 (2024-02-22)
public class Car {
    Car(){
        System.out.println("<Car의 생성자 호출>");
    }

    public void move(){
        System.out.println("차량이 이동합니다.");
    }
    public void parking(){
        System.out.println("차량이 주차중입니다.");
    }
    public void pushBreak(){
        System.out.println("브레이크를 밟습니다.");
    }
}
