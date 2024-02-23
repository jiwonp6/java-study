package test;

import java.util.Random;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Random random = new Random();
        int  randomNum = random.nextInt(100) + 1;
        System.out.println(randomNum);

        Scanner scanner = new Scanner(System.in);

        int index = 0;

        for (;;) {
            System.out.println("1 ~ 100 중에서 숫자를 맞춰보세요.");
            int answer = scanner.nextInt();
            index++;
            if (randomNum == answer){
                System.out.println("정답입니다. " + index + "번만에 맞추셨네요!");
                break;
            } else if (randomNum > answer) {
                System.out.println("낮은 숫자를 말하셨네요. 높은 숫자를 찾아주세요.");
            } else if (randomNum < answer) {
                System.out.println("높은 숫자를 말하셨네요. 낮은 숫자를 찾아주세요.");

            }

        }
    }
}
