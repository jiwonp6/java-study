package ch20_nested.ex.ex3;

public class Ex3 {
    /*
        Tire와 Engine이 멤버 클래스로 선언이 되어있습니다.
        Main 클래스를 생성하여 멤버 클래스의 객체를 생성하는 코드를 작성해주세요.
        public class Car {
            class Tire {}
            static class Engine {}
        }
     */
    public static void main(String[] args) {
        Car car = new Car();

        // 타이어 생성
        Car.Tire tire = car.new Tire();

        // 엔진 생성
        Car.Engine engine = new Car.Engine();
    }
}
