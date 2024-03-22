package ch28_thread;

public class Thread12_Volatile {
    // volatile
        // : 모든 스레드가 해당 변수의 최신 업데이트된 값을 볼 수 있도록 해줌 (변경된 값이 가시적 visibility)

    // <종료 플래그>
        // : 메인 스레드에서는 변경, 새 스레드에서는 참조
    // static boolean stop = false;
    static volatile boolean stop = false;

    public static void main(String[] args) {
        // 자원은 하나 스레드는 두 개

        // <새로운 스레드>
        // 숫자 세기
        new Thread(() -> {
            int count = 0;
            while (!stop) {
                count++;
                // ※ 로그를 주석처리 후 실행 -> stop 플래그 반영 X
                    // 1. 반복문 실행하면서 stop(false)을 참조하기 위해 stop 값을 cache 에 저장
                    // 2. stop 이 메모리에서 false -> true 로 바뀜
                    // 3. 반복문이 메모리의 stop 값이 아니라 계속 cache 의 stop(false) 값을 참조해서 종료X
                    // => 출력문이 메모리 배리어 역할 (I/O) 출력을 하면서 stop 변수의 가시성을 강제 -> 신뢰할 수 있는 동기화 방법 X
                    // => 종료 플래그 stop 선언시 "volatile" 처리 -> 해당 변수의 최신값 참조하도록 해줌!
                //System.out.println(count);
            }
            System.out.println("스레드가 종료되었습니다.");
        }).start();

        // <메인 스레드>
        // 1초 경과
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // 멈추기
        stop = true;    // 종료 플래그
    }
}
