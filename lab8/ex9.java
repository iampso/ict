package com.test;
import java.util.Scanner;
import static java.lang.Math.ceil;

public class ex9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input size of array:");
        int n=scan.nextInt();
        int[][] matrix1 = new int[n][n], matrix2 =new int[n][n];

        int row = 0;
        int col = 0;
        int dx = 1;
        int dy = 0;
        int dirChanges = 0;
        int visits = n;

        for (int i = 0; i < n * n; i++) {
            matrix1[row][col] = i + 1;
            if (--visits == 0) {
                visits = n * (dirChanges % 2) +
                        n * ((dirChanges + 1) % 2) -
                        (dirChanges / 2 - 1) - 2;
                int temp = dx;
                dx = -dy;
                dy = temp;
                dirChanges++;

            }
            col += dx;
            row += dy;
        }

        int k = 0, minN = 0, sch = 1;
        while (k<=ceil(n/3)) {
            for (int i = minN; i < n-minN; i++) {
                matrix2[i][minN] = sch++;
            }
            for (int j = 1 + minN; j < n - minN; j++) {
                matrix2[n - 1 - minN][j] = sch++;
            }
            for (int i = n - 2 - minN; i >= minN; i--) {
                matrix2[i][n - 1 - minN] = sch++;
            }
            for (int j = n - 2 - minN; j > minN; j--) {
                matrix2[minN][j] = sch++;
            }
            k++;
            minN++;
        }
        int i =0,j=0;
        for ( i = 0; i < n; i++){
            for (j = 0; j < n; j++) {
                System.out.print(matrix1[i][j] +"\t");
            }
            System.out.print("\t");
            for (j = 0; j < n; j++) {
                System.out.print(matrix1[i][j] +"\t");
            }
            System.out.println();
        }
        System.out.println();
        for ( i = 0; i < n; i++){
            for (j = 0; j < n; j++) {
                System.out.print(matrix2[i][j] +"\t");
            }
            System.out.print("\t");
            for (j = 0; j < n; j++) {
                System.out.print(matrix2[i][j] +"\t");
            }
            System.out.println();
        }
    }
}
