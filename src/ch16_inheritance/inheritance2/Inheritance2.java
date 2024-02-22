package ch16_inheritance.inheritance2;

// #15 상속 (2024-02-22)
public class Inheritance2 {
    public static void main(String[] args) {
        System.out.println("<PetroCar>");
        PetroCar petroCar = new PetroCar();
        petroCar.move();

        System.out.println("<ElectricCar>");
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
    }
}
