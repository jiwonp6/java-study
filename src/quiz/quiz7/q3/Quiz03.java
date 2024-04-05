package quiz.quiz7.q3;

public class Quiz03 {
    public static void main(String[] args) {
        Thread car1 = new Thread(new Car(1));
        Thread car2 = new Thread(new Car(2));
        Thread car3 = new Thread(new Car(3));

        car1.start();
        car2.start();
        car3.start();

    }

    static class Car implements Runnable{
        private int carNum;

        public Car(int carNum) {
            this.carNum = carNum;
        }

        @Override
        public void run() {
            int distance = 0;
            String ready = "차량" + carNum + "이 출발했습니다.";
            String complete = "차량" + carNum + "이 결승선을 통과했습니다!";

            System.out.println(ready);

            for (int i = 1; i < 10; i++) {
                distance = i * 100;
                try {
                    Thread.sleep(1000);
                    System.out.println("차량" + carNum + "이 " + distance +"m를 달렸습니다.");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            System.out.println(complete);

        }
    }
}
