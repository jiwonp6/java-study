package ch6_array;
// #7-4 연습문제 (2024-02-14)
public class Ex1 {
    public static void main(String[] args) {
        /*
            학생들 점수가 10, 20, 30, 40, 50 점
            배열을 선언하고, 모든 학생들의 합계점수와 평균점수를 구해보세요.
         */
        // 변수 선언
        int tot = 0;
        double avg;

        int[] scores = new int[5];

        // 값 배정
        scores[0] = 10;
        scores[1] = 20;
        scores[2] = 30;
        scores[3] = 40;
        scores[4] = 50;

        // 반복문 & 출력
        System.out.print("[ ");

        for (int i = 0; i < scores.length; i++){
            tot += scores[i];
            System.out.print(scores[i] + " ");
        }
        avg = (double) tot/(scores.length);

        System.out.print("] \n");

        System.out.println("합계 점수 : " + tot);
        System.out.println("평균 점수 : " + avg);
    }
}
