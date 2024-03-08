package quiz.quiz2.q2;

public class Quiz2 {
    public static void main(String[] args) {
        Transport car = new Car();
        Transport bicycle = new Bicycle();
        Transport train = new Train();

        car.move();
        bicycle.move();
        train.move();
    }
}
