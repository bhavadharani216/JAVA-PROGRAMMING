import java.util.*;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (sc.hasNextInt()) {
                    matrix[i][j] = sc.nextInt();
                }
            }
        }

        // print transpose
        for (int j = 0; j < col; j++) {
            for (int i = 0; i < row; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}