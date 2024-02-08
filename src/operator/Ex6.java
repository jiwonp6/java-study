package operator;
// #3-12 연습문제6 (2024-02-08)
public class Ex6 {
    public static void main(String[] args) {
        /*
            다음 변수들의 합과 평균을 구하는 프로그램을 작성하세요.

            double val1 = 1.5;
            double val2 = 2.5;
            double val3 = 3.5;
         */

        // 변수
        double val1 = 1.5;
        double val2 = 2.5;
        double val3 = 3.5;

        // 변수 합 구하기
        double sum = (val1 + val2 + val3);

        // 변수 평균 구하기
        double avg = (sum / 3);

        // 출력
        System.out.printf("세 변수의 합은 %s이고, 세 변수의 평균은 %s입니다.", sum, avg);

    }
}
