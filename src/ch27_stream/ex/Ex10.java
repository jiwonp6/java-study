package ch27_stream.ex;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex10 {
    /*
        <학급의 학생 성적 분석>
        학급에 속한 학생들의 성적이 주어져 있습니다.

        - 전체 학생의 평균 성적을 계산하세요.
        - 최고 성적을 받은 학생의 성적을 찾으세요.
        - 성적이 평균 이상인 학생의 수를 계산하세요.

        출력예시
        ===
        평균 성적: 83.625
        최고 성적: 100
        평균 이상 성적 학생 수: 5
     */
    public static void main(String[] args) {
        List<Integer> grades = Arrays.asList(88, 92, 75, 65, 97, 85, 100, 67);

        // 전체 학생의 평균 성적을 계산하세요.
        double average = grades.stream()
                               .mapToInt(Integer::intValue)
                               .average()
                               .orElse(0.0);
        System.out.println("평균 성적: " + average);

        // 최고 성적을 받은 학생의 성적을 찾으세요.
        int max = grades.stream()
                        .mapToInt(Integer::intValue)    // 언박싱 Integer -> intStream
                        .max()
                        .getAsInt();
        System.out.println("최고 성적: " + max);

        // 성적이 평균 이상인 학생의 수를 계산하세요.
        long count = grades.stream()
                .filter(score -> score >= average)
                .count();
        System.out.println("평균 이상 성적 학생 수: " + count);
    }
}
