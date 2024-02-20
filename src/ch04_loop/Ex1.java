package ch04_loop;
// #5-9  연습문제 - 짝수 출력(2024-02-13)
public class Ex1 {
    public static void main(String[] args) {
        /*
            반복문을 이용해서 20이내의 짝수를 출력해주세요.
         */
        // 변수 선언
        int i =0;
        int end = 20;

        // while 문
        System.out.println("<while 문>");
        while (i<end){
            i++;
            if (i%2==0){
                System.out.println("i = "+ i);
            }
        }

        // for 문 1
        System.out.println("\n<for 문 1>");
        for(int j = 1; j <= end; j++){
            if (j%2==0){
                System.out.println("j = "+ j);
            }
        }

        // for 문 2
        System.out.println("\n<for 문 2>");
        for(int k = 2; k <= end; k += 2){
            System.out.println("k = "+ k);
        }
    }
}
