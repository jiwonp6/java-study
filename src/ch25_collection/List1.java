package ch25_collection;

import java.util.ArrayList;
import java.util.List;

public class List1 {
    public static void main(String[] args) {
        /*
            List : 컬렉션 프레임 워크의 핵심 인터페이스 중 하나
            
            <구현 클래스>
            ArrayList, LinkedList, Vector, Stack
            
            <특징>
            1. 순서가 있는 데이터의 집합을 다룸
            2. 중복된 요소를 허용
        */
        // 용량 20짜리 배열 생성
        List<Integer> numbers = new ArrayList<>(20);

        // 용량 10짜리 배열 생성 (아무것도 안주면)
        List<String> names = new ArrayList<>();
        names.add("홍길동");                         // 리스트 맨 끝에 객체를 추가
        names.add("임꺽정");
        names.add("이몽룡");
        names.add(1, "이순신");        // 해당 인덱스 위치에 객체 추가
        names.set(2, "전우치");                      // 특정 인덱스의 객체를 변경

        // 리스트 출력
        for (String name : names) {     // 데이터가 실제 들어있는 만큼 용량이 조정됨 -> NPE 발생 X
            System.out.println(name.length());
        }

        System.out.println(names);      // 배열로 출력

        // get : 요소 접근
        String name3 = names.get(3);
        System.out.println(name3);

        // contains : 객체 저장 여부 -> boolean
        boolean contains = names.contains("이순신");
        System.out.println(contains);

        // size : 저장된 전체 객체 수
        int size = names.size();
        System.out.println(size);

        // remove : 요소 제거
        boolean remove1 = names.remove("전우치");  // 객체로 삭제
        System.out.println(remove1);
        String remove2 = names.remove(2);      // 인덱스로 삭제
        System.out.println(remove2);

        // clear : 컬렉션 요소 전체 삭제
        names.clear();
        System.out.println(names);

        // isEmpty : 객체가 비어있는지 여부 -> boolean
        boolean empty = names.isEmpty();
        System.out.println(empty);

        // 배열과의 차이점
            // : 저장 용량(capacity) 자동으로 증가
            // 객체를 저장할 때 자동으로 인덱스가 부여됨
        String[] nameArray = new String[10];
        nameArray[0] = "이름1";
        nameArray[1] = "이름2";
        nameArray[2] = "이름3";

        for (String name : nameArray) {
            // System.out.println(name.length());      // NPE 발생
        }
    }
}
