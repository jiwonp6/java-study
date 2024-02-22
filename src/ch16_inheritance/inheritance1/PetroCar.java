package ch16_inheritance.inheritance1;
// #15 상속 (2024-02-22)
public class PetroCar extends Car{
    PetroCar(){
        System.out.println("PetroCar의 생성자 호출");
    }
    public void fillUp(){
        System.out.println("가솔린 차의 기름을 주유합니다.");
    }
}
