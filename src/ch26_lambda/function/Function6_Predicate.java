package ch26_lambda.function;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Function6_Predicate {
    public static void main(String[] args) {
        // Predicate : 입력에 대해 참 거짓 여부 평가
        Predicate<String> isTenUpper = str -> str.length() > 10;
        if(isTenUpper.test("이 글자의 길이는 10글자 이상인가요?")){
            System.out.println("10글자 이상입니다.");
        } else {
            System.out.println("10글자 미만입니다.");
        }

        // 매개변수 및 다른 타입을 2가지 넣어 판별
        BiPredicate<Character, Integer> isSameNum = ((character, integer) -> (int) character == integer);
        boolean a = isSameNum.test('A', 65);
        boolean b = isSameNum.test('B', 65);

        System.out.println("A의 유니코드는 65인가요? : " + a);
        System.out.println("B의 유니코드는 65인가요? : " + b);

    }
}
