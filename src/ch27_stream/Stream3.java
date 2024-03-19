package ch27_stream;

import java.util.ArrayList;
import java.util.List;

public class Stream3 {
    public static void main(String[] args) {
        // 스트림 파이프라인(PipeLine)
            // : 스트림은 하나 이상 연결되어서 중간 과정들이 계속 연결될 수 있음
        // 메소드 체이닝 (Stream -> Stream -> Stream -> <Return>)
            // : 연결된 파이프라인에서 최종 연산(집계)하여 값으로 반환된다.

        // 데이터 필터링
        List<String> list = new ArrayList<>();
        list.addAll(
                List.of("홍길동", "이몽룡", "임꺽정", "김길동", "홍길동")
        );
        list.forEach(System.out::println);

        // distinct : 중복요소 제거
        System.out.println("<중복요소 제거>");
        list.stream().distinct().forEach(System.out::println);

        // filter : 매개변수로 Predicate 받아 조건을 만족하는 데이터만 필터링
        System.out.println("<홍씨만 출력>");
        list.stream().filter(name -> name.startsWith("홍")).forEach(System.out::println);

        // 파이프라인 연결하기
        System.out.println("<중복요소 제거하고 홍씨만 출력>");
        list.stream().distinct().filter(name -> name.startsWith("홍")).forEach(System.out::println);

    }
}
