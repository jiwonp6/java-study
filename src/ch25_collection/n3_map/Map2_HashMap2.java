package ch25_collection.n3_map;

import java.util.HashMap;
import java.util.Map;

public class Map2_HashMap2 {
    public static void main(String[] args) {
        Map<String, Integer> bookPageMap = new HashMap<>();

        // 10. putIfAbsent : 키가 존재하지 않을 경우만 값을 추가
        bookPageMap.put("위대한 개츠비", 180);
        bookPageMap.putIfAbsent("위대한 개츠비", 200);
        System.out.println("bookPageMap = " + bookPageMap);

        // 11. forEach : 모든 key - value 에 대해 실행문 반복
        bookPageMap.forEach((key, value) -> System.out.println(key + "는 " + value + "쪽입니다."));

        // 12. replace : 해당 키의 Value 값을 대체
        bookPageMap.replace("위대한 개츠비", 180, 300);
        System.out.println("변경된 페이지 수 : " + bookPageMap.get("위대한 개츠비") + "쪽");

        // 13. getOrDefault : 키가 존재하지 않을 때 디폴트(기본) 값 변환
        Integer unknownBookPage = bookPageMap.getOrDefault("홍길동전", 250);
        System.out.println("unknownBookPage = " + unknownBookPage);

        // 14. of(key, value, key, value, ...) : 수정 불가 Map 반환
        Map<String, Integer> unmodifiableMap = Map.of("전우치전", 400, "홍길동전", 500, "심청전", 600);
        System.out.println("unmodifiableMap = " + unmodifiableMap);

        // 15. putAll : 여러 맵들을 한꺼번에 추가
        bookPageMap.putAll(unmodifiableMap);
        // 출력
        System.out.println(bookPageMap.entrySet());

        for (Map.Entry<String, Integer> entry : bookPageMap.entrySet()) {
            System.out.println(entry);
        }

        // 16. containsKey : 키 포함 여부 확인
        boolean b1 = bookPageMap.containsKey("심청전");
        System.out.println("심청전 포함 여부 : " + b1);

        // 17. containsKey : value(값) 포함 여부 확인
        boolean b2 = bookPageMap.containsValue(500);
        System.out.println("500쪽 책 포함 여부 : " + b2);

        // 18. get : 잘못된 키를 넣으면 null 반환
        Integer noneKey = bookPageMap.get("없는 책");
        System.out.println("noneKey = " + noneKey);

        // 19. null 을 key 값으로 value 저장 가능
        bookPageMap.put(null, 100);     // null 키 가능
        bookPageMap.put(null, 200);     // 중복은 불가. -> 덮어써짐

        System.out.println("bookPageMap = " + bookPageMap);

        // 20. value 는 null 중복 가능
        bookPageMap.put("좋은 책", null);
        bookPageMap.put("발간예정 책", null);

        System.out.println("bookPageMap = " + bookPageMap);

    }
}
