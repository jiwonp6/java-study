package ch07_method;

// #8-1 메소드 (2024-02-15)
public class Method1 {
    public static void main(String[] args) {
        // 덧셈 연산
        int x1 = 1;
        int y1 = 2;
        int sum1 = x1 + y1;

        System.out.println("x1 + y1 = " + sum1);

        int x2 = 3;
        int y2 = 2;
        int sum2 = x2 + y2;

        System.out.println("x2 + y2 = " + sum2);

        /*
            같은 기능을 하는 것 => 함수로 만듦
            함수 (function) : 값을 입력하면, 연산을 처리하여 결과를 출력
                -> 자바에서는 함수를 메서드(Method)라고 한다.
         */
        /*
            [리턴 타입][메소드 이름]([매개변수 ...]) {
                // 실행할 코드
            }
         */

        sum(1, 2);  // 메소드 호출

        int number = sum(15, 40);
        System.out.println("number = " + number);

    }
    // sum 메소드
    public static int sum(int x, int y){      // 메소드 시그니처
        int sum = x + y;
        System.out.println("x + y = " + sum);
        return sum;     // 반환 결과
    }
}
