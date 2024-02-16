package quiz1;

import java.util.Scanner;

// #10 퀴즈02 (2024-02-16)
public class quiz03 {
    public static void main(String[] args) {
        /*
            배열 :   점수를 입력받을 학생수를 입력받아 배열에 저장하고
            입력받은 수만큼 학생들의 점수를 입력받은 후, 합계와 평균을 출력해주세요

            예시
            학생수는 몇명인가요? 3
            점수를 입력하세요
            10
            20
            30
            >> 합계 : 60, 평균 : 20.0
        */
        //
        int sum = 0;
        double avg = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("학생수는 몇명인가요.");
        int studentNum = scanner.nextInt();

        int[] scores = new int[studentNum];

        for (int i = 0; i < studentNum; i++) {
            System.out.println("점수를 입력하세요 : ");
            scores[i] = scanner.nextInt();
            sum += scores[i];
        }
        avg = (double) sum / studentNum;

        System.out.printf("합계 : %d, 평균 : %.2f", sum, avg);

    }
}
