package ch25_collection.n3_map;

import java.util.*;

public class Map1_HashMap1 {

    /*
        Map
            : Key 와 Value 의 값으로 구성되는 Map.Entry 객체를 저장하는 구조
        Entry
            : Map 인터페이스 내부에 선언된 중첩 인터페이스

        - Key 는 중복 저장될 수 없으며, Value 는 중복 저장될 수 있음.
        - 기존의 Key와 동일한 Key 로 저장하게 될 경우, 기존 값은 없어지고, 새로운 값으로 대체됨.

        <구현 클래스>
        HashMap, Hashtable, LinkedHashMap, Properties, TreeMap
    */
    // HashMap
    public static void main(String[] args) {
        // 제네릭으로 Key 타입, Value 타입 지정
        Map<String, Integer> map = new HashMap<>();

        // 1. put : 새로운 Key, Value 쌍을 추가
        map.put("사과", 1500);
        map.put("바나나", 2500);
        map.put("귤", 2000);
        map.put("키위", 5000);

        map.put("귤", 2500);     // 같은 Key 입력의 경우 마지막에 저장된 값으로 대체

        System.out.println("map = " + map);     // Key 값 중복 X, Value 값 중복 O

        // 2. size : 전체 크기 확인하기
        int size = map.size();
        System.out.println("size = " + size);

        // 3. get : Key 값으로 Value 확인
        Integer bananaPrice = map.get("바나나");
        System.out.println("bananaPrice = " + bananaPrice);

        // 4. keySet : 객체 순회
        Set<String> keySet = map.keySet();
        Collection<Integer> values = map.values();
        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        // 5. for - each : 객체의 내부 한 요소씩을 순회하는 방법
        // 1) keySet을 통한 순회
        System.out.println("< 1. KeySet을 통한 순회 >");
        for (String key : keySet) {
            System.out.println(key + " -> " + map.get(key));
        }

        // 2) values 순회
        System.out.println("< 2. values 순회 >");
        for (Integer value : values) {
            System.out.println("value = " + value);
        }

        // 3) entry 순회
        System.out.println("< 3. entry 순회 >");
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry);
        }

        // 6. remove : 객체 삭제
        // map.remove("바나나");

        System.out.println("map = " + map);

        // 7. 반복자 통해 삭제
        System.out.println("< 반복자 통해 삭제 >");
        // map.iterator()   // Map 에서는 반복자 사용 불가
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){     // iterator 존재 유무 확인
            Map.Entry<String, Integer> nextEntry = iterator.next();
            if (nextEntry.getValue() < 2000) {  // value 기준 2000원 이하 삭제
                iterator.remove();  // 안전 제거(사이즈에 상관없이)
            }
        }
        // 출력
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry);
        }

        // 8. clear : 객체비우기, 모든 요소 삭제
        map.clear();

        // 9. isEmpty : 비어있는지 여부 확인
        boolean empty = map.isEmpty();
        System.out.println("empty = " + empty);

    }

}
