package ch26_lambda.lambda4;

public class Lambda4 {
    public static void main(String[] args) {
        // 반환 값만 있는 경우, 중괄호{ } 와 return 생략 가능
        // 매개변수가 하나만 있는 경우, 소괄호 ( ) 생략 가능
        Param multiply = x -> x * x;
        // = Param multiply = (x) -> { return x * x };

        System.out.println("4 * 4 = " + multiply.func(4));

    }
}
