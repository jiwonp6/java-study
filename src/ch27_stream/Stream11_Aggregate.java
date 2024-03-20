package ch27_stream;

import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream11_Aggregate {
    // 스트림의 집계 연산 Aggregate
    // 최종 연산
        // : 스트림 내부 요소들을 처리해서, 하나의 값으로 산출하는 것을 말함.
    // 대량의 데이터를 가공해서, 하나의 값으로 축소 => reduce 또는 Reduction

    // 기본 집계 연산 : count, min, max, sum, average
    public static void main(String[] args) {
        // count : 요소의 개수 반환
        long count = Stream.of("홍길동", "이몽룡", "임꺽정", "김길동", "박길동", "김철수").count();
        System.out.println("count = " + count);                 // count = 6

        // max : 최대값을 반환 -> Optional 타입 반환
        int[] intArray = {1, 2, 3, 4, 5};
        OptionalInt max = Arrays.stream(intArray).max();
        System.out.println("max = " + max);                    // max = OptionalInt[5]
        System.out.println("max = " + max.getAsInt());         // max = 5

        // min : 최소값을 반환 -> Optional 타입 반환
        OptionalInt min = Arrays.stream(intArray).min();
        System.out.println("min = " + min);                    // min = OptionalInt[1]

        // min, max 는 기본 타입이 아닐 때, Comparator 를 매개변수로 받는다.
        // Comparable 구현 객체라면 자연순서 적용 가능
        Optional<String> minStr
                = Stream.of("홍길동", "이몽룡", "임꺽정", "김수한무", "둘리", "김철수")
                        .min(Comparator.naturalOrder());       // 가나다 순(자연순)
        System.out.println("minStr = " + minStr);              // minStr = Optional[김수한무]
        Optional<String> maxStr
                = Stream.of("홍길동", "이몽룡", "임꺽정", "김수한무", "둘리", "김철수")
                .max(Comparator.comparing(String::length));    // 길이순
        System.out.println("maxStr = " + maxStr);              // maxStr = Optional[김수한무]

        // sum : 스트림 요소 합계 (정수, 실수 등의 숫자 스트림에서 사용 가능)
        int sum = IntStream.rangeClosed(1, 100).sum();
        System.out.println("sum = " + sum);                    // sum = 5050

        double doubleSum = DoubleStream.of(1.1, 2.2, 3.3).sum();
        System.out.println("doubleSum = " + doubleSum);        // doubleSum = 6.6

        // average : 스트림 요소 평균 (정수, 실수 등의 숫자 스트림에서 사용 가능)
        // 리턴값 : OptionalDouble
        OptionalDouble average = IntStream.rangeClosed(1, 100).average();
        System.out.println("average = " + average);            // average = OptionalDouble[50.5]

        // findFirst : 첫 번째 요소 찾기 -> Optional 타입 반환
        OptionalInt first = IntStream.rangeClosed(1, 100)
                                    .filter(n -> n % 11 == 0)
                                    .findFirst();
        System.out.println("first = " + first);                // first = OptionalInt[11]

    }
}
