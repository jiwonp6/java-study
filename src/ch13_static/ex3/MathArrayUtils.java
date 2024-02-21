package ch13_static.ex3;
// #12 자바 메모리 영역 구조 (2024-02-21)
public class MathArrayUtils {
    // 필드
    private static int sum = 0;
    private static double average = 0;
    private static int min = 0;
    private static int max = 0;

    // 생성자 -> 객체 생성 막기
    private MathArrayUtils() {
    }

    // 메소드
    public static String sum(int[] values) {
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return Integer.toString(sum);
    }

    public static String average(int[] values) {
        average = (double) sum / values.length;
        return Double.toString(average);
    }

    public static String min(int[] values) {
        min = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i] < min){
                min = values[i];
            }
        }
        return Integer.toString(min);
    }

    public static String max(int[] values) {
        max = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i] > max){
                max = values[i];
            }
        }
        return Integer.toString(max);
    }
}
