package ch04_loop;
// #5-14  연습문제(2024-02-13)
import java.util.Scanner;

public class Ex4_3 {
    public static void main(String[] args) {
        /*
            다이아몬드 패턴 출력하기
            홀수 정수 n을 입력받아 n의 높이를 가지는 다이아몬드 패턴 출력프로그램
            n = 5
                  *
                 ***
                *****
                 ***
                  *
         */
        // 변수 설정
        int n;

        // 변수 입력받기
        System.out.println("별의 줄 수  : ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        // 상단 다이아몬드
        for (int i = 1; i < n; i +=2) {
            // 공백 출력
            for (int j = 0; j < (n - i) / 2; j++) {
                System.out.print(" ");
            }
            // * 출력
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();  // 줄바꿈
        }

        // 하단 다이아몬드
        for (int i = n; i > 0; i -= 2) {
            // 공백 출력
            for (int j = 0; j < (n - i) / 2; j++) {
                System.out.print(" ");
            }
            // * 출력
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();  // 줄바꿈
        }
    }
}
