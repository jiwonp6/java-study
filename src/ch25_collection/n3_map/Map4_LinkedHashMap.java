package ch25_collection.n3_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map4_LinkedHashMap {
    /*
        LinkedHashMap
            : 순서가 존재하는 HashMap
        - 순서를 유지해야 하는 로그 정보 등에 사용된다.
        - 삽입 순서를 기억해야 할 필요가 있을 경우.
     */
    public static void main(String[] args) {
        // Map 인터페이스 추상화를 통해 필요한 자료구조로 변경
        // 성능 : HashMap 과 배슷한 성능을 갖지만, 순서 정보를 유지하는데 간접비용(Overhead)가 발생한다.


        HashMap<String, Integer> hashMap = new HashMap<>();
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        hashMap.put("해쉬맵은", 1);
        hashMap.put("순서를", 2);
        hashMap.put("보장하지", 3);
        hashMap.put("않아요.", 4);

        linkedHashMap.put("링크드", 1);
        linkedHashMap.put("해쉬맵은", 2);
        linkedHashMap.put("순서가", 3);
        linkedHashMap.put("보장됩니다.", 4);

        // 출력
        System.out.println("< 해쉬맵 >");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry);

        }

        System.out.println("< 링크드해쉬맵 >");
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry);
        }

        // LRU (Least Recently Used) Cache
            // : 가장 최근에 접근한 순서에 따라 순서 요소 재배치
        // LinkedHashMap 생성자에서 accessOrder 를 true 로 설정할 경우
        LinkedHashMap<String, Integer> lruCasche = new LinkedHashMap<>(16, 0.75f, true);

        lruCasche.put("이미지1", 1);
        lruCasche.put("한글문서2", 2);
        lruCasche.put("워드파일3", 3);

        lruCasche.get("한글문서2");     // 조회

        System.out.println("< LRU >");
        for (Map.Entry<String, Integer> entry : lruCasche.entrySet()) {     // 최근에 사용한 접근요소가 마지막으로 옮겨짐
            System.out.println(entry);
        }

    }
}
