package ch26_lambda.function;

import java.util.function.*;

public class Function1 {
    /*
        java.util.function 패키지
        람다식을 위한 인터페이스를 미리 제공
     */
    public static void main(String[] args) {
        // 매개변수 X, 반환 값 X (java.lang 패키지)
        Runnable runnable;

        // 매개변수 O (1개 : <T>), 반환 값 X
        Consumer<Integer> consumer;

        // 매개변수 O (2개 : <T, U>), 반환 값 X
        BiConsumer<Integer, Integer> biConsumer;

        // 매개변수 X, 반환 값 O
        Supplier<Integer> supplier;

        // 매개변수 O (1개 : <T>), 반환 값(<R>) O
        Function<Integer, String> function;

        // 매개변수 O (2개 : <T, U>), 반환 값(<R>) O
        BiFunction<Integer, Integer, Integer> biFunction;

        // 매개변수 O (1개 : <T>), 반환 값(Boolean) O => 판별식
        Predicate<Integer> predicate;

        // 매개변수 O (2개 : <T, U>), 반환 값(Boolean) O => 판별식
        BiPredicate<Integer, Integer> biPredicate;

        // 매개변수 타입, 리턴 타입이 똑같은 형태의 Function => Operator
        UnaryOperator<Integer> unaryOperator;      // 단항 연산자

        BinaryOperator<Integer> binaryOperator;    // 이항 연산자

    }
}
