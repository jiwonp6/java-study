package ch03_condition;
// #4-12 연습문제4(2024-02-08)

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        /*
            간단한 계산기 만들기
            사용자로부터 두 개의 숫자와 연산자(+, -, *, /)를 입력받아,
            해당 연산을 수행한 결과를 출력하는 간단한 계산기 프로그램을 작성하세요.
            switch 문을 사용하여 각 연산자에 따른 연산을 처리하세요.
            0으로 나누기 시도시 "0으로 나눌 수 없습니다."와 같은 오류 메시지를 출력하세요.
         */
        // 변수 설정
        int num1;
        int num2;
        int value;
        String operator;

        // 변수 입력받기
        System.out.println("첫 번째 숫자를 입력해주세요.");
        Scanner scanner1 = new Scanner(System.in);
        num1 = scanner1.nextInt();

        System.out.println("두 번째 숫자를 입력해주세요.");
        Scanner scanner2 = new Scanner(System.in);
        num2 = scanner2.nextInt();

        System.out.println("연산자(+, -, *, /)를 입력해주세요.");
        Scanner scanner3 = new Scanner(System.in);
        operator = scanner3.nextLine();

        // 조건부
        switch (operator){
            case "+":
                value = num1 + num2;
                System.out.printf("%s + %s = %s", num1, num2, value);
                break;
            case "-":
                value = num1 - num2;
                System.out.printf("%s - %s = %s", num1, num2, value);
                break;
            case "*":
                value = num1 * num2;
                System.out.printf("%s * %s = %s", num1, num2, value);
                break;
            case "/":
                if (num2 != 0){
                    double value2;
                    value2 = (double) num1 / num2;
                    System.out.printf("%s / %s = %s", num1, num2, value2);
                }else {
                    System.out.println("0으로 나눌 수 없습니다.");
                }
                break;
            default:
                System.out.println("잘못 입력하셨습니다.");
                break;
        }

    }
}
