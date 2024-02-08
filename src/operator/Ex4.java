package operator;
// #3-12 연습문제4 (2024-02-08)
public class Ex4 {
    public static void main(String[] args) {
        /*
            다음 코드는 사다리꼴의 넓이를 구하는 코드입니다.
            정확히 소수 자릿수가 나올 수 있도록 빈칸을 채워주세요
         */

        // 변수 설정
        int lengthTop = 5;
        int lengthBottom = 10;
        int height = 7;

        // 넓이 계산
        double area = (((lengthTop + lengthBottom) * (double)height)/2 );
        // = double area = (((lengthTop + lengthBottom) * height)/2.0 );

        // 출력
        System.out.printf("사다리꼴의 넓이는 %.2f입니다.", area);
    }
}
