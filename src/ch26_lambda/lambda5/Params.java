package ch26_lambda.lambda5;

@FunctionalInterface
public interface Params {
    // 매개변수를 두 개 받는 경우
    int func(int x, int y);
}
