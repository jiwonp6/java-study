package ch18_interface.interface6.before;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Avante avante = new Avante();
        Sonata sonata = new Sonata();

        // 아반떼 탑승 및 시운전
        driver.setAvante(avante);
        driver.drive();

        // 아반떼 내림
        driver.setAvante(null);

        // 소나타 탑승 및 시운전
        driver.setSonata(sonata);
        driver.drive();
    }
}
