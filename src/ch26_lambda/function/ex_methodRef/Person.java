package ch26_lambda.function.ex_methodRef;

import java.util.function.BinaryOperator;

public class Person {
    public void action(BinaryOperator<Integer> binaryOperator){
        Integer result = binaryOperator.apply(10, 4);
        System.out.println("result = " + result);
    }
}
