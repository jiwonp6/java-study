package ch24_generic.generic_interface;

public class CarAgency implements Rentable<Car> {
    // 차 대여해주는 대리점 클래스

    // 타입 파라미터 T -> Car 으로 대체가 됨
    @Override
    public Car rent() {
        System.out.println("자동차를 대여합니다.");

        // 리턴 타입도 구체화된 클래스로 변경
        return new Car();
    }
}
