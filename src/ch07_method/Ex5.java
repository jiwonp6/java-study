package ch07_method;

import java.util.Scanner;

// #8-14 연습문제 (2024-02-15)
public class Ex5 {
    public static void main(String[] args) {
        /*
            두 정수와 연산기호를 매개변수로 받아 연산 결과를 리턴하는 메서드를 작성하세요.
            메서드 이름 : calculate
            <호출 예시>
            첫 번째 정수를 입력하세요: 10
            두 번째 정수를 입력하세요: 20
            연산 기호를 입력하세요: +
            연산 결과: 30
         */
        // 입력받기
        Scanner scanner = new Scanner(System.in);
        System.out.println("두 정수와 연산기호를 입력받겠습니다.");

        System.out.println("첫 번째 정수를 입력하세요 : ");
        int num1 = scanner.nextInt();
        System.out.println("두 번째 정수를 입력하세요 : ");
        int num2 = scanner.nextInt();

        System.out.println("연산기호를 입력해주세요 (+, -, *, /) : ");
        String operator = scanner.next();

        // 결과 출력
        double result = calculate(num1, num2, operator);
        if (0 != num2){
            System.out.printf("연산결과 : %d %s %d = %.2f", num1, operator, num2, result);
        }
    }

    // 계산 메소드
    public static double calculate(int num1, int num2, String operator){
        double result = 0;
        switch (operator){
            case "+" :
                result = num1 + num2;
                break;
            case "-" :
                result = num1 - num2;
                break;
            case "*" :
                result = num1 * num2;
                break;
            case "/" :
                if(num2 == 0){
                    System.out.println("계산 불가");
                } else {
                    result = num1 / num2;
                }
                break;
        }
        return result;
    }
}
