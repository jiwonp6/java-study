package ch26_lambda.ex;

import java.util.Arrays;
import java.util.List;

public class Ex4 {
    /*
        <문자열 리스트 정렬>
        요구사항: 주어진 문자열 리스트를 문자열의 길이에 따라 오름차순으로 정렬하세요.
        정렬된 리스트의 각 요소를 출력합니다.
        Comparator와 Consumer를 사용하여 구현하세요.

        List<String> languages = Arrays.asList("java", "python", "swift", "cpp", "ai");

        출력예시
        ===
        ai
        cpp
        java
        swift
        python
     */
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("java", "python", "swift", "cpp", "ai");

        // sort : 비교자(Comparator, 인터페이스)를 매개변수(익명객체)로 입력
        // 익명객체 -> 람다(Compare 함수를 overriding)

        // 길이 순서로 정렬
        languages.sort((o1, o2) -> o1.length() - o2.length());
        // = languages.sort(Comparator.comparingInt(String::length));

        // 1. for - Each
        languages.forEach(System.out::println);

        // 2. iter 사용
        for (String language : languages) {
            System.out.println(language);
        }

    }
}
