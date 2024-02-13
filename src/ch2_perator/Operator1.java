package ch2_perator;
//#3-1 산술연산(arithmetic operator) (2024-02-08)
public class Operator1 {
    public static void main(String[] args) {
        int x = 6;
        int y = 5;

        // 덧셈
        int sum = x + y;
        System.out.println("sum = " + sum);

        // 뺄셈
        int sub = x - y;
        System.out.println("sub = " + sub);

        // 곱셈
        int mul = x * y;
        System.out.println("mul = " + mul);

        // 나눗셈 => 몫
        int div = x / y;
        System.out.println("div = " + div);

        double div2 = (double) x / y;
        System.out.println("div2 = " + div2);

        // 나머지
        int mod = x % y;
        System.out.println("mod = " + mod);

        // 숫자는 0으로 나눌 수 없다!
        


    }
}
