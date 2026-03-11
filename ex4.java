// Assignment: 2 - exercise 4
// Author: Liav Lugasi, ID: 213007271

import java.util.Scanner;

public class ex4 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter matrix size: ");
        int n = scan.nextInt();

        double[][] matrix = new double[n][n];

        int row = 1;

        for (int i = 0; i < n; i++) {
            System.out.println("Insert the line elements " + row + ": ");
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scan.nextDouble();
            }
            row++;
        }

        boolean Symmetric = true;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    Symmetric = false;
                    break;
                }
            }
            if (!Symmetric) {
                break;
            }
        }

        System.out.println(Symmetric);

    }
}
