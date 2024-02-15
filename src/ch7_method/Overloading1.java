package ch7_method;
// #8-10 오버로딩 (2024-02-15) : 한 이름에 여러 개의 메소드 넣기
public class Overloading1 {
    /*
        메소드 오버로딩
        - 같은 이름의 메소드를 여러 개 정의하는 것
        - 메소드의 이름은 같지만, 매개변수의 개수가 다르거나, 타입이 다르거나, 타입의 순서가 다르면 오버로딩이 가능하다.
        - 리턴타입만 다른 경우에는 오버로딩이 되지 않는다.
        - 오버로딩된 메소드는 모두 같은 클래스에 정의되어야 한다.
     */
    public static void main(String[] args) {
        System.out.println(add(1, 2));      // 두 수를 더하는 메소드
        System.out.println(add(1, 2, 5));      // 세 수를 더하는 메소드
        System.out.println(add(1.0, 2.5));      // 두 실수를 더하는 메소드
        System.out.println(add(1, 7.4));      // 두 실수를 더하는 메소드
        System.out.println(add("1", "5"));      // 두 문자열을 연결하는 메소드
    }

    // 두 수 덧셈
    public static int add(int x, int y){
        System.out.println("<두 수를 더하는 메소드>");
        return x + y;
    }
    
    // 세 수 덧셈
    public static int add(int x, int y, int z){
        System.out.println("<세 수를 더하는 메소드>");
        return x + y + z;
    }

    // 두 실수 덧셈
    public static double add(double x, double y){
        System.out.println("<두 실수를 더하는 메소드>");
        return x + y;
    }

    // 정수와 실수 덧셈
    public static double add(int x, double y){
        System.out.println("<정수와 실수를 더하는 메소드>");
        return x + y;
    }

    // String -> 두 문자열 연결
    public static String add(String x, String y){
        System.out.println("<두 문자열을 연결하는 메소드>");
        return x + y;
    }




}
