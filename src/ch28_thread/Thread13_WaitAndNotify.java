package ch28_thread;

public class Thread13_WaitAndNotify {
    // wait, notify
        // : 스레드 간의 통신을 위해 사용되는 메커니즘
        // Object 클래스의 메소드 일부로 모든 객체에서 사용 O
        // 동기화된 블럭 또는 동기화 메소드에서만 호출 가능

    // wait() : 대기상태로 만듦
    // notify() : 대기 중인 스레드 하나를 깨움
    // notifyAll() : 대기 중인 모든 스레드를 깨움
    public static void main(String[] args) {
        // 공유 객체(lock) : 두 스레드(스레드 1, 2)가 모두 사용하는 객체
        Object lock = new Object();

        Thread thread1 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("1. [스레드 1] lock 을 사용가능할 때까지 대기합니다.");
                // ★ (1. 후 상태) Runnable -> Waiting
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                // ★ (4. 전 상태) 알림을 받고 다른 스레드의 동기화 블록이 종료되면 실행 재개
                System.out.println("4. [스레드 1] 알림 받았습니다.");
                // ★ (4. 후 상태) 실행 재개 후 스레드 1도 종료 (Terminated)
            }
        });

        Thread thread2 = new Thread(() -> {
            // 스레드 1이 대기상태로 들어가고 스레드2가 lock(공유객체) 을 사용할 수 있게 됨
            synchronized (lock) {
                System.out.println("2. [스레드 2] 알립니다.");
                // ★ (2. 후 상태) lock 객체를 기다리고 있는 대기 중인 스레드에게 알림
                lock.notify();
                // ★ (3. 전 상태) notify 호출 후에도 동기화 블록 종료할 때까지는 계속 사용
                System.out.println("3. [스레드 2] 알리고 동기화 블록 종료 중입니다.");
                // ★ (3. 후 상태) 계속 사용하다 스레드 2 종료 (Terminated)
            }
        });

        thread1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread2.start();

    }
}