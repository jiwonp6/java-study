package ch7_method;

import java.util.Scanner;

// #8-7 연습문제 (2024-02-15)
public class Ex1 {
    public static void main(String[] args) {
        /*
            두 수를 입력받아 뺄셈을 하는 메소드를 만들어 주세요.
         */
        // 입력받기
        System.out.println("뺄셈을 하고자 하는 두 수를 입력해 주세요.");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int result = subtract(num1, num2);

        System.out.printf("%d + %d = %d", num1, num2, result);
    }

    // 뺄셈 하는 메소드
    public static int subtract(int num1, int num2){
        int result = num1 - num2;
        return result;
    }
}
