package ch01_variable;

import java.util.Scanner;

//#2-19 연습문제 7 - promotion & casting(2024-02-07)
public class Ex7 {
    public static void main(String[] args) {
        /*
            Scanner를 이용해서 변수에 입력을 받고 출력하는 코드를 작성해주세요
            1. 이름: ________ (enter)
            2. 주민번호앞자리: _______ (enter)
            3. 전화번호: ______ (enter)

            (입력한 이름, 주민번호, 전화번호 출력)
         */
        String name;
        String personalNum;
        String tel;

        // 이름 받기
        System.out.print("1. 이름 : ");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        
        // 주민번호앞자리 받기
        System.out.print("2. 주민번호앞자리 : ");
        Scanner scanner2 = new Scanner(System.in);
        personalNum = scanner2.nextLine();
        
        // 전화번호 받기
        System.out.print("3. 전화번호 : ");
        Scanner scanner3 = new Scanner(System.in);
        tel = scanner3.nextLine();

        // 받은 정보 출력
        System.out.print("\n<받은 정보>\n");
        System.out.println("1. 이름 : " + name);
        System.out.println("2. 주민번호앞자리 : " + personalNum);
        System.out.println("3. 전화번호 : " + tel);

    }
}
