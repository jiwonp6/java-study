package ch22_library.lang.ex;

public class Ex5 {
    /*
        <경과 시간 측정>
        요구사항:

        100만번의 반복문을 실행하는 데 걸리는 시간(밀리초 단위)을 측정하세요.
        반복문은 간단한 연산(예: 카운터 증가)을 수행하도록 합니다.
        System.currentTimeMillis()를 사용하여 시작 시간과 종료 시간을 측정합니다.
        경과 시간을 계산하여 출력하세요.
        실행 결과 예시:

        Copy code
        반복문 실행 시간: 15 milliseconds
     */
    public static void main(String[] args) {
        int num = 0;

        // 시작
        long startTime = System.currentTimeMillis();
        // 반복문
        for (int i = 0; i < 1000000; i++) {
            num++;
        }
        // 끝
        long endTime = System.currentTimeMillis();

        System.out.println("num : " + num);
        System.out.println("startTime : " + startTime);
        System.out.println("endTime : " + endTime);
        System.out.println("걸린시간 : " + (endTime - startTime));
    }
}
