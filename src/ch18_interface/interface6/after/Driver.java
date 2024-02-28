package ch18_interface.interface6.after;

public class Driver {
    // 필드 - 구체적인 것에 의존하는 대신 추상적인 것(인터페이스, 역할)에 의존
    private Car car;

    // 메소드

    // setter - 자동차를 설정
    public void setCar(Car car) {
        this.car = car;
    }

    // 운전
    public void drive(){
        // 구체적인 것 대신 추상적인 것에 의존 => DIP
        // 차량이 추가될 때마다 코드가 변경이 되지 않는다. => OCP
        car.onEnglish();
        car.pressAccel();
        car.pressBreak();
        car.offEnglish();
    }
}
