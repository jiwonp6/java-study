package n4.loop;
// #5-2  반복문(2024-02-13)
public class Loop2 {
    public static void main(String[] args) {
        /*
            1부터 1씩 증가하는 수를 더하기
            ex. 1 + 2 + 3 + 4 + ...
         */
        // 변수 선언
        int sum = 0;
        int i = 1;
        int end = 10;

        // 반복문을 사용하게 될 경우, 반복 횟수와 요구조건을 유연하게 변경할 수 있다.
        System.out.print(i);

        while (i < end){
            sum += i;
            while (i < end){
                i++;
                System.out.print(" + " + i);
                sum += i;
            }
            System.out.print(" = " + sum);
        }
    }
}
