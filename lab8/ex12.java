package com.test;
import java.util.Scanner;
import static java.lang.System.exit;

public class lab8_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input size of array: ");
        int n = in.nextInt();
        int [][] arr = new int[n][n]; //Матрица
        int [][] arr_1 = new int[n][n]; //Обратная матрица

        System.out.println("Input elements of array: ");
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println("Input elements of reverse array: ");
        for (int i = 0; i < arr_1.length; i++){
            for (int j = 0; j < arr_1[i].length; j++){
                arr_1[i][j] = in.nextInt();
            }
        }
        int [][] e = new int[n][n]; //Умножение матриц
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                for (int k = 0; k < n; k++){
                    e[i][j] += arr[i][k] * arr_1[k][j];
                }
            }
        }
         for (int i = 0; i < n; i++){
            for (int j = 0; j < i; j++){
                if (e[i][i] != 1 || e[i][j] != 0 || e[n - i - 1][n - 1 - j] != 0) {
                    System.out.println("Wrong input");
                    exit(0);
                }
            }
        }
    }
}


