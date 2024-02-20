package ch06_array;
// #7-11 연습문제 (2024-02-14)
public class Ex4 {
    public static void main(String[] args) {
        /*
            2차원 배열의 합계 구하기
            2차원 정수 배열을 선언하고 모든 요소의 합계를 계산하는 프로그램을 만드세요.
         */
        // 변수 선언
        int sum = 0;
        int[][] matrix = new int[3][2];

        // 초기화
        int i = 10;
        for (int row = 0; row < matrix.length; row++){
            for (int column = 0; column < matrix[row].length; column++){
                matrix[row][column] = 10 * i++;
            }
        }

        // 출력
        for (int[] rows : matrix){
            for (int element : rows){
                sum += element;
                System.out.print(element + "\t");
            }
            System.out.println(" ");
        }
        System.out.println("합계 : " + sum);
    }
}
