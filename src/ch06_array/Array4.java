package ch06_array;
// #7-8 다차원 배열 (2024-02-14)
public class Array4 {
    public static void main(String[] args) {
        // 다차원 배열 선언
        int[][] matrix = new int[2][3];

        // 다차원 배열 초기화
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;

        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;

        // 출력
        for (int[] row : matrix){      // 행 출력(2) : [1 2 3] / [4 5 6]
            System.out.println(" ");
            for (int column : row){      // 열 출력(3) : 1/2/3, 4/5/6
                System.out.print(column + "\t");
            }
        }

    }
}
