package ch25_collection.list;

import java.util.*;

public class List4 {
    public static void main(String[] args) {
        // 빈 리스트를 생성 & 추가
        List<String> fruits1 = new ArrayList<>();
        fruits1.add("감");
        fruits1.add("포도");
        fruits1.add("복숭아");

        // 지정된 컬렉션 요소들을 포함하여 생성
        List<String> fruits2 = new ArrayList<>(
                List.of("바나나", "사과", "딸기")
        );

        // addAll : 지정된 컬렉션의 요소를 리스트 끝에 추가
        fruits1.addAll(fruits2);

        // removeAll : 매개변수로 주어진 컬렉션의 요소들을 삭제
        fruits1.removeAll(fruits2);

        // Arrays.asList : 배열을 리스트로 변경 (List 인터페이스 타입), ArrayList 아님.
        List<String> fruits3 = Arrays.asList("체리", "토마토", "키위");

        // Collection 타입의 매개변수를 넣는 곳에 넣을 수 있음
        fruits1.addAll(fruits3);
        fruits1.addAll(Arrays.asList("망고", "용과"));

        // List.of : 변경 불가(Immutable) List 를 반환
        List<String> fruits4 = List.of("파파야", "망고스틴");
        // fruits4.add("밤");   // 변경 가능한 메소드를 수행하려하면 Exception 발생!

        // subList : 리스트의 지정된 범위만큼을 반환 (시작 인덱스 포함, 끝 인덱스 포함 X)
        List<String> fruits5 = fruits1.subList(3, 6);
        System.out.println("fruits5 = " + fruits5);

        // List는 중복 요소 허용
        fruits1.add("망고");
        fruits1.add("망고");

        // indexOf : 객체로 인덱스를 반환, 가장 첫 번째 인덱스를 찾고 없으면 -1 리턴
        int index1 = fruits1.indexOf("망고");
        System.out.println("index1 = " + index1);

        // lastIndexOf : 지정된 객체의 마지막 인덱스 반환
        int lastIndex = fruits1.lastIndexOf("망고");
        System.out.println("lastIndex = " + lastIndex);

        // iterator : 반복자 반환
        Iterator<String> iterator = fruits1.iterator();

        // sort : 요소를 정렬, Comparator (정렬자) 를 매개변수로 받음
        fruits1.sort(String::compareTo);            // 문자열 오름차순 정렬
        fruits1.sort(Comparator.reverseOrder());    // 문자열 내림차순 정렬

        System.out.println("fruits1 = " + fruits1);


    }
}
