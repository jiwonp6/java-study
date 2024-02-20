package ch02_perator;
// #3-4 증감 연산자 (2024-02-08)
public class Operator4 {
    public static void main(String[] args) {

        int x = 0;

        x = x + 1;      // 1 증가
        System.out.println("x = " + x);

        x = x + 1;      // 1 증가
        System.out.println("x = " + x);

        ++x;    // x = x + 1
        System.out.println("x = " + x);

        x++;    // x = x + 1
        System.out.println("x = " + x);

        --x;
        System.out.println("x = " + x);

        x--;
        System.out.println("x = " + x);

    }
}
