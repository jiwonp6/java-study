package ch1_variable;
//#2-4 두 변수의 값을 교환하기(2024-02-07)
public class Var4 {
    public static void main(String[] args) {
        /*
            두 변수의 값을 바꾸는 순서
            {a, b, temp}
            1. a->temp
            2. b->a
            3. temp->b
            => a->b, b->a
         */
        int a = 10;
        int b = 20;
        int temp;

        System.out.println("원래 값 ) " + "a : " + a + ", b : " + b );

        temp = a;   // temp <- a
        a = b;  // a <- b
        b = temp;   // b <- temp

        System.out.println("바뀐 값 ) " + "a : " + a + ", b : " + b + ", temp : " + temp );


    }
}
