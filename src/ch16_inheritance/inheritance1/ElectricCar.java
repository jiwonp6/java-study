package ch16_inheritance.inheritance1;
// #15 상속 (2024-02-22)
public class ElectricCar extends Car{
    ElectricCar(){
        System.out.println("ElectricCar의 생성자 호출");
    }
    public void charge(){
        System.out.println("전기차 배터리를 충전합니다.");
    }
}
