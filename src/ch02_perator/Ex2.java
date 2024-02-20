package ch02_perator;
// #3-12 연습문제2 (2024-02-08)

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        /*
            논리 연산자
            사용자로부터 두 개의 불리언 값을 입력받습니다.
            이 두 값에 대해 AND, OR, NOT 연산을 수행하고
            각 결과를 출력하는 프로그램을 작성하세요.
         */

        // 변수 설정
        boolean bull1;
        boolean bull2;

        // 입력받기
        System.out.println("true 또는 false를 입력해 주세요.");

        Scanner scanner1 = new Scanner(System.in);
        bull1 = scanner1.nextBoolean();

        System.out.println("true 또는 false를 입력해 주세요.");

        Scanner scanner2 = new Scanner(System.in);
        bull2 = scanner2.nextBoolean();

        System.out.println("\n<And 연산>");
        System.out.print("bull1 and bull2 값 : ");
        System.out.println(bull1 && bull2);
        
        System.out.println("\n<Or 연산>");
        System.out.print("bull1 or bull2 값 : ");
        System.out.println(bull1 || bull2);
        
        System.out.println("\n<Not 연산>");
        System.out.println("bull1의 Not 값 : " + !bull1);
        System.out.println("bull2의 Not 값 : " + !bull2);
    }
}
