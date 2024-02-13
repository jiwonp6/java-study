package n1.variable;
//#2-13 다양한 타입값의 연산(2024-02-07)
public class Type5 {
    public static void main(String[] args) {

        byte v1 = 10;
        int v2 = 100;
        long v3 = 1000L;


        // 정수 연산 시 가장 큰 타입에 넣으면 Promotion 됨
        long result = v1 + v2 + v3;
        System.out.println("result = " + result);

        // 캐스팅을 통해 변환 가능
        int result2 = (int)( v1 + v2 + v3 );
        // int result2 = v1 + v2 + v3;      <- 작은 타입으로 담을 시 컴파일 에러 발생
        System.out.println("result2 = " + result2);

        // 정수 나눗셈 시 버림 발생
        int v4 = 10 / 4;
        System.out.println("v4 = " + v4);

        //int v5 = 10 / 4.0;   컴파일 에러 발생
        double v5 = 10 / 4;   // double (10/4) 의 경우는 [int/int -> int -> double]로 인식
        double v6 = 10 / 4.0;   // double (10/4.0) 의 경우는 [int/double -> double]로 인식
        System.out.println("v5 = " + v5);
        System.out.println("v6 = " + v6);


    }
}
