package ch16_inheritance.inheritance1;
// #15 상속 (2024-02-22)
public class Inheritance1 {
    public static void main(String[] args) {

        // 자식 객체를 생성하면, 상속관계에 있는 부모까지 포함해서 인스턴스가 생성된다.
        // 자식객체는 자기자신과 부모까지 2가지의 클래스 정보가 공존
        // petroCar.move()를 호출하면 먼저 참조된 주소로 접근하여
        // 자식타입(자기자신)을 찾아서 메소드가 존재하는지 찾고,
        // 없으면, 부모타입에서 찾아서 메소드를 호출한다.
        PetroCar petroCar = new PetroCar();
        petroCar.move();
        petroCar.parking();
        petroCar.fillUp();
        petroCar.pushBreak();

        System.out.println(" ");

        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.parking();
        electricCar.charge();
        electricCar.pushBreak();

        System.out.println(" ");

        HydroCar hydroCar = new HydroCar();
        hydroCar.move();
        hydroCar.parking();
        hydroCar.fillHydro();
        hydroCar.pushBreak();
    }
}
