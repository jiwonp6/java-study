package quiz.quiz5.q2;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Quiz02 {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> lottoNums = new HashSet<>();
        while (true) {
            int randomNum = random.nextInt(45) + 1;
            lottoNums.add(randomNum);
            if (lottoNums.size() >= 6){
                break;
            }
        }
        System.out.print("로또번호: ");
        for (Integer lottoNum : lottoNums) {
            System.out.print(lottoNum + "\t");
        }

    }
}
