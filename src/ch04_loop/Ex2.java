package ch04_loop;

import java.util.Scanner;
// #5-10  연습문제 - 팩토리얼 계산(2024-02-13)
public class Ex2 {
    public static void main(String[] args) {
        /*
            <팩토리얼 계산하기>
            사용자로부터 정수 n을 입력받아,
            n! (팩토리얼)의 값을 계산하는 프로그램을 작성하세요.
            while 반복문을 사용하여 구현합니다
         */
        // 변수 설정
        int i = 0;
        int n = 0;
        int result = 1;

        // 변수 입력받기
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        // while 문
        while (i < n){
            i++;
            result = result * i;
        }
        System.out.println(result);


    }
}
