// Assignment: 2 - exercise 6
// Author: Liav Lugasi, ID: 213007271

import java.util.Scanner;

public class ex6 {
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

        long Sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == m - 1) {
                    Sum += matrix[i][j];
                }
            }
        }

        System.out.println("Border Sum: " + Sum);

    }
}