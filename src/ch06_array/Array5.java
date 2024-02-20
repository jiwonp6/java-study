package ch06_array;
// #7-9 다차원 배열 (2024-02-14)
public class Array5 {
    public static void main(String[] args) {
        // 다차원 배열 선언과 초기화
        int[][] matrix = {
                {1, 2, 3},   // [0][0], [0][1], [0][2]
                {4, 5, 6}    // [1][0], [1][1], [1][2]
        };                   // 2행 3열

        // 출력
        for (int[] row : matrix){      // 행 출력(2) : [1 2 3] / [4 5 6]
            System.out.println(" ");
            for (int column : row){      // 열 출력(3) : 1/2/3, 4/5/6
                System.out.print(column + "\t");
            }
        }

    }
}
