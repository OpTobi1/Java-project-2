// Assignment: 2 - exercise 7
// Author: Liav Lugasi, ID: 213007271

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int n = scan.nextInt();

        System.out.println("Enter number of columns: ");
        int m = scan.nextInt();

        int[][] matrix = new int[n][m];

        int row = 1;

        for (int i = 0; i < n; i++) {
            System.out.println("Insert the line elements " + row + ": ");
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scan.nextInt();
            }
            row++;
        }

        if (n > 1) {
            int[] firstRow = matrix[0];
            for (int i = 0; i < n - 1; i++) {
                matrix[i] = matrix[i + 1];
            }
            matrix[n - 1] = firstRow;
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

    }
}