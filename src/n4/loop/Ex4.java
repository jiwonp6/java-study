package n4.loop;
// #5-12  연습문제(2024-02-13)
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        /*
            별 찍기
            사용자로부터 정수 n을 입력받아, n줄 만큼의 별(*)을
            삼각형 모양으로 출력하는 프로그램을 작성하세요.
            (input) 별의 줄 수 : 2
            *
            **
            (input) 별의 줄 수 : 4
            *
            **
            ***
            ****
            Hint : 중첩 for문, System.out.print()
         */
        // 변수 설정
        int i;
        int j;
        int n;

        // 변수 입력받기
        System.out.println("별의 줄 수  : ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        // for문
        for (i = 0; i < n; i++){
            for (j = 0; j <= i; j++ ){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
