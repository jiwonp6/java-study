package quiz.quiz6.q2;

import java.util.Map;
import java.util.function.BiFunction;

public class Quiz02 {
    public static void main(String[] args) {
        Map<String, Integer> userScores = Map.of("Alice", 75, "Bob", 45, "Charlie", 85);

        for (Map.Entry<String, Integer> entry : userScores.entrySet()) {
            BiFunction<String, Integer, String> resultMethod = (name, score) -> score >= 50? "합격" : "불합격";
            String result = resultMethod.apply(entry.getKey(), entry.getValue());
            System.out.println(entry.getKey() + ": " + result);
        }

    }
}
