package ch25_collection.n3_map;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class Map5_TreeMap {
    public static void main(String[] args) {
        // TreeMap
            // : Red - Black Tree
        // key 기준으로 자동 정렬
        // Entry 키가 낮은 것은 왼쪽, Entry 키가 높은 것은 오른쪽
        // 효율적으로 정렬하고, O(log n) 시간복잡도로 검색할 수 있음 => binarySearch
        // 정렬 범위로 특정 범위를 잘라서 subMap을 생성

        // 전화번호부, 사전 등과 같은 자료를 저장할 때 유용하게 사용

        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // 무작위로 삽입
        treeMap.put("apple", 10);
        treeMap.put("zoo", 240);
        treeMap.put("desk", 40);
        treeMap.put("cat", 920);
        treeMap.put("base", 20);
        treeMap.put("ever", 70);

        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry);
        }

        // firstEntry : 가장 처음의 Entry 반환
        Map.Entry<String, Integer> firstEntry = treeMap.firstEntry();
        System.out.println("firstEntry = " + firstEntry);
        String firstKey = treeMap.firstKey();
        System.out.println("firstKey = " + firstKey);

        // descendingMap : 내림차순 정렬 맵 반환
        NavigableMap<String, Integer> descendingMap = treeMap.descendingMap();
        for (Map.Entry<String, Integer> entry : descendingMap.entrySet()) {
            System.out.println(entry);
        }

        // subMap : 지정된 범위의 맵 반환
        SortedMap<String, Integer> subMap = treeMap.subMap("c", "h");
        for (Map.Entry<String, Integer> entry : subMap.entrySet()) {
            System.out.println(entry);
        }

    }
}
