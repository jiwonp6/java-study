package ch17_polymorphism.ex1;

public class Car{
    // 필드 (Composition 포함 관계) ~ have 관계 : Car has Tires.
    Tire frontRight = new Tire("frontRight", 4);
    Tire frontLeft = new Tire("frontLeft", 5);
    Tire backRight = new Tire("backRight", 3);
    Tire backLeft = new Tire("backLeft", 2);

    // 메소드
    int run(){
        if (!frontRight.roll()){
            stop();
            return 1;
        }
        if (!frontLeft.roll()){
            stop();
            return 2;
        }
        if (!backRight.roll()){
            stop();
            return 3;
        }
        if (!backLeft.roll()){
            stop();
            return 4;
        }
        System.out.println("자동차가 달립니다.");
        return 0;
    }
    void stop(){
        System.out.println("자동차가 멈춥니다.");
    }
}
