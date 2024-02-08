package operator;
// #3-10 대입연산자 (2024-02-08)
public class Operator10 {
    public static void main(String[] args) {
        // 오른쪽 피연산자의 값을 왼쪽 피연산자인 변수에 저장
        // 연산을 수행하면서 대입하는 복합 대입 연산자가 있음
        // 가장 낮은 연산 순위를 가지고 있음

        int x = 0;

        // x = x + 10
        x += 10;
        System.out.println("x = " + x);

        // x = x - 5
        x -= 5;
        System.out.println("x = " + x);
        
        // x = x * 3
        x *= 3;
        System.out.println("x = " + x);
        
        // x = x / 3
        x /= 5;
        System.out.println("x = " + x);
        
        // x = x % 3
        x %= 3;
        System.out.println("x = " + x);

    }
}
