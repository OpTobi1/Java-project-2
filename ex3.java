// Assignment: 2 - exercise 3
// Author: Liav Lugasi, ID: 213007271

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = scan.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " sorted integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int Index = 1;

        for (int i = 1; i < n; i++) {

            if (arr[i] != arr[i - 1]) {
                arr[Index] = arr[i];
                Index++;
            }
        }

        int newLength = Index;

        System.out.print("Unique array numbers: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


        System.out.println("Number of unique values: " + newLength);
        
    }
}