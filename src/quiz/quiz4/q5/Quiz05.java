package quiz.quiz4.q5;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz05 {
    public static void main(String[] args) {
        // 필드
        int max = 0;
        int maxIndex = 0;

        // 문장 입력받기
        Scanner scanner = new Scanner(System.in);
        System.out.println("문장을 입력하세요.");
        String str = scanner.nextLine();

        // 문장 단어로 쪼개기
        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));

        // 가장 긴 문장 찾기
        for (int i = 0; i < words.length; i++) {
            if (max < words[i].length()){
                max = words[i].length();
                maxIndex = i;
            }
        }
        
        // 출력
        System.out.println(words[maxIndex]);
    }
}
