package ch28_thread;

import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class Thread21_SafeList {
    // 스레드 안전한 컬렉션
    // Thread Safety
        // : 여러 스레드에서 동시에 같은 코드 영역에 접근해도, 실행결과가 예측 가능하게, 올바르게 유지되는 것을 보장

    public static void main(String[] args) {
        // 안전한 스레드 생성
        // 방법1. Vector : 스레드 안전한 컬렉션
        List<Integer> safeList1 = new Vector<>();
        // 방법2. Collections.synchronizedList : 동기화 랩퍼
        List<Integer> safeList2 = Collections.synchronizedList(new Vector<>());
        // 방법3. CopyOnWriteArrayList : java.util.concurrent 패키지의 동기화 안전 컬렉션
        List<Integer> safeList3 = new CopyOnWriteArrayList<>();

        // 각각의 작업은 리스트에 1000 개를 추가
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                safeList1.add(i);
                safeList2.add(i);
                safeList3.add(i);
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

        System.out.println("1. safeList 리스트의 사이즈: " + safeList1.size());
        System.out.println("2. safeList 리스트의 사이즈: " + safeList1.size());
        System.out.println("3. safeList 리스트의 사이즈: " + safeList1.size());
    }
}
