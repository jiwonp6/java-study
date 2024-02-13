package n3.condition;
// #4-12 연습문제7(2024-02-08)

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        /*
             삼항연산자를 사용해서 짝수와 홀수를 구별하는 프로그램을 작성해주세요.
             Hint : num % 2
        */

        // 변수 설정
        int num;
        String value;

        // 변수 입력받기
        System.out.println("수를 입력해주세요.");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        // 조건에 맞게 설정
        value = (num % 2 == 0) ? "짝수" : "홀수";

        // 출력
        if (num > 0){
            System.out.printf("입력하신 수는 %s(으)로 %s입니다.", num, value);
        }else {
            System.out.println("0 이하의 수는 판별할 수 없습니다.");
        }

    }
}
