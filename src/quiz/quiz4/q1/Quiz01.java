package quiz.quiz4.q1;

public class Quiz01 {
    public static void main(String[] args) {
        // 시작
        long start = System.nanoTime();

        // 반복문 수행
        for (int i = 0; i < 1_000_000; i++) {
            i++;
        }

        // 끝
        long end = System.nanoTime();

        // 결과 출력
        System.out.println("start : " + start);
        System.out.println("end : " + end);
        System.out.println("걸린시간 : " + (end - start));

    }
}
