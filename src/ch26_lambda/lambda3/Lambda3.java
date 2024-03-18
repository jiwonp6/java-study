package ch26_lambda.lambda3;

public class Lambda3 {
    public static void main(String[] args) {
        // 매개변수 X, 반환값 O 인 람다식
        Returner returner1 = () -> { return "반환값"; };
        System.out.println(returner1.returnObj());

        // 괄호 생략
        Returner returner2 = () -> "반환식만 있을 경우 괄호와 return을 생략 가능";
        System.out.println(returner2.returnObj());


    }
}
