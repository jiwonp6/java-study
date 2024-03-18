package ch26_lambda.lambda1;

public class Lambda1 {
    public static void main(String[] args) {
        // 익명 객체
        action(new Calculable() {
            @Override
            public void calculate(int x, int y) {
                int result = x + y;
                System.out.println(result);
            }
        });

        // 위의 식을 람다식으로 변경 => 매개변수가 2개고 리턴값이 없는 람다식
        action((x, y) -> {
            int result = x + y;
            System.out.println(result);
        });

    }

    // 매개변수에 함수형 인터페이스 사용한 메소드
    static void action(Calculable calculable){
        int x = 10;
        int y = 4;

        calculable.calculate(x, y);
        // = calculable.calculate(10, 4);

    }

}
