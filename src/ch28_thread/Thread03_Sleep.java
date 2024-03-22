package ch28_thread;

public class Thread03_Sleep {
    // sleep 메소드
        // : 특정 시간 동안 스레드를 일시 정지
    // milli(1/1000)초
    // InterruptedException <- checked 예외처리 필요
    public static void main(String[] args) {
        // 메인 스레드와 각각의 스레드는 실행 위치와 관계 없이 동시에 수행
        // 사용자 정의 스레드
        Thread thread = new Thread(
                () -> {
                    for (int i = 0; i < 5; i++) {
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("zzz...");
                    }
                }
        );
        thread.start();

        // 메인 스레드
        try {
            Thread.sleep(1000);
            System.out.println("기상");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
