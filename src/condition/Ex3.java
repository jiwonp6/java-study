package condition;
// #4-12 연습문제3(2024-02-08)

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        /*
            주차요금 계산하는 프로그램
            응용 문제 3: 주차 요금 계산기
            주차장을 사용한 시간(시간 단위)을 사용자로부터 입력받아,
            주차 요금을 계산하는 프로그램을 작성하세요.
            기본 요금은 2시간까지 5000원이고, 이후부터는 30분마다 1000원씩
            추가 요금이 발생합니다.
            24시간을 초과하는 주차의 경우에는 일일 최대 요금인 30000원을 적용하세요.
        */

        // 변수 설정
        int time;
        int parkingFee;
        int first2HsFee = 5000;
        int nextMinsFee = 1000;

        // 변수 입력받기
        System.out.println("주차장 사용시간을 입력해주세요.");
        Scanner scanner = new Scanner(System.in);
        time = scanner.nextInt();

        // 주차요금 계산 후 출력
        if(time >=0 && time <= 2){
            System.out.println("주차 요금은 5000원입니다.");
        } else if (time > 2){
            int nextMins = (time - 2) * 60 ;
            parkingFee = (first2HsFee + (nextMins/30 * nextMinsFee));
            System.out.printf("주차 요금은 %s원입니다.", parkingFee);
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }
    }
}
