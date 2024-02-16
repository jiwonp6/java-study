package ch8_class.ex2;
// #9 연습문제 (2024-02-16)
public class CarMain {
    public static void main(String[] args) {
        // 변수설정
        Car car1 = new Car();
        car1.brand = "현대";
        car1.model = "그랜저(2021)";
        car1.year = 2021;

        Car car2 = new Car();
        car2.brand = "기아";
        car2.model = "k7";
        car2.year = 2009;

        // 배열 생성 및 값 넣기
        Car[] cars = new Car[2];
        cars[0] = car1;
        cars[1] = car2;

        // 출력
        for (Car c : cars){
            System.out.printf("브랜드 : %s\t 모델명 : %s\t 출시년도 : %d\n", c.brand, c.model, c.year);
        }
    }
}
