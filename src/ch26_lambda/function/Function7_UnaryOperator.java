package ch26_lambda.function;

import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Function7_UnaryOperator {
    public static void main(String[] args) {
        // UnaryOperator(단항) : 입력 타입과 결과 타입이 모두 같을 때
        UnaryOperator<Integer> powerOperator = x -> x * x;
        System.out.println("5 * 5 = " + powerOperator.apply(5));

        // BinaryOperator(이항)
        BinaryOperator<Integer> sumOperator = (x, y) -> x + y;
        System.out.println("20 + 30 = " + sumOperator.apply(20, 30));

    }
}
