package ch06_array;
// #7-10 다차원 배열 (2024-02-14)
public class Array6 {
    public static void main(String[] args) {
        // 다차원 배열 선언
        int[][] matrix = new int[2][3];

        // 초기화 : for 문 사용
        int i = 1;
        for (int row = 0; row < matrix.length; row++){
            for (int column = 0; column < matrix[row].length; column++){
                matrix[row][column] = i++;      // 행열의 위치에 1씩 증가하여 대입
            }
        }

        // 2차원 배열 출력 : 향상된 for 문 사용
        for (int[] rows : matrix){      // 행 출력(2) : [1 2 3] / [4 5 6]
            for (int element : rows){      // 열 출력(3) : 1/2/3, 4/5/6
                System.out.print(element + "\t");
            }
            System.out.println(" ");
        }

        /*
            { { 1, 2 },
              { 3, 4 } }
         */

    }
}
