package n4.loop;
// #5-4  반복문(2024-02-13)
public class Loop4 {
    public static void main(String[] args) {
        /*
            break 문
            while(조건식){
                // code1
                break;      // code2를 실행하지 않고 반복문을 종료한다.
                // code2
            }
         */
        // 변수 선언
        int sum = 0;
        int i = 1;

        // 반복문
        while (true){   // 무한 반복문
            sum += i;
            if (i > 10){    // 만약 i가 10보다 크다라는 조건을 만족하면 break 문 수행되고, while 문 종료
                System.out.println("sum = " + sum);
                break;
            }
            i++;
        }
    }
}
