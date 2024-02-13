package ch4_loop;
// #5-18  연습문제 - 숫자 맞추기 게임(2024-02-13)
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        /*
            숫자 맞추기 게임
            1 ~ 100 까지의 랜덤한 숫자
            응답한 숫자가 낮으면 낮다. 높으면 높다 고 대답하여 랜덤한 숫자를 추측합니다.
            정답을 맞추면 축하메시지를 출력해주세요

            Random random = new Random();
            int answer = random.nextInt(100) + 1; // 1 ~ 100까지 랜덤한 숫자
            System.out.println(answer);  // 답안 확인

            반복문과 조건문을 통해서 숫자 추측 게임을 만들어보세요!
        */
        // 변수 설정
        int num;
        int countNum=0;

        // 랜덤 숫자 생성
        int randomNum = (int) ((Math.random() * 100) + 1);       // 1 ~ 100 까지 랜덤한 난수 생성
        System.out.println(randomNum);

        // 정답 받기 - 반복문
        for ( ; ; ){
            // 숫자 받기
            System.out.println("1 ~100까지의 숫자 중 아무 숫자를 하나 입력해주세요.");
            Scanner scanner = new Scanner(System.in);
            num = scanner.nextInt();
            countNum++;
            System.out.print(countNum + "번째 시도 : ");

            // 조건 설정
            if (randomNum == num){
                System.out.println("정답입니다.");
                System.out.println(countNum + "번의 시도만에 정답을 맞추셨습니다.");
                break;
            } else {
                if (randomNum > num){
                    System.out.println("추측하신 숫자보다 큽니다.\n");
                }else if (randomNum < num){
                    System.out.println("추측하신 숫자보다 작습니다.\n");
                }
            }
        }
    }
}
