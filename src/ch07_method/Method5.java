package ch07_method;
// #8-5 메소드 (2024-02-15)
public class Method5 {
    public static void main(String[] args) {
        int num = 3;
        System.out.println("1. 메소드 호출 전 : " + num);     // 3
        multiply2(num);
        System.out.println("4. 메소드 호출 후 : " + num);     // 6(x) -> 3(o)
            // 자바에서 메소드는 변수의 값을 복사해서 대입 -> 메소드가 끝났기때문에 num은 6이 아니라 3
            // 즉, 다른 메소드에서 변경된 num의 값은 메인 메소드의 num에 영향을 주지 않는다.
    }

    public static void multiply2(int number){
        // 메인 메소드의 num과 multiply2의 number는 다른 값이다.
            // => 메인 메소드의 num을 복사한 값이다.
        System.out.println("2. 메소드 연산 실행 전 : " + number);   // 3
        number = number * 2;
        System.out.println("3. 메소드 연산 실행 후 : " + number);   // 6
    }
}
