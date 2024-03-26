package ch28_thread;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Thread23_SafeMap {
    public static void main(String[] args) {
        // 안전한 스레드
        // 방법1. Hashtable : 스레드 안전한 경우
        Map<String, Integer> safeHashMap1 = new Hashtable<>();
        // 방법2. ConcurrentHashMap : 스레드 안전 + 성능 향상
        Map<String, Integer> safeHashMap2 = new ConcurrentHashMap<>();
        // 방법3. Collections.synchronizedMap : 동기화 랩퍼
        Map<String, Integer> safeHashMap3 = Collections.synchronizedMap(new HashMap<>());

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                safeHashMap1.put("key" + i, i);
                safeHashMap2.put("key" + i, i);
                safeHashMap3.put("key" + i, i);
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

        System.out.println("1. safeHashMap 맵의 사이즈 : " + safeHashMap1.size());
        System.out.println("2. safeHashMap 맵의 사이즈 : " + safeHashMap2.size());
        System.out.println("3. safeHashMap 맵의 사이즈 : " + safeHashMap3.size());
    }
}
