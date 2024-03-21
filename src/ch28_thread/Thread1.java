package ch28_thread;

public class Thread1 {
    public static void main(String[] args) {
        // 스레드 생성
            // : 스레드를 실행할 때는 반드시 run 이 아닌 start 사용

        // 1. Thread 상속
            // : 단일 상속만 허용하기 때문에 다른 클래스를 상속받을 경우 사용 X
        MyThread myThread = new MyThread();
        // start 메소드 호출 : 스레드 시작
        myThread.start();

        // 2. Runnable 구현
            // : 다른 클래스를 상속 받아도 스레드 생성 가능
        // 1) Thread 에 매개변수로 Runnable 구현 객체를 전달
        MyRunnable myRunnable = new MyRunnable();
        Thread runnableThread = new Thread(myRunnable);
        runnableThread.start();

        // 2) 매개변수에 Runnable 익명 객체
        Thread threadAnonymous = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("안녕하세요, 익명객체 스레드예요.");
            }
        });
        threadAnonymous.start();

        // 3) 매개변수 Runnable 람다식
        Thread threadLambda = new Thread( () -> System.out.println("안녕하세요, 람다 스레드예요."));
        threadLambda.start();

    }

}
// 1. 스레드 상속 받는 방법
class MyThread extends Thread {
    // Thread 클래스를 상속받아 run 메소드 오버라이딩
    @Override
    public void run() {
        // 스레드가 실행할 코드
        System.out.println("안녕하세요, 스레드예요.");

    }
}

// 2. Runnable 인터페이스를 상속받는 방법
class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("안녕하세요, Runnable 스레드예요.");
    }
}

