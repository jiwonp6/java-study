package test;

public class Q4 {
    public static void main(String[] args) {
        int row = 2;
        int column = 4;
        int index = 0;
        int tot = 0;

        int [][] array = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                index++;
                array[i][j] = index;
                System.out.print(array[i][j] + "\t");
                tot += array[i][j];
            }
            System.out.println(" ");
        }
        System.out.println("합계 : " + tot);
    }
}
