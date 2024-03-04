package ch21_exception;

public class Try3 {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int number = numbers[3];    // ArrayIndexOutOfBoundsException

            // 예외 발생할 경우 이후 코드 구문 실행 X, catch 블록으로 바로 넘어감
            int divedNum = 5 / 0;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("인덱스 범위를 초과했습니다. (" + e.getMessage() + ")");
        } catch (ArithmeticException e2){
            System.out.println("0으로 나눌 수 없습니다. (" + e2.getMessage() + ")");
        }
    }
}
