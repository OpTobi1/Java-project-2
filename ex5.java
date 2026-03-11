// Assignment: 2 - exercise 5
// Author: Liav Lugasi, ID: 213007271

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter matrix size: ");
        int n = scan.nextInt();

        int[][] matrix = new int[n][n];

        int row = 1;

        for (int i = 0; i < n; i++) {
            System.out.println("Insert the line elements " + row + ": ");
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scan.nextInt();
            }
            row++;
        }

        for (int i = 0; i < n; i++) {
            int minVal = matrix[i][0];
            int Index = 0;

            for (int j = 1; j < n; j++) {
                if (matrix[i][j] < minVal) {
                    minVal = matrix[i][j];
                    Index = j;
                }
            }

            boolean Saddle = true;
            for (int k = 0; k < n; k++) {
                if (matrix[k][Index] > minVal) {
                    Saddle = false;
                    break;
                }
            }

            if (Saddle) {
                System.out.println("Saddle Point found: " + minVal);
                System.out.println("Position: (" + i + ", " + Index + ")");
                return;
            }
        }

        System.out.println("Not Found");
    }
}