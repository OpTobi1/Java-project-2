// Assignment: 2 - exercise 8
// Author: Liav Lugasi, ID: 213007271

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of rows (n):");
        int n = scan.nextInt();
        System.out.println("Enter number of columns (m):");
        int m = scan.nextInt();

        int[][] matrix = new int[n][m];
        int[][] matrix2 = new int[n][m];

        int row = 1;


        for (int i = 0; i < n; i++) {
            System.out.println("Insert the line elements " + row + ": ");
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scan.nextInt();
            }
            row++;
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int sum = 0;
                int count = 0;

                for (int r = i - 1; r <= i + 1; r++) {
                    for (int c = j - 1; c <= j + 1; c++) {
                        if (r >= 0 && r < n && c >= 0 && c < m) {
                            sum += matrix[r][c];
                            count++;
                        }
                    }
                }
                matrix2[i][j] = sum / count;
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix2[i][j] + "\t");
            }
            System.out.println();
        }
    }
}