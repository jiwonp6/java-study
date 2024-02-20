package ch01_variable;
//#2-8 연습문제 3(2024-02-07)
public class Ex3 {
    public static void main(String[] args) {
        // 100억을 담는 변수를 선언하세요.
        // 그 변수를 출력해보세요.
        // boolean 타입의 변수를 선언하고 출력해보세요.

        long num = 10_000_000_000L;

        System.out.println(num);

        boolean result;

        System.out.printf("If num is large than 10,000, Result is 'true'. If not result is 'false' \n");
        if (num>10000){
            result = true;
            System.out.println("num : " + num + ", result : " + result);
        }else {
            result = false;
            System.out.println("num : " + num + ", result : " + result);
        }

    }
}
