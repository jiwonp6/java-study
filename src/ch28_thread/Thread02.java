package ch28_thread;

public class Thread02 {
    public static void main(String[] args) {
        // 스레드 호출 (run/start)
        MyThread2 myThread= new MyThread2();
        MyRunnable2 myRunnable = new MyRunnable2();
        Thread runnableThread = new Thread(myRunnable);
        Thread threadAnonymous = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 30; i++) {
                    System.out.println("익명!");
                }
            }
        });
        Thread threadLambda = new Thread(

                () -> {
                    for (int i = 0; i < 30; i++) {
                        System.out.println("람다!");
                    }
                }
        );

        // run 메서드 직접 호출
            // => 일반메서드 호출과 마찬가지로 main 메서드에서 직접 순차적으로 실행
        myThread.run();
        runnableThread.run();
        threadAnonymous.run();
        threadLambda.run();

        // start 메서드 호출
            // => 순서 X, 새로운 스레드가 생성되고, 별도의 실행 흐름에서 run() 메소드 실행
            // 동시성을 가지고 멀티 스레딩
        myThread.start();
        runnableThread.start();
        threadAnonymous.start();
        threadLambda.start();

        // start 메소드는 각 스레드 인스턴스에 대해 한 번만 호출 가능
        // 두 번 이상 -> IllegalThreadStateException 발생
        // myThread.start();

    }
}
class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println("상속!");
        }
    }
}
class MyRunnable2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println("러너!");
        }
    }
}
