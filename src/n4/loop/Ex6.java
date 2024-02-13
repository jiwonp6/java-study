package n4.loop;

import java.util.Scanner;
// #5-16  연습문제 - 피보나치 수열(2024-02-13)
public class Ex6 {
    public static void main(String[] args) {
        /*
            피보나치 수열 찾기
            사용자로부터 정수 n을 입력받아,
            피보나치 수열의 첫 n 항을 출력하는 프로그램을 작성하세요.
            피보나치 수열에서 다음 항은 앞의 두 항의 합으로 구성됩니다
            (예: 0, 1, 1, 2, 3, 5, 8, ...).
         */
        // 변수 설정
        int n;
        int firstNum = 0;

        // 변수 입력받기
        System.out.print("피보나치 수열의 항 개수: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        //
        System.out.println("피보나치 수열의 첫 항");

        for(int i = 0; i < n; i++){
            firstNum += i;
            System.out.println((i+1) + " : " + firstNum);
        }
    }
}
