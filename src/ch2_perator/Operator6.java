package ch2_perator;
// #3-6 부호 연산자 (2024-02-08)
public class Operator6 {
    public static void main(String[] args) {

        int x = -100;

        int result1 = +x;       // 부호를 그대로

        System.out.println("result1 = " + result1);     // -100

        int result2 = -x;       // 부호를 바꿔서

        System.out.println("result2 = " + result2);     // 100
    }
}
