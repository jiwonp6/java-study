package ch26_lambda.lambda2;

public class Lambda2 {
    public static void main(String[] args) {
        // 익명 객체
        Printer annoymousPrinter = new Printer() {
            @Override
            public void print() {
                System.out.println("익명 객체에서 본문 선언하여 출력");
            }
        };
        annoymousPrinter.print();

        // 기본 람다식
        Printer lambdaPrinter = () ->{
            System.out.println("람다식으로 본문 선언하여 출력");
        };
        lambdaPrinter.print();

        // 중괄호 생략, 리턴 값 X 람다식
        Printer noReturnPrinter = () -> System.out.println("중괄호 생략, 리턴 값 X인 한 줄 짜리 람다식");
        noReturnPrinter.print();

        // 여러 줄 람다식
        Printer twoLinePrinter = () -> {
            System.out.println("여러 줄 있는 경우에는");
            System.out.println("람다식 본문 부분 중괄호 필요");
        };
        twoLinePrinter.print();

    }
}
