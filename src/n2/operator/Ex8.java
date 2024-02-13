package n2.operator;
// #3-12 연습문제8 (2024-02-08)

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        /*
            삼항 연산자
            사용자로부터 두 정수를 입력받아, 두 정수 중 큰 값을 출력하는 프로그램을 작성하세요.
            이때, 조건 연산자(삼항 연산자)를 사용하여 구현하세요.
         */

        // 변수 설정
        int num1;
        int num2;

        int result;

        // 정수 입력 받기
        System.out.println("첫 번째 수를 입력하세요.");
        Scanner scanner1 = new Scanner(System.in);
        num1 = scanner1.nextInt();

        System.out.println("두 번째 수를 입력하세요.");
        Scanner scanner2 = new Scanner(System.in);
        num2 = scanner2.nextInt();

        // 결과 도출
        result = (num1 >= num2) ? num1 : num2;
        System.out.printf("%s와 %s중 더 큰 수는 %s입니다.", num1, num2, result);

    }
}
