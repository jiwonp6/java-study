package ch16_inheritance.inheritance1;
// #15 상속 (2024-02-22)
public class HydroCar extends Car{
    HydroCar(){
        System.out.println("HydroCarr의 생성자 호출");
    }

    public void fillHydro(){
        System.out.println("수소차가 충전중입니다.");
    }
}
