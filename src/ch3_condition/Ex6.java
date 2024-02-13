package ch3_condition;
// #4-12 연습문제6(2024-02-08)

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        /*
            회원의 등급이 A, B, C, D가 있습니다.
            등급이 A일 경우 : VVIP와 VIP 혜택
            등급이 B일 경우 : VIP 혜택
            등급이 C일 경우 : 우수회원과 일반회원 혜택
            등급이 D일 경우 : 일반회원 혜택
            모든 경우 마지막에는 "감사합니다"를 출력합니다.
            Switch문을 활용해서 각 등급마다 혜택을 받는 조건문 프로그래밍을 만들어주세요.
        */
        // 변수설정
        String grade;

        // 변수 입력받기
        System.out.println("회원 등급을 입력해주세요. (A, B, C, D)");
        Scanner scanner = new Scanner(System.in);
        grade = scanner.nextLine();
        
        // 조건부 출력
        switch (grade){
            case "A":
                System.out.println("회원등급 A로 VVIP와 VIP 혜택 이용가능합니다.");
                break;
            case "B":
                System.out.println("회원등급 B로 VIP 혜택 이용가능합니다.");
                break;
            case "C":
                System.out.println("회원등급 C로 우수회원 혜택 이용가능합니다.");
                break;
            case "D":
                System.out.println("회원등급 D로 일반회원 혜택 이용가능합니다.");
                break;
            default:
                System.out.println("잘못 입력하셨습니다.");
                break;
        }

        System.out.println("회원님 이용해주셔서 감사합니다.");
        
    }
}
