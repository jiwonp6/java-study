package ch6_array;
// #7-13 연습문제 (2024-02-14)

import java.util.Scanner;

public class Ex5_2 {
    public static void main(String[] args) {
        /*
            2차원 배열을 활용한 점수 계산 문제
            학생들의 국어, 영어, 수학 점수를 입력 받아, 각 학생의 총점과 평균을 구하는 프로그램을 작성하세요.
            +) 문자열 배열을 활용하여 해당 과목의 점수를 입력받기
            +) 학생의 수를 입력받아서 n명 만큼의 총점과 평균을 구하기
         */
        // 변수 선언
        int[][] scores;

        int headCount;

        int sum = 0;
        double avg;

        // 입력받기
        Scanner scanner = new Scanner(System.in);
        // 학생수
        System.out.println("학생 수는 몇 명 인가요?");
        headCount = scanner.nextInt();
        // 다차원 행열 설정
        scores = new int[headCount][3];
        // 행열에 점수 넣기
        for(int i = 0; i < headCount; i++){
            for (int j = 0; j<3; j++){
                // 행열에 변수 넣기
                switch (j){
                    case 0 :
                        System.out.print("국어");
                        break;
                    case 1 :
                        System.out.print("영어");
                        break;
                    case 2 :
                        System.out.print("수학");
                        break;
                }
                System.out.println(" 점수를 입력해주세요.");
                scores[i][j] = scanner.nextInt();
            }
        }

        // 출력
        System.out.println("국어 영어 수학 총점 평균");
        System.out.println("----------------------");
        for (int i = 0; i < scores.length; i++){
            // 변수 초기화
            sum = 0;
            avg = 0;
            for (int j = 0; j < scores[i].length; j++){
                sum += scores[i][j];
                System.out.print(" " + scores[i][j] + "\t");
            }
            avg = (double) sum/scores[i].length;
            System.out.print(" " + sum + "\t");
            System.out.println(" " + avg);
        }
    }
}
