package ch06_array;
// #7-6 연습문제 (2024-02-14)

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        /*
            점수를 입력받을 학생수를 입력받고
            입력받은 수만큼 학생들의 점수를 입력받은 후, 합계와 평균을 출력해주세요.
            <예시>
            학생수는 몇명인가요? 3
            점수를 입력하세요
            10
            20
            30
            >> 합계 : 60, 평균 : 20.0
         */
        // 변수 선언
        int studentNum;
        int sum = 0;
        double avg;
        int[] scores;

        // 학생 수 입력받기
        System.out.println("학생 수는 몇 명인가요? : ");
        Scanner scanner = new Scanner(System.in);
        studentNum = scanner.nextInt();

        // 배열 변수 설정
        scores = new int[studentNum];

        // 학생 점수 입력 받고 총 점 구하기
        System.out.println("점수를 입력하세요.");
        for (int i=0; i<studentNum; i++){
            scores[i] = scanner.nextInt();
            sum += scores[i];
        }

        // 평균 구하기
        avg = (double) sum/studentNum;

        // 출력
        System.out.print("학생 점수 : ");
        for (int i=0; i<studentNum; i++){
            System.out.print(scores[i] + " ");
        }
        System.out.println("\n총 점 : " + sum);
        System.out.println("평 균 : " + avg);

    }
}
