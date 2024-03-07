package ch22_library.lang.lang10_string;

import java.util.Arrays;

public class StringMethod6 {
    public static void main(String[] args) {
        // <문자열에서 자주 사용되는 메소드>

        // 19. repeat(int) : count 횟수만큼 문자열 반복하여 문자열 반환
        String bell = "딸랑";
        String repeat1 = bell.repeat(2);                        // "딸랑딸랑"
        String repeat2 = bell.concat(" ").repeat(3).trim(); // "딸랑 딸랑 딸랑"

        // 20. substring(int, int) : 문자열에 지정된 부분 문자열 반환
                                  // 시작 인덱스는 포함, 끝 인덱스는 포함하지 않음
        String substring1 = "안녕하세요".substring(2);   // "하세요"
        String substring2 = "안녕하세요".substring(0, 2);          // "안녕"

        String sentence = "무궁화 꽃이 피었습니다.";
        String findText = "꽃이";
        String substring3
                = sentence.substring(sentence.indexOf(findText), (sentence.indexOf(findText) + findText.length()));
                                     // 시작 인덱스                // 끝 인덱스 (시작 인덱스 + 글자 길이)
        System.out.println(substring3);                          // "꽃이"

        // 21. replace : 치환, 지정된 문자열에서 다른 문자를 교체한 새 문자열로 반환
        String replace1 = "안녕하세요".replace("안녕", "평안");
        System.out.println(replace1);                            // "평안하세요"

        String replace2 = "안녕하세요. 저는 안녕합니다.".replace("안녕", "평안");
        System.out.println(replace2);                            // "평안하세요. 저는 평안합니다."<--- 모든 문자열을 교체

        // 22. split : 지정된 구분자로 배열을 반환
        String fruits = "사과, 바나나, 딸기";
        String[] fruit = fruits.split(",");
        System.out.println(Arrays.toString(fruit));              // [사과,  바나나,  딸기]

        String todos = "청소하기 빨래하기 설거지하기";
        String[] todoList = todos.split(" ");
        System.out.println(Arrays.toString(todoList));           // [청소하기, 빨래하기, 설거지하기]

    }
}
