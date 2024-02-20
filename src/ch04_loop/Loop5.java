package ch04_loop;
// #5-5  반복문(2024-02-13)
public class Loop5 {
    public static void main(String[] args) {
        /*
            continue 문
            while(조건식){
                code1;
                continue;       // 즉시 code2를 실행하지 않고 조건식으로 이동한다.
                code2;
            }
         */
        // 3을 건너뛰는 코드 - 예
        // 변수 선언
        int i = 1;

        // 반복문
        while (i < 6){
            // 조건 설정
            if (i == 3){
                i++;
                continue;
            }
            System.out.println("i = " + i);
            i++;
        }


    }

}
