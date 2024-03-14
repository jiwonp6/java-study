package ch25_collection.n1_list;

import java.util.LinkedList;
import java.util.List;

public class List2_LinkedList {
    // LinkedList
        // : List 인터페이스의 구현 객체
        // arrayList와 사용 방법 동일, 내부 구조는 완전히 다름
        // 인접한 객체를 링크를 통해서 연결하여 관리
        // 특정 인덱스의 객체를 제거하면 앞, 뒤의 링크만 변경되고, 나머지는 그대로 유지
    public static void main(String[] args) {
        List<String> animals = new LinkedList<>();

        // 요소 추가
        animals.add("개");
        animals.add("말");
        animals.add("고양이");

        animals.add(1, "닭");    // 첫번째 요소 추가
        animals.addFirst("소");             // 첫번째 요소 추가
        animals.addLast("토끼");            // 마지막 요소 추가

        System.out.println(animals);

    }
}
