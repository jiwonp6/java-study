package quiz.quiz5.q3;

import java.util.HashMap;
import java.util.Map;

public class Quiz03 {
    public static void main(String[] args) {
        String text = "나는 집에 간다. 나는 학교에 간다.";
        HashMap<String, Integer> wordsMap = new HashMap<>();

        int count = 1;

        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            String s = words[i].replaceAll("[^가-힣]", "");
            words[i] = s;
            if (!wordsMap.containsKey(words[i])){
                wordsMap.put(words[i], count);
            } else {
                wordsMap.put(words[i], count+1);
            }
            count = 1;
        }

        System.out.println("단어 빈도수:");
        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            System.out.println(entry.getKey() + ":"+ entry.getValue());
        }






    }
}
