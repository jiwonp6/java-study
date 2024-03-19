package ch27_stream.ex;

import java.util.Arrays;
import java.util.List;

public class Ex3 {
    /*
        <알파벳 정렬>
        알파벳이 뒤죽박죽인 리스트가 있습니다.
        이를 알파벳 순으로 정렬한 후, 결과를 출력하세요.
        단, 대소문자 구분 없이 정렬하세요.

        출력결과:
        A
        b
        B
        C
        c
        d
        D
        e
        E
        f
        F
     */
    public static void main(String[] args) {
        List<String> alphabets = Arrays.asList("b", "A", "d", "C", "f", "e", "D", "c", "F", "B", "E");

        alphabets.stream()
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .forEach(System.out::println);
    }
}
