package ch4_loop;
// #5-8  반복문(2024-02-13)
public class Loop8 {
    public static void main(String[] args) {
        /*
            중첩 반복문 : 반복문 안에 반복문을 내포하는 경우
         */
        for (int i = 0; i < 3; i++){
            System.out.println("[바깥쪽 for문 " + i + "]");
            for (int j = 0; j < 5; j++){
                System.out.println("안쪽 for문 " + i + " " + j);
            }
            System.out.println("===============");
        }
        
        // 구구단 출력
        for (int i = 1; i <= 9; i++){
            for (int j = 1; j <= 9; j++){
                System.out.print(j + " * " + i + " = " + (i*j) +"\t");
            }
            System.out.println("");
        }
    }
}
