package ch7_method;

import java.util.Scanner;

// #8-16 연습문제 (2024-02-15)
public class Ex7 {
    public static void main(String[] args) {
        /*
            단어 맞추기 게임
         */

        // 단어 목록에서 무작위로 선택될 단어들
        String[] words = {"java", "computer", "kotlin", "game"};

        // 선택된 단어
        String selectedWord = words[(int) (Math.random() * words.length)];

        //선택된 단어 배열에 넣기
        char[] selectedWorld = new char[selectedWord.length()];
        for (int i = 0; i < selectedWorld.length; i++) {
            selectedWorld[i] = selectedWord.charAt(i);
        }

        // 플레이어에게 보여줄 단어의 형태 ('_'로 가려진 형태)
        char[] displayArray = new char[selectedWord.length()];
        for (int i = 0; i < displayArray.length; i++) {
            displayArray[i] = '_';
        }

        // 단어 추측 시작
        int tries = 0; // 사용자가 시도한 횟수
        final int MAX_TRIES = 7; // 최대 시도 횟수
        Scanner scanner = new Scanner(System.in);
        while (tries < MAX_TRIES) {
            System.out.printf("단어 추측(남은 시도 횟수 %d): ", (MAX_TRIES - tries));
            printDisplayArray(displayArray); // 현재까지 맞춘 단어의 상태 출력하는 메서드
            String guess = scanner.nextLine();  // 사용자로부터 글자 추측 받기

            // 예외 처리
            if (guess.length() != 1) {
                System.out.println("한 글자만 입력해주세요.");
                continue;
            }

            // 시도 할 때마다 횟수 증가
            tries++;

            char guessLetter = guess.charAt(0);  // 추측한 글자
            boolean isCorrectGuess = false; // 글자가 정답에 포함되어 있는지 여부

            // 추측한 글자 처리 로직 구현
            for (int i = 0; i < selectedWorld.length; i++) {
                if (selectedWord.charAt(i) == guessLetter){
                    displayArray[i] = guessLetter;
                    isCorrectGuess = true;
                }
            }
            // 추측 성공여부 출력
            if (tries < MAX_TRIES){
                if (isCorrectGuess == true){
                    System.out.println("글자 추측 성공");
                    
                }else {
                    System.out.println("글자 추측 실패");
                }
            }

            // 게임 종료 조건 검사 및 게임 결과 출력
            if (isWordCompleted(displayArray) == true) {
                break;
            }
        }   // 반복문 끝!

        // 게임 종료 후 정답 단어와 승리 또는 패배 메시지 출력
        boolean isWordCompleted = isWordCompleted(displayArray);
        if (isWordCompleted){
            System.out.println("단어 추측 성공!");
        } else if(tries == 7){
            System.out.println("기회를 모두 소진하였습니다. 단어 추측 실패!");
        }
        System.out.print("추측한 단어는 : ");
        selectedWorld(selectedWorld);
    }
    // 메소드

    // 단어 출력하는 메소드
    private static void selectedWorld(char[] selectedWorld) {
        for (int i = 0; i < selectedWorld.length; i++) {
            System.out.print(selectedWorld[i] + " ");
        }
        System.out.println(" ");
    }

    // 현재까지 맞춘 단어의 상태를 출력하는 메소드
    private static void printDisplayArray(char[] displayArray) {
        for (int i = 0; i < displayArray.length; i++) {
            System.out.print(displayArray[i] + " ");
        }
        System.out.println(" ");
    }

    // 단어가 모두 맞춰졌는지 확인하는 메소드
    private static boolean isWordCompleted(char[] displayArray) {
        for (int i = 0; i < displayArray.length; i++) {
            if (displayArray[i] == '_'){
                return false;
            }
        }
        return true;
    }

}
