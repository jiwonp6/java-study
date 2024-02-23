package test.Q8;

public class MathUtility {
    static int max = 0;
    static int min = 0;
    static int sum = 0;
    static int factorial = 1;

    public static int setMax(int i, int j){
        if (i > j){
            max = i;
        }else {
            max = j;
        }
        return max;
    }
    public static int setMin(int i, int j){
        if (i < j){
            min = i;
        }else {
            min = j;
        }
        return min;
    }
    public static int setSum(int i, int j){
        sum = i + j;
        return sum;
    }
    public static int setFactorial(int n){
        if (n == 0){
            factorial = 1;
            return factorial;
        }
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
