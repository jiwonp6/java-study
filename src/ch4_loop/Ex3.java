package ch4_loop;
// #5-11  연습문제 - 구구단 출력(2024-02-13)
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        /*
            구구단 출력하기
            사용자로부터 정수 n을 입력받아,
            n단의 구구단을 출력하는 프로그램을 작성해주세요.
         */
        // 변수 설정
        int i;
        int n;
        int result;

        // 변수 입력받기
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        // for 문
        System.out.println("[구구단 " + n + "단]");
        for (i = 1; i <= 9; i++){
            result = n*i;
            System.out.println(n + " * " + i + " = " + result);
        }
    }
}
