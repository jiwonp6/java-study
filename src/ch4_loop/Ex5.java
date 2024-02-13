package ch4_loop;
// #5-15  연습문제 - 짝수 합 구하기(2024-02-13)
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        /*
            짝수의 합 구하기
            사용자로부터 두 정수 start와 end를 입력받아,
            start와 end 사이의 모든 짝수의 합을 계산하는 프로그램을 작성하세요.
         */
        // 변수 설정
        int startNum;
        int endNum;
        int num;
        int sum = 0;

        // 변수 입력받기
        System.out.println("시작 정수 : ");
        Scanner scanner1 = new Scanner(System.in);
        startNum = scanner1.nextInt();
        
        System.out.println("끝 정수 : ");
        Scanner scanner2 = new Scanner(System.in);
        endNum = scanner2.nextInt();

        if (startNum <= endNum){
            for (int i=0; startNum+i<=endNum; i++){
                num = startNum+i;
                if (num%2==0){
                    System.out.println(num);
                    sum += num;
                }
            }
                    System.out.println("총 합은 " + sum);
        }else {
            System.out.println("끝정수가 시작정수보다 큰 수가 되도록 입력해야 합니다.");
        }

    }
}
