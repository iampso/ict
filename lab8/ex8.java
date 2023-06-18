package com.test;
import java.util.Scanner;

public class lab8_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input size of array: ");
        int n = in.nextInt();

        int i = 0;
        int j = 0;
        int s = 0;
        int l = 1;

        int [][] arr = new int [n][n];

        for (s = 0; s < n; s++){
            for (i = 0; i <= s; i++) {
                j = s - i;
                if(s%2==0){

                    arr [i][j] = l;
                    l++;
                }
                else
                {
                    arr [j][i] = l;
                    l++;
                }
            }
        }
        for (s = n; s < 2*n-1; s++){
            int z = s - (n-1);
            for (i = z; i < n; i++) {

                j = s - i;

                if (s%2==0){
                    arr [i][j] = l;
                    l++;
                }

                else {
                    arr [j][i] = l;
                    l++;
                }
            }
        }

        for ( i = 0; i < n; i++){
            for (j = 0; j < n; j++) {
                System.out.print(arr[i][j] +"\t");
            }
            System.out.print("\t");
            for (j = 0; j < n; j++) {
                System.out.print(arr[i][j] +"\t");
            }
            System.out.println();
        }
        System.out.println();
        for ( i = 0; i < n; i++){
            for (j = 0; j < n; j++) {
                System.out.print(arr[i][j] +"\t");
            }
            System.out.print("\t");
            for (j = 0; j < n; j++) {
                System.out.print(arr[i][j] +"\t");
            }
            System.out.println();
        }
    }
}
