package ch06_array;
// #7-5 연습문제 (2024-02-14)

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        /*
            5개의 정수를 입력받아서, 배열에 저장하고, 입력 순서대로 출력해보세요.
            <예시>
            정수를 5개 입력하세요.
            1
            2
            3
            4
            5
            >> 1, 2, 3, 4, 5
         */

        // 변수 선언
        int[] num = new int[5];

        // 반복문으로 값 배정
        System.out.println("정수 5개를 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i < num.length; i++){
            num[i] = scanner.nextInt();
        }
        
        // 반복문으로 출력
        System.out.print("[ ");
        for (int i=0; i < num.length; i++){
            System.out.print(num[i]);
            if(i != (num.length-1)){
                System.out.print( ", ");
            }
        }
        System.out.print(" ]");

    }
}
