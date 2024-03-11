package ch24_generic.generic_interface;

public class Main {
    public static void main(String[] args) {
        // 제네릭을 지정하지 않은 경우 : (다운 캐스팅이 필요)
        Rentable homeAgency = new HomeAgency();
        Home rentHome1 = (Home) homeAgency.rent();   // Rentable로 받으면 캐스팅 필요

        // 구현 클래스를 타입으로 지정한 경우
        HomeAgency newHomeAgency = new HomeAgency();
        Home rentHome2 = newHomeAgency.rent();

        // 제네릭으로 타입을 구체화한 경우
        Rentable<Car> carAgency = new CarAgency();
        Car rentCar = carAgency.rent();

    }
}
