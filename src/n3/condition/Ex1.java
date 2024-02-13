package n3.condition;
// #4-12 연습문제1(2024-02-08)

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        /*
            환율 계산하기
            달러 환율이 1327원이다.
            달러를 0원 입금 받으면 => "환전할 금액이 없습니다."
            양수일 때 환전금액은 "00000원 입니다."
            음수일 때 "잘못 입력하셨습니다"
        */

        // 변수 설정
        int money;
        int exchangedMoney;
        int dollar = 1327;

        // 돈 입금받기
        System.out.println("입금할 금액을 입력해주세요.");
        Scanner scanner = new Scanner(System.in);
        money = scanner.nextInt();

        // 출력
        if (money == 0){
            System.out.printf("고객님이 입금한 금액은 %s원 입니다.\n", money);
            System.out.println("환전할 금액이 없습니다.");
        } else if (money < 0 ){
            System.out.println("잘못입력하셨습니다.");
        } else {
            exchangedMoney = money * dollar;
            System.out.printf("고객님이 입금한 금액은 %s원 입니다.\n", money);
            System.out.printf("고객님의 환전 금액은 %s원 입니다.", exchangedMoney);
        }

    }
}

