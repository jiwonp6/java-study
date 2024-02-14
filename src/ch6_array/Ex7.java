package ch6_array;

import java.util.Scanner;

// #7-15 연습문제 (2024-02-14)
public class Ex7 {
    public static void main(String[] args) {
        /*
            <선형탐색>
            정수 배열에 임의의 정수들이 존재합니다.
            해당 배열을 출력하고, 사용자에게 특정 값을 입력받아
            특정 값이 배열 내에 존재하는지 확인하는 프로그램을 작성하세요
            예시
            int[] numbers = {10, 54, 23, 45, 8, 5};

            찾는 값을 입력하세요 > 23
            배열의 3번째 위치에 존재합니다.
            (종료)
            찾는 값을 입력하세요 > 24
            배열에 존재하지 않습니다.
         */
        // 변수 설정
        boolean exist = false;
        int existNum = 0;

        // 배열 생성
        int[] numbers = {10, 54, 23, 45, 8, 5};

        // 사용자에게 특정 값 입력받기
        System.out.println("숫자를 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        // 배열 출력 및 존재 확인
        for (int i=0; i < numbers.length; i++){
            System.out.print(numbers[i] + "\t");
            if (num == numbers[i]){
                exist = true;
                existNum = (i + 1);
                // break;       // 배열 다 출력 안하고 존재여부만 확인 하려면 break 추가하는게 빠름
            }
        }
        
        // 존재확인 문구 출력
        if (exist){
            System.out.println("\n입력하신 숫자 " + num + "이(가) " + existNum + "번째에 존재합니다.");
        }else {
            System.out.println("\n입력하신 숫자 " + num + "이(가) 존재하지 않습니다.");
        }

        /*
            Big O 표기법으로 최악의 경우 0(n) 만큼 탐색한다.
         */

    }
}
