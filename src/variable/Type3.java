package variable;
//#2-11 자동 타입 변환(2024-02-07)
public class Type3 {
    public static void main(String[] args) {
        // 자동 타입 변환 (Promotion): 허용범위가 작은 타입이 큰 타입으로 저장될 때
        // byte > short > int > long > float > double

        // 정수 타입이 실수 타입으로 저장될 경우 무조건 자동 타입 변환
        byte b = 10;
        int i = b;      // 자동으로 타입 변환
        long l = i;     // 자동으로 타입 변환
        float f = l;    // 자동으로 타입 변환
        double d = f;   // 자동으로 타입 변환

        System.out.println("b = " + b);
        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("f = " + f);
        System.out.println("d = " + d);

        //



    }
}
