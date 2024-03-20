package ch27_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Stream13_Reduce {
    // reduce
        // : 다양한 Reduction 을 커스터마이징 할 수 있는 메소드
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>(
                List.of(new Student("홍길동", 90),
                        new Student("임꺽정", 88),
                        new Student("이몽룡", 72),
                        new Student("김길동", 95))
        );

        int sum = studentList.stream()                  // 학생 객체 스트림
                            .mapToInt(Student::score)   // 점수 정수 스트림 변환
                            .sum();                     // 최종연산 합계
        System.out.println("sum = " + sum);

        // * reduce 의 매개변수
        // - identity : 디폴트 값으로 설정 (초기 값)
        // - 누산기(accumulator) BinaryOperator : 2개의 값을 받아 하나를 리턴 (모든 타입 동일)
        Integer sum2 = studentList.stream()
                .map(Student::score)
                .reduce(0, (a, b) -> a + b);
                // arg1 : 출력값이 다음 스트림의 입력값으로 대입 (누적된 결과)
                // arg2 : 데이터 흐름(스트림)의 입력값 (현재 요소)

        System.out.println("sum2 = " + sum2);

        OptionalInt reduce = IntStream.rangeClosed(1, 10)
                                    .filter(i -> i % 2 == 1)
                                    .reduce((previous, current) -> {
                                        System.out.printf("%d * %d = %d\n", previous, current, (previous * current));
                                        return previous * current;
                                    });
        System.out.println("홀수만 곱한 값 : " + reduce.orElse(1));

        // - 초기값이 주어지는 경우 첫 번째 값이 초기값
        // - 곱셈 연산시 0이 주어지지 않도록 주의
        // - (기본) 곱셈 연산 초기값 : 1, 덧셈 연산 초기값 : 0
        int reduceResultWIthIdentity = IntStream.rangeClosed(1, 10)
                .reduce(3, (previous, current) -> previous * current);
        System.out.println("reduceResultWIthIdentity = " + reduceResultWIthIdentity);

        List<String> words = Arrays.asList("가나다", "라마", "바사아자");

        Integer lengthTot = words.stream()
                                .map(String::length)    // 문자열 길이 정수로 매핑
                                .reduce(0, Integer::sum);   // 각각 더해주는 Reduction 연산
        System.out.println("lengthTot = " + lengthTot);

    }
    record Student (String name, int score) { }
}
