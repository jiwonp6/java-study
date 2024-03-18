package ch26_lambda.lambda1;

@FunctionalInterface
public interface Calculable {
    // 입력값이 2개, 리턴값이 없는 추상 메소드 1개
    void calculate(int x, int y);

    // void plus(int x, int y);     추상 메소드 2개 이상 선언 불가능
}
