package ch28_thread;

public class Thread09_MultiThread {
    // 멀티 스레드는 객체를 공유해서 작업을 수행할 수 있음
    // 하나의 자원을 여러 개의 스레드가 공유해서 작업하는 경우
    // Race Condition (경쟁 상태) => 예상치 못한 결과 발생
    public static void main(String[] args) {
        Thread increment = new Thread(() -> {
            for (int i = 0; i < 100_000; i++) {
                count++;
            }
            System.out.println("증가 = " + count);
        });

        Thread decrement = new Thread(() -> {
            for (int i = 0; i < 100_000; i++) {
                count--;
            }
            System.out.println("감소 = " + count);
        });

        increment.start();
        decrement.start();

        try {
            Thread.sleep(2000);
            System.out.println("count : " + count);     // count : 27867
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    static int count = 0;
}
