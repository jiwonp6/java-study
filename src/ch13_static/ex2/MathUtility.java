package ch13_static.ex2;
// #12 자바 메모리 영역 구조 (2024-02-21)
public class MathUtility {
    private static int max = 0;
    private static int min = 0;
    private static int sum = 0;
    private static int factorial = 1;

    public static String max(int i, int j) {
        if (i >= j){
            max = i;
        }else {
            max = j;
        }
        return Integer.toString(max) ;
    }
    public static String min(int i, int j) {
        if (i <= j){
            min = i;
        }else {
            min = j;
        }
        return Integer.toString(min) ;
    }
    public static String sum(int i, int j) {
        sum = i + j;
        return Integer.toString(sum);
    }
    public static String factorial(int i) {
        if (i == 0){
            return "1";
        }
        for (int j = 1; j <= i; j++) {
            factorial *= j;
        }
        return Integer.toString(factorial);
    }

}
