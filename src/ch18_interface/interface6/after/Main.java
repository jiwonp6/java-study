package ch18_interface.interface6.after;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver();
        // 인터페이스 타입 = 구체적인 객체
        Car avante = new Avante();

        driver.setCar(avante);
        driver.drive();

        // 차량이 추가될 경우 => 확장에는 열려있다. OCP
        // 메인 메소드의 실행문 이외의 코드 변경 필요 X
        // 클라이언트 쪽 코드(Driver)는 수정 필요 X => 수정에 닫혀있다. OCP
        Car sonata = new Sonata();
        driver.setCar(sonata);
        driver.drive();

    }
}
