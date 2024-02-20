package ch07_method;
// #8-3 메소드 (2024-02-15)
public class Method3 {
    public static void main(String[] args) {
        boolean result1 = isOdd(3);   // true
        boolean result2 = isOdd(4);   // false

        System.out.println(result1);
        System.out.println(result2);
    }
    // 리턴 타입이 있는 경우 반드시 리턴이 필요하다.
    public static boolean isOdd(int num){
        // 홀수 : true, 짝수 : false 반환
        if (num%2 != 0){
            return true;
        }else {     // if 조건이 만족되지 않을 때도 return 값이 존재해야 함.(없으면 error 발생)
            return false;
        }
    }
}
