package ch26_lambda.lambda5;

public class Lambda5 {
    public static void main(String[] args) {
        // 매개변수가 2개인 람다식
        // 리턴 값만 한 줄인 경우 return 생략, { } 생략
        Params add = (x, y) -> x + y;                           // 순수함수
        int addFunc = add.func(10, 20);
        System.out.println("10 + 20 = " + addFunc);

        // 본문이 여러 줄인 경우, { } 추가, return 필수
        Params addAndPrint = (x, y) -> {
            int result = x + y;
            System.out.printf("%d + %d = %d", x, y, result);    // 순수함수 X
            return result;
        };
        addAndPrint.func(30, 40);
    }
}
