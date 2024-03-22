package ch28_thread;

public class Thread08_StopThread {

    public static void main(String[] args) {
        SafeStopThread thread = new SafeStopThread();
        thread.start();

        thread.interrupt();             // 인터럽트 발생

        try {
            Thread.sleep(3000);     // 메인 스레드 3초 대기
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        thread.stopThread();            // 플래그를 통한 종료
    }

    static class SafeStopThread extends Thread {
        // 플래그를 사용한 종료 방법
        boolean exit = false;

        @Override
        public void run() {
            while (!exit) {
                // 스레드의 작업
                System.out.println("스레드 실행 중");
                try {
                    Thread.sleep(1000);     // 1초 대기
                } catch (InterruptedException e) {
                    // e.printStackTrace();          // 에러 메세지 출력
                    System.out.println("인터럽트가 발생하였습니다.");
                }

            }
            System.out.println("스레드가 종료되었습니다.");
        }

        public void stopThread() {
            exit = true;
        }
    }
}
