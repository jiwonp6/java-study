package n4.loop;

import java.util.Scanner;

// #5-20  연습문제 - 은행 앱(2024-02-13)
public class Ex10 {
    public static void main(String[] args) {
        /*
            은행 앱
            -----------------------------------
            1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료
            -----------------------------------
            <선택>
            1. 번을 선택할 경우
                예금액 > 10000 => 잔고에 10000원이 입금
            2. 번을 선택할 경우
                출금액 > 1000 => 잔고에 1000원이 출금
            3. 번을 선택할 경우
                잔고액 > 9000 => 잔고액 확인 가능
            4. 번을 선택할 경우
                "프로그램이 종료됩니다."
         */
        // 변수 설정
        int choiceNum;
        int totMoney = 0;
        int withdraw;   // 예금 인출
        int deposit;    // 입금

        boolean isRun = true;

        // 반복문
        while (isRun){
            // 입력받기
            System.out.println(" ----------------------------------- ");
            System.out.println(" 1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println(" ----------------------------------- ");
            System.out.println(" 원하시는 상품의 번호를 입력해주세요. ");
            Scanner scanner = new Scanner(System.in);
            choiceNum = scanner.nextInt();

            // 조건문
            switch (choiceNum){
                case 1 :
                    System.out.println("예금액을 입력해주세요");
                    deposit = scanner.nextInt();
                    totMoney += deposit;
                    System.out.println("예금액 : " + deposit + "원");
                    System.out.println("잔액 : " + totMoney + "원");
                    continue;
                case 2 :
                    System.out.println("출금액을 입력해주세요");
                    withdraw = scanner.nextInt();
                    if (totMoney>=withdraw){
                        totMoney -= withdraw;
                        System.out.println("출금액 : " + withdraw + "원");
                        System.out.println("잔액 : " + totMoney + "원");
                    }else {
                        System.out.println("출금 희망 금액 : " + withdraw + "원");
                        System.out.println("잔액 : " + totMoney + "원");
                        System.out.println("잔고 부족으로 출금 불가합니다.");
                    }
                    continue;
                case 3 :
                    System.out.println("잔고 : " + totMoney + "원");
                    continue;
                case 4 :
                    System.out.println("프로그램 종료");
                    isRun = false;

            }


        }
    }
}
