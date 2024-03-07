package ch22_library.lang.ex;

import java.util.Scanner;

public class Ex11 {
    /*
        <가장 긴 단어 찾기>
        [요구사항]
        사용자로부터 한글 문장을 입력받아,
        문장 내에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
        단어는 공백으로 구분됩니다.

        [예시 입력]
        데이터 분석과 프로그래밍은 매우 재미있어요

        [예시 출력]
        프로그래밍은
     */
    public static void main(String[] args) {
        int max = 0;
        int maxIndex = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("문장을 입력하세요.");
        String sentence = scanner.nextLine();

        String[] phrase = sentence.split(" ");
        for (int i = 0; i < phrase.length; i++) {
            if (phrase[i].length() > max){
                max = phrase[i].length();
                maxIndex = i;
            }
        }
        System.out.println(phrase[maxIndex]);
    }
}
