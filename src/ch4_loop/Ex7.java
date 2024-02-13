package ch4_loop;
// #5-17  연습문제 - LCM, GCD 구하기(2024-02-13)
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        /*
            최대공약수와 최소공배수 구하기
            두 개의 자연수를 입력받아, 유클리드 호제법을 사용하여
            최대 공약수(GCD)와 최소 공배수(LCM)를 찾는 프로그램을 작성하세요.
            최소 공배수는 두 수의 곱을 최대 공약수로 나눈 값으로 구할 수 있습니다.
         */
        // 변수 설정
        int num1;   // 사용자로부터 입력받는 수
        int num2;

        int a;      // 수 설정
        int b;

        int gcd=0;    // 최대공약수
        int lcm;    // 최소공배수 = (num1 * num2) / gcd

        int quotient;   // 몫
        int mod = 1; // 나머지

        // 변수 입력받기
        System.out.print("첫 번째 숫자: ");
        Scanner scanner1 = new Scanner(System.in);
        num1 = scanner1.nextInt();

        System.out.print("두 번째 숫자: ");
        Scanner scanner2 = new Scanner(System.in);
        num2 = scanner2.nextInt();

        // 반복문으로 gcd 구하기 ~ 유클리드 호제법 이용
            // num1 = num2 * quotient + mod -> num2 = mod * quotient + mod'
        if(num1>=num2){     // 큰 수 설정
            a = num1;
            b = num2;
        }else {
            a = num2;
            b = num1;
        }
        for(;;){        // 반복문으로 최대공약수 구하기
            if (mod!=0){
                mod = a % b;
                if (mod==0){
                    gcd = b;
                    System.out.println("최대공약수(GCD) : " + gcd);
                }
                a = b;
                b = mod;
            }else {
                break;
            }
        }
        // lcm 구하기
        lcm = (num1 * num2) / gcd;
        System.out.println("최소공배수(LCM) : " + lcm);

    }
}