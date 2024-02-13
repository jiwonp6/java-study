package ch2_perator;
// #3-12 연습문제5 (2024-02-08)
public class Ex5 {
    private static Object varPi;

    public static void main(String[] args) {
        /*
            반지름이 10 인 원의 넓이를 구하는데 다음과 같이 var2, ".", var3을 + 연산해서 원주율을 얻은 다음 계산하려고 합니다.
            올바른 결과가 나오도록 코드를 수정 해보세요.
         */

        // 변수 설정
        int var1 = 10;
        int var2 = 3;
        int var3 = 14;

        // pi값 문자열로 만들고 숫자로 변환
        String pi = (var2 + "." + var3);
        double varPi = Double.parseDouble(pi);
        
        // 계산
        double var4 = var1 * var1 * varPi;

        // 출력
        System.out.println("원의 넓이 : " + var4);
    }
}
