package ch28_thread;

import java.util.HashMap;
import java.util.Map;

public class Thread22_UnsafeMap {
    public static void main(String[] args) {
        // 스레드 안전하지 않은 경우
        Map<String, Integer> unsafeHashMap = new HashMap<>();

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                unsafeHashMap.put("key" + i, i);
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(task);

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // 스레드 안전하지 않으므로 맵의 사이즈가 객체보다 더 많이 계산됨.
        System.out.println("unsafeHashMap 맵의 사이즈 : " + unsafeHashMap.size());
    }
}
