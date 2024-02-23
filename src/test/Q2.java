package test;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int num1;
        int num2;
        double result;
        String operator;

        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력하세요.");
        num1 = scanner.nextInt();
        System.out.println("두번째 숫자를 입력하세요.");
        num2 = scanner.nextInt();
        System.out.println("연산자를 하나 입력해주세요.(+, -, *, /)");
        operator = scanner.next();

        switch (operator){
            case "+" :
                result = num1 + num2;
                System.out.printf("%s %s %s = " + result, num1, operator, num2);
                break;
            case "-" :
                result = num1 - num2;
                System.out.printf("%s %s %s = " + result, num1, operator, num2);
                break;
            case "*" :
                result = num1 * num2;
                System.out.printf("%s %s %s = " + result, num1, operator, num2);
                break;
            case "/" :
                if (num2 == 0){
                    System.out.println("연산 수행 불가");
                    break;
                }
                result = (double) num1 / num2;
                System.out.printf("%s %s %s = " + result, num1, operator, num2);
                break;
        }
    }
}
