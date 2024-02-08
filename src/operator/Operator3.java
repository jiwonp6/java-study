package operator;
// #3-3 연산자의 우선순위 (2024-02-08)
public class Operator3 {
    public static void main(String[] args) {
        // 원래의 수학 공식대로 * 먼저 진행 후 +
        int sum1 = 1 + 2 * 3;
        System.out.println("sum1 = " + sum1);

        // 괄호 ( ) 사용해서 우선순위 변경
        int sum2 = (1 + 2) * 3;
        System.out.println("sum2 = " + sum2);

        // 괄호 ( ) 사용해서 명확하게 표현하는 것이 유지보수에 용이
        int sum3 = 2 * 2 + 3 * 3;
        System.out.println("sum3 = " + sum3);

        int sum4 = (2 * 2) + (3 * 3);
        System.out.println("sum4 = " + sum4);
        
        /*
            연산자 우선순위
            1. 괄호 ( )
            2. 단항 연산자 ++, --, !, (int) 등
            3. 산술 연산자 *, / 다음에 +, -
            4. Shift 연산자 <<. >>
            5. 비교 연산자 <, >, <=. >=
            6. 등식 연산자 ==, !=
            7. 비트 연산자 &, ^, |
            8. 논리 연산자 &&, ||
            9. 삼항 연산자 ?, :
            10. 대입 연산자 = 등
         */
        

    }
}
