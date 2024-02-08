package operator;
// #3-12 연습문제7 (2024-02-08)
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        /*
            int형 변수 score를 선언하고
            score가 80점 이상이고 100점 이하면 true를 출력, 아니면 false를 출력하세요.
         */

        // 변수 선언
        int score;

        System.out.println("점수를 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        if(score >= 80 && score <=100 ){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
