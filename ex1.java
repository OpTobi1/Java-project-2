// Assignment: 2 - exercise 1
// Author: Liav Lugasi, ID: 213007271

import java.util.Scanner;

public class ex1 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter length of arrays: ");
        int len = scan.nextInt();

        int[] arr1;
        int[] arr2;

        arr1 = new int[len];
        arr2 = new int[len];

        System.out.println("enter number for array 1: ");
        for(int i = 0; i < len; i++){
            arr1[i] = scan.nextInt();
        }

        System.out.println("enter number for array 2: ");
        for(int i = 0; i < len; i++){
            arr2[i] = scan.nextInt();
        }

        int sum = 0;
        int z;
        int x = 1;

        for(int i = 0; i < len ; i++){
            z = arr1[i] * arr2[i] * x;
            x += 1;
            sum += z;
        }

        System.out.println("Weighted sum: " + sum);
    }
}
