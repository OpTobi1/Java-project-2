// Assignment: 2 - exercise 2
// Author: Liav Lugasi, ID: 213007271

import java.util.Scanner;
import java.util.Arrays;

public class ex2 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter length of array: ");
        int len = scan.nextInt();

        int[] arr1 = new int[len];

        System.out.println("enter numbers: ");
        for(int i = 0; i < len; i++){
            arr1[i] = scan.nextInt();
        }

        int[] arr2 = new int[len];
        int count = 0;

        for(int i = 0; i < len ; i++) {
            int num = arr1[i];
            boolean x = false;

            for (int j = 0; j < count; j++) {
                if (arr2[j] == num) {
                    x = true;
                    break;
                }
            }
            if (!x) {
                arr2[count] = num;
                count++;
            }
        }


        int[] arr3 = new int[count];
        for (int i = 0; i < count; i++) {
            arr3[i] = arr2[i];
        }

        System.out.println("new array: " + Arrays.toString(arr3));


        int totalSum = 0;

        System.out.println("sum of numbers: ");


        for (int i = 0; i < arr3.length; i++) {

            for (int j = i + 1; j < arr3.length; j++) {
                int pairSum = arr3[i] + arr3[j];


                System.out.println("(" + arr3[i] + " + " + arr3[j] + ") = " + pairSum);


                totalSum += pairSum;
                }
            }


            System.out.println("sum of all numbers: " + totalSum);

    }
}
