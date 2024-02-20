package ch07_method;

import java.util.Scanner;

// #8-8 연습문제 (2024-02-15)
public class Ex2 {
    public static void main(String[] args) {
        /*
            세 수를 입력받아 합계와 평균을 구하는 메소드를 만들어주세요.
         */
        // 입력받기
        System.out.println("세 수를 입력해주세요.");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // 결과받기
        int sum = sum(num1, num2, num3);
        double avg = avg(num1, num2, num3);

        // 출력하기
        System.out.printf("세 수 %d, %d, %d의 합계는 %d이고, 평균은 %.2f이다.", num1, num2, num3, sum, avg);

    }
    // 덧셈 구하는 메소드
    public static int sum(int num1, int num2, int num3){
        int sum = num1 + num2 + num3;
        return sum;
    }
    // 평균 구하는 메소드
    public static double avg(int num1, int num2, int num3){
        double avg = (num1 + num2 + num3)/3.0;
        return avg;
    }
}
