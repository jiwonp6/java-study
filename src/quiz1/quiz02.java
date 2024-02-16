package quiz1;

import java.util.Scanner;

// #10 퀴즈02 (2024-02-16)
public class quiz02 {
    public static void main(String[] args) {
        /*
            반복문 : 짝수의 합 구하기
            Scanner 클래스를 사용하여 사용자 입력을 받습니다.
            사용자로부터 두 정수 start와 end를 입력받아,
            start와 end 사이의 모든 짝수의 합을 계산하는 프로그램을 작성하세요
         */
        // 변수 설정
        int startNum = 0;
        int endNum = 0;
        int totNum = 0;
        int difference = 0;

        // 변수 입력 받기
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 두 개를 입력해주세요.");
        startNum = scanner.nextInt();
        endNum = scanner.nextInt();

        // 짝수 합 구하기
        if (startNum > endNum){
            int temp = 0;
            temp = startNum;
            startNum = endNum;
            endNum = startNum;
        }

        difference = endNum - startNum;
        for (int i = 0; i <= difference; i++) {
            if ((startNum + i) % 2 == 0){
                System.out.print((startNum + i));
                if (difference != i){
                        System.out.print(" + ");
                }
                totNum += (startNum+i);
            }
        }
        System.out.println(" = " + totNum);

    }
}
