package ch6_array;
// #7-14 연습문제 - 배열 내 최대 최소 찾기 (2024-02-14)

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        /*
            입력받을 숫자 : 4
            4개의 정수를 입력하세요
            76
            5
            23
            9
            최대값 : 76, 최소값 : 5
         */
        // 변수 설정
        int num;

        int max = 0;
        int min = 0;

        int[] array;

        // 변수 입력받기
        System.out.println("입력받을 숫자 갯수 : ");    // 배열 길이
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        
        array = new int[num];   // 배열 길이만큼 배열 생성 
        
        System.out.println("숫자를 입력해주세요 : ");    // 숫자 입력받기
        
        // max, min 계산
        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
            if (i == 0){
                max = array[i];
                min = array[i];
            } else if (array[i] >= max){
                max = array[i];
            } else if (array[i] <= min){
                min = array[i];
            } else {
                System.out.println("오류발생");
            }
        }
        
        // 출력
        System.out.println("최댓값 : " + max);
        System.out.println("최솟값 : " + min);




    }
}
