package ch4_loop;
// #5-1  반복문(2024-02-13)
public class Loop1 {
    public static void main(String[] args) {
        /*
            반복문 while
            while(조건식){
                // 조건식이 true 일 때 반복할 코드
                // 조건식이 거짓이 되면 while 문을 벗어난다.
                // 조건식이 false가 되는 경우가 없으면 무한 반복
            }
         */
        // 변수 및 초기값 설정
        int count = 0;

        // while 문
        while (count < 3){      // 조건식
            count ++;       // 증감식
            System.out.println("숫자 = " + count);
        }

    }
}
