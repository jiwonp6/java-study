package operator;
// #3-12 연습문제1 (2024-02-08)

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        /*
            산술 연산자
            두 개의 정수 a와 b를 사용자로부터 입력받습니다.
            이 두 수에 대해 더하기, 빼기, 곱하기, 나누기, 나머지 연산을 수행하고
            결과를 출력하는 프로그램을 작성하세요.
         */

        // 변수 설정
        int num1;
        int num2;

        // 입력받기
        System.out.println("두 개의 정수를 입력해 주세요.");

        Scanner scanner1 = new Scanner(System.in);
        num1 = scanner1.nextInt();   // 입력받은 타입을 정수로 변환

        Scanner scanner2 = new Scanner(System.in);
        num2 = scanner2.nextInt();
        
        // 출력하기
        System.out.println("num1 + num2 = " + (num1 + num2));
        System.out.println("num1 - num2 = " + (num1 - num2));
        System.out.println("num1 * num2 = " + (num1 * num2));
        System.out.println("num1 / num2 = " + ((double)num1 / num2));
        System.out.println("num1 % num2 = " + (num1 % num2));

    }
}
