package ch04_loop;
// #5-7  반복문(2024-02-13)
public class Loop7 {
    public static void main(String[] args) {
        /*
            1부터 1씩 증가하는 수를 더하기(1부터 10까지 더하는 for 문)
            ex. 1 + 2 + 3 + 4 + ...
         */
        // 변수 선언
        int i;
        int sum = 0;
        int end = 10;

        for (i = 1; i < end; i++){
            sum +=i;
            System.out.print(i + " + ");
        }
        if (i==end){
            sum +=i;
            System.out.print(i + " = " + sum);
        }
        // while 문과 동일한 구조를 갖지만, 반복되는 코드에 집중할 수 있고 깔끔하게 볼 수 있다.

    }
}
