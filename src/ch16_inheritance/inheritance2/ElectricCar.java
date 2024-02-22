package ch16_inheritance.inheritance2;


// #15 상속 (2024-02-22)
public class ElectricCar extends Car {
    // 부모요소를 덮어쓸 때 @Override라는 특별한 주석을 붙인다.
    // Override : 메서드 재정의
    @Override
    public void move(){
        System.out.println("차량이 조용하게 이동합니다.");
    }

    public void charge(){
        System.out.println("전기차 배터리를 충전합니다.");
    }
}
