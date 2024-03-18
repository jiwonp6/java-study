package ch26_lambda.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Function5_Function {
    public static void main(String[] args) {
        // Function : 입력 -> 반환값
        Function<String, Integer> strLengthFunction = str -> str.length();
        Integer i = strLengthFunction.apply("이 문자열의 길이를 반환");
        System.out.println("문자열의 길이 : " + i);

        // BiFunction : 입력을 2가지로 받아 결과를 리턴, 타입이 다를 수 있음.
        BiFunction<String, String, Integer> concatLength = (s1, s2) -> (s1 + s2).length();

        Integer length = concatLength.apply("문자열의 길이 합", "길이 합을 정수로 반환");
        System.out.println("length = " + length);

    }
}
