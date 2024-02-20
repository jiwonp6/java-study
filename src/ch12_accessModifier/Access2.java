package ch12_accessModifier;
// #11 접근제한자 (2024-02-20)
import ch12_accessModifier.c.C;

public class Access2 {
    public static void main(String[] args) {
        Car car = new Car();
        car.speedUp();
        car.speedUp();
        car.speedDown();
        car.speedUp();
        car.printSpeed();

        // get 사용 -> 현재 속도를 가져온다.
        int currentSpeed = car.getSpeed();
        System.out.println("지금 속도 : " + currentSpeed);

        // set 사용 -> 속도 설정
        car.setSpeed(119);

        // get 사용 -> 현재 속도를 가져온다.
        currentSpeed = car.getSpeed();
        System.out.println("지금 속도 : " + currentSpeed);

    }
}
