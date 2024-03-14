package ch25_collection.n1_list.ex2;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {
    /*
        정수를 저장하는 ArrayList를 생성하고, 1부터 10까지의 숫자를 추가하세요.
        그리고 이 리스트에서 짝수만 찾아 출력하는 프로그램을 작성하세요.
     */
    public static void main(String[] args) {
        // ArrayList 생성
        List<Integer> nums = new ArrayList<>();

        // 정수 저장
        for (int i = 0; i < 10; i++) {
            nums.add(i+1);
        }

        // 짝수 출력
        for (int i = 0; i < nums.size(); i++) {
            int num = (nums.get(i));
            if ((num % 2) == 0){
                System.out.print(nums.get(i) + "\t");
            }
        }

    }

}
