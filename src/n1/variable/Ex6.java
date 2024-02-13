package n1.variable;
//#2-18 연습문제 6 - promotion & casting(2024-02-07)
public class Ex6 {
    public static void main(String[] args) {
        // Q. 빈 칸을 채우고 타입이 어떻게 왜 변하는지 스스로에게 설명해주세요.
        // 프로모션 문제
        int num1 = 10;
        long num2 = 20L;
        long result = num1+num2;    // long, float, double 가능

        System.out.println("int num1 : " + num1 + ", long num2 : " +num2 + ", num1 + num2 : " + result);

        // 캐스팅 문제
        double num3 = 10.5;
        int result2 = (int)num3;

        System.out.println("num3 : " +num3 + ", double로 받은 num3를 int로 변환 : " + result2);

        // 프로모션과 캐스팅
        int num4 = 10;
        double num5 = 5.5;
        int result3 = num4 + (int)num5;

        System.out.println("int num4 : " + num4 + ", double num5 : " +num5 + ", num4 + num5를 int로 변환 : " + result3);
    }

}
