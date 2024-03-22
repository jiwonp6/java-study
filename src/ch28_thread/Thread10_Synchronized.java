package ch28_thread;

public class Thread10_Synchronized {
    // 동기화 (Synchronized)
        // : 해당 블록에 대해 한 번에 하나의 스레드만 접근할 수 있도록 하여
        // 경쟁상태를 예방할 수 있다. (데이터 손실, 오류를 막을 수 있음)
    static int count = 0;
    // 동기화를 위한 자물쇠 객체
    static final Object lock = new Object();

    public static void main(String[] args) {
        Thread increment = new Thread(() -> {
            for (int i = 0; i < 100_000; i++) {
                synchronized (lock){    // 동기화 블록
                    count++;
                }
            }
        });

        Thread decrement = new Thread(() -> {
            for (int i = 0; i < 100_000; i++) {
                synchronized (lock){
                    count--;
                }
            }
        });

        increment.start();
        decrement.start();

        try {
            Thread.sleep(2000);
            System.out.println("count : " + count);     // count : 0
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
