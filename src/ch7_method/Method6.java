package ch7_method;
// #8-6 메소드 (2024-02-15)
public class Method6 {
    public static void main(String[] args) {
        int num = 3;
        System.out.println("1. 메소드 호출 전 : " + num);     // 3
        num = multiply2(num);
        System.out.println("4. 메소드 호출 후 : " + num);     // 3(x) -> 6(o)
    }

    public static int multiply2(int num){       // 리턴값 들고 가기 때문에 void -> int로 변경
        System.out.println("2. 메소드 연산 실행 전 : " + num);   // 3
        num = num * 2;
        System.out.println("3. 메소드 연산 실행 후 : " + num);   // 6
        return num;     // num 값 들고 메인 메소드로 가도록 리턴값에 넣어줌
    }
}
