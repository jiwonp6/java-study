package ch07_method;
// #8-9 메소드 (2024-02-15)
public class Method7 {
    public static void main(String[] args) {
        int num = 10;
        double num2 = 10.5;
        
        // printNum 메소드 호출
        printNum(num);
        // printNum(num2);     // int 타입 매개변수에 double 타입을 대입하면 컴파일 에러 발생
        printNum((int) num2);   // 타입 캐스팅을 통해 형 변환하여 호출

        // printDouble 메소드 호출
        printDouble(num);       // 프로모션(자동 형변환)
        printDouble(num2);
    }

    public static void printNum(int number){    // 매개변수 타입 : int
        System.out.println("숫자는 " + number);
    }

    public static void printDouble(double number){      // 매개변수 타입 : double
        System.out.println("숫자는 " + number);
    }
}
