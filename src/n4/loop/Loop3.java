package n4.loop;
// #5-3  반복문(2024-02-13)
public class Loop3 {
    public static void main(String[] args) {
        /*
            do - while 문, while 문과 유사하지만 무조건 한 번은 코드를 실행한다.
            do {
                // 반복할 코드
            } while (조건식);
         */
        // 변수 선언
        int i = 1;

        // do - while 문
        do {
            System.out.println("i = " + i);
            i++;
        } while (i < 5);

        System.out.println("=============");


        // 일반 while 문 - 처음부터 false 조건을 만나면 아무것도 출력하지 않는다.
        i = 10;

        while (i < 5){
            System.out.println("i = " + i);
            i++;
        }
    }
}
