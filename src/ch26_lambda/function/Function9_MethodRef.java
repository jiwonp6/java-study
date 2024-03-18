package ch26_lambda.function;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;

public class Function9_MethodRef {
    // 메소드 참조 (MethodReference)
        // : 이미 선언된 메소드 또는 생성자 이름을 참조하여 람다식에 축약형으로 사용할 수 있게 함.
    public static void main(String[] args) {
        // * 최대값을 구하는 람다식
        BinaryOperator<Integer> returnMax = (left, right) -> Math.max(left, right);
                                            // 입력값 변수        // 본문에 저달
        // 불필요한 매개변수(전달 역할만 하는)를 지우고 축약형으로 나타냄 // = Math::max;
        Integer max = returnMax.apply(10, 20);
        System.out.println("max = " + max);

        /*
            <정적 메소드 참조할 경우>
            클래스 이름 :: 메소드 이름 으로 사용가능

            <인스턴스 메소드 참조할 경우>
            참조변수 이름 :: 메소드 이름
         */

        // * 메소드 참조를 사용
        Consumer<String> printerWithLambda = x -> System.out.println(x);
        Consumer<String> printer = System.out::println;  // 메소드의 참조값 주소
        printer.accept("출력 함수");

        int i1 = Integer.parseInt("123");
        Function<String, Integer> strToIntFunction = Integer::parseInt;
        Integer i2 = strToIntFunction.apply("123");


    }
}
