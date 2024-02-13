package ch1_variable;
//#2-12 강제 타입변환(2024-02-07)
public class Type4 {
    public static void main(String[] args) {
        // 강제 타입 변환 (Casting): 허용범위가 큰 타입이 작은 타입으로 강제로 저장될 때
        // byte > short > int > long > float > double

        // byte > int
        int i = 10;
        byte b = (byte)i;   // 작은 타입으로 강제로 변환, 캐스팅 연산자 사용

        System.out.println("i = " + i);
        System.out.println("b = " + b);

        // 실수 타입이 정수 타입으로 캐스팅 될 경우 소수점 이하 부분 버림
        double d = 3.14;
        int i2 = (int)d;

        System.out.println("d = " + d);
        System.out.println("i2 = " + i2);

    }
}
