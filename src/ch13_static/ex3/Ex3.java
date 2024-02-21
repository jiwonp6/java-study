package ch13_static.ex3;
// #12 자바 메모리 영역 구조 (2024-02-21)
public class Ex3 {
    /*
        수학 배열 유틸리티 클래스
        배열을 활용한 수학 유틸리티 클래스(MathArrayUtils)를 만드세요.
        sum(int[] array) : 배열의 모든 요소를 더하여 합계를 반환합니다.
        average(int[] array) : 배열의 모든 요소의 평균값을 계산합니다.
        min(int[] array) : 배열에서 최소값을 찾습니다.
        max(int[] array) : 배열에서 최대값을 찾습니다.

        `MathArrayUtils` 은 객체를 생성하지 않고 사용해야 합니다. 생성이 불가능하게 막으세요.

        실행결과
        =====
        sum=15
        average=3.0
        min=1
        max=5
     */
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        System.out.println("sum = " + MathArrayUtils.sum(values));
        System.out.println("average = " + MathArrayUtils.average(values));
        System.out.println("min = " + MathArrayUtils.min(values));
        System.out.println("max = " + MathArrayUtils.max(values));

    }
}
