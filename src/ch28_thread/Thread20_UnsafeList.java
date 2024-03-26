package ch28_thread;

import java.util.ArrayList;
import java.util.List;

public class Thread20_UnsafeList {
    // 스레드 안전한 컬렉션
    // Thread Safety
        // : 여러 스레드에서 동시에 같은 코드 영역에 접근해도, 실행결과가 예측 가능하게, 올바르게 유지되는 것을 보장

    public static void main(String[] args) {
        // 스레드 안전하지 않은 컬렉션
        List<Integer> unsafeList = new ArrayList<>();

        // 각각의 작업은 리스트에 1000 개를 추가
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                unsafeList.add(i);
            }
        };

        // 두 개의 스레드에서 각 task 를 수행
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        // 스레드 시작(new -> runnable)
        thread1.start();
        thread2.start();

        // 메인스레드에서 각 스레듣가 종료하기를 기다림
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("unsafeList 리스트의 사이즈: " + unsafeList.size());
    }
}
