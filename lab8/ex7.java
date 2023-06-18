package com.test;
import java.util.Scanner;

public class lab8_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input size of array");
        int n = in.nextInt();
        int[][] arr = new int[n][n];

        fillArray(arr);

        // вывод массива на консоль
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

public static void fillArray(int[][] arr) {
    int count = 1;
    int rowStart = 0, rowEnd = arr.length - 1;
    int colStart = 0, colEnd = arr[0].length - 1;

    while (rowStart <= rowEnd && colStart <= colEnd) {
        for (int i = colStart; i <= colEnd; i++) {
            arr[rowStart][i] = count++;
        }
        rowStart++;

        for (int i = rowStart; i <= rowEnd; i++) {
            arr[i][colEnd] = count++;
        }
        colEnd--;

        if (rowStart <= rowEnd) {
            for (int i = colEnd; i >= colStart; i--) {
                arr[rowEnd][i] = count++;
            }
            rowEnd--;
        }

        if (colStart <= colEnd) {
            for (int i = rowEnd; i >= rowStart; i--) {
                arr[i][colStart] = count++;
            }
            colStart++;
        }
    }
}
