package n2.operator;
// #3-7 비교 연산자 (2024-02-08)
public class Operator7 {
    public static void main(String[] args) {
        /*
            <두 값을 비교할 때>
            == : equal to
            != : not equal to
             > : greater than
             < : less than
            >= : greater than equal to
            <= : less than equal to
            비교 연산자의 결과는 참 또는 거짓 
                => 즉, boolean 값
        */

        int a = 5;
        int b = 10;

        System.out.println(a == b);   // 5 == 10 : false
        System.out.println(a != b);   // 5 != 10 : true
        System.out.println(a > b);   // 5 > 10 : false
        System.out.println(a < b);   // 5 < 10 : true
        System.out.println(a >= b);   // 5 >= 10 : false
        System.out.println(a <= b);   // 5 <= 10 : true

        boolean result = (a == b);
        System.out.println("result = " + result);

    }
}
