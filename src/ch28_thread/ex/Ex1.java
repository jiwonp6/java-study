package ch28_thread.ex;

public class Ex1 {
    /*
        <경주 게임 시뮬레이션>
        3대의 차량(스레드)이 경주를 합니다.
        각 차량은 출발 후 랜덤하게 0~1초 사이에 한 번씩 메시지를 5번 출력한 후, 경주를 마칩니다.

        [출력 예시]
        차량 1이 출발했습니다.
        차량 2이 출발했습니다.
        차량 3이 출발했습니다.
        차량 3가 100m를 달렸습니다.
        차량 2가 100m를 달렸습니다.
        차량 1가 100m를 달렸습니다.
        차량 2가 200m를 달렸습니다.
        ...
        차량 3가 400m를 달렸습니다.
        차량 3가 500m를 달렸습니다.
        차량 3가 결승선을 통과했습니다!
        차량 2가 결승선을 통과했습니다!
     */
    public static void main(String[] args) {
        Thread car1 = new Thread(new Car( 1));
        Thread car2 = new Thread(new Car( 2));
        Thread car3 = new Thread(new Car( 3));

        car1.start();
        car2.start();
        car3.start();
    }
}

class Car implements Runnable{
    int carNum;

    public Car(int carNum) {
        this.carNum = carNum;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.printf("차량 %d이 %sm를 달렸습니다. \n", carNum, (i + 1) * 100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.printf("차량 %d이 결승선을 통과했습니다! \n", carNum);
    }
}
