package quiz1;

import java.util.Scanner;

// #10 퀴즈01 (2024-02-16)
public class quiz01 {
    public static void main(String[] args) {
        /*
            조건문 : 달러를 원으로 환전하는 간단한 프로그램을 만들어주세요.
            Scanner 클래스를 사용하여 사용자 입력을 받습니다.
            if 문을 사용하여 분기를 나눕니다.
               1. 달러를 0원 입금 받으면 => "환전할 금액이 없습니다."
               2. 양수일 때 환전금액은 "00000원 입니다."
               3. 음수일 때 "잘못 입력하셨습니다"
         */
        // 변수 설정
        int dollar = 0;
        int won = 0;

        // 변수 입력 받기
        Scanner scanner = new Scanner(System.in);
        System.out.println("원화 환전을 원하는 달러 금액을 입력해주세요.(달러->원화)");
        dollar = scanner.nextInt();
        if (dollar == 0){
            System.out.println("환전할 금액이 없습니다.");
        } else if (dollar > 0) {
            won = dollar * 1335;
            System.out.println("환전 금액은 " + won + "원 입니다.");
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }
    }
}
