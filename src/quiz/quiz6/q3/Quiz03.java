package quiz.quiz6.q3;

import java.util.Arrays;
import java.util.List;

public class Quiz03 {
    public static void main(String[] args) {
        List<Integer> scores = Arrays.asList(16, -9, 4, 1, -16, 9, 25);

        List<Integer> positiveNums = scores.stream().filter(score -> score > 0).toList();

        for (Integer positiveNum : positiveNums) {
            System.out.println(Math.sqrt(positiveNum));
        }
    }
}
