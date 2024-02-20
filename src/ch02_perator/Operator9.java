package ch02_perator;
// #3-9 논리연산자 (2024-02-08)
public class Operator9 {
    public static void main(String[] args) {
        // boolean 형인 true와 false를 비교하는데 사용
        /*
            && : and, 두 피연산자가 모두 참이면 참, 하나라도 거짓이면 거짓
            || : or, 두 피연산자 중 하나만 참이라도 참
            !  : not, 참이면 거짓, 거짓이면 참
         */
        System.out.println("<And 연산>");
        System.out.println(true && true);       // true
        System.out.println(true && false);      // false
        System.out.println(false && true);      // false
        System.out.println(false && false);     // false

        System.out.println("\n<Or 연산>");
        System.out.println(true || true);       // true
        System.out.println(true || false);      // true
        System.out.println(false || true);      // true
        System.out.println(false || false);     // false

        System.out.println("\n<Not 연산>");
        System.out.println(!true);       // false
        System.out.println(!false);      // true


        /*
            <예제>
            x = 15 일 때,
            x는 10보다 크고 20보다 작다
         */
        System.out.println("\n<예제>");

        int x = 15;
        boolean result = ( (x > 10) && (x < 20) );

        System.out.println("result = " + result);


    }
}
