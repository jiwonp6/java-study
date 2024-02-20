package ch06_array;
// #7-12 연습문제 (2024-02-14)

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        /*
            2차원 배열을 활용한 점수 계산 문제
            3명의 학생들의 국어, 영어, 수학 점수를 입력 받아, 각 학생의 총점과 평균을 구하는 프로그램을 작성하세요.
         */
        // 변수 선언
        int[][] scores;

        int headCount;

        int sum = 0;
        double avg;

        // 입력받기
        Scanner scanner = new Scanner(System.in);
        // 다차원 행열 설정
        scores = new int[3][3];
        // 행열에 점수 넣기
        for(int i = 0; i < 3; i++){
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
        System.out.println("국어 영어 수학");
        for (int row[] : scores){
            for (int element : row){
                System.out.print(element + "\t");
            }
            System.out.println(" ");
        }

        for (int i = 0; i < scores.length; i++) {
            sum = 0;
            for (int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j];
            }
            System.out.print(i+1 +"번 학생의 합계는 = " + sum);
            System.out.println(", 평균은 = " + sum / scores[i].length);
        }


    }
}
