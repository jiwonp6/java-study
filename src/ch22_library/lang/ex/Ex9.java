package ch22_library.lang.ex;

import java.util.Arrays;
import java.util.Scanner;

public class Ex9 {
    /*
        문자열 정보 처리 및 분석

        요구사항:
        당신은 텍스트 기반 데이터를 처리하는 소프트웨어를 개발하고 있습니다.
        사용자로부터 한 줄의 문자열을 입력받아,
        다음과 같은 정보를 출력하는 프로그램을 작성하세요.

        - 입력받은 문자열의 길이.
        - 문자열에서 공백의 수.
        - 문자열을 쉼표(,)로 분리한 후, 각 부분 문자열의 길이를 출력.
        - 문자열이 "Java"를 포함하는지 여부.
        - 문자열이 "프로그래밍"으로 끝나는지 여부.
        - 문자열 중 "a" 문자가 몇 번 나타나는지 카운트. (대소문자 구분 없음)

        입력 예시 문자열
        ===
        Java 프로그래밍, 문자열 처리 연습!

        출력 예시
        ===
        문자열 길이: 22
        공백 수: 4
        각 부분 문자열 길이: [10 11]
        "Java" 포함 여부: true
        "프로그래밍"으로 끝나는가: false
        "a" 문자의 수: 2
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자열을 입력해주세요.");
        String answer = scanner.nextLine();

        // 1. 입력받은 문자열 길이
        int length = answer.length();
        System.out.println("1. 문자열 길이 : " + length);

        // 2. 문자열에서 공백의 수.
        String[] blankWord = answer.split(" ");
        int blank = (blankWord.length - 1);
        System.out.println("2. 공백 수 : " + blank);

        // 3. 문자열을 쉼표(,)로 분리한 후, 각 부분 문자열의 길이를 출력.
        String[] commaWord = answer.split(",");
        System.out.print("3. 각 부분 문자열 길이 : [ ");
        for (int i = 0; i < commaWord.length; i++) {
            System.out.print(commaWord[i].length() + " ");
        }
        System.out.println("]");

        // 4. 문자열이 "Java"를 포함하는지 여부.
        boolean contains = answer.contains("Java");
        System.out.println("4. \"Java\" 포함 여부 : " + contains);

        // 5. 문자열이 "프로그래밍"으로 끝나는지 여부.
        boolean endWord = answer.endsWith("프로그래밍");
        System.out.println("5. \"프로그래밍\"으로 끝나는가 : " + endWord);

        // 6. 문자열 중 "a" 문자가 몇 번 나타나는지 카운트. (대소문자 구분 없음)
        String[] aWord = answer.split("a");
        int count = (aWord.length - 1);
        System.out.println("6. \"a\" 문자의 수 : " + count);

    }
}
