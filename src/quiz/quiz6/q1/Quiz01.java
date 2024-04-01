package quiz.quiz6.q1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Quiz01 {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("java", "python", "swift", "cpp","ai");

        languages.sort((s1, s2) -> s1.length() - s2.length());

        System.out.println("<글자 길이순 오름차순 정렬>");
        languages.forEach(System.out::println);

    }
}
