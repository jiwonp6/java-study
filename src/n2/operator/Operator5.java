package n2.operator;
// #3-5 증감 연산자2 (2024-02-08)
public class Operator5 {
    public static void main(String[] args) {
        // 전위(Prefix) 증가 연산자 : x의 값을 먼저 증가 시키고, 그 결과를 y에 대입
        int x = 1;
        int y = 0;
        
        y = ++x;

        System.out.println("x = " + x);     // x = 2
        System.out.println("y = " + y);     // y = 2

        // 후위(Postfix) 증가 연산자 사용 : x의 현재 값을 y에 먼저 대입하고, 그 다음에 x의 값을 증가
        x = 1;
        y = 0;

        y = x++;

        System.out.println("x = " + x);     // x = 2
        System.out.println("y = " + y);     // y = 1

    }
}
