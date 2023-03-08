package com.test;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class lab8_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность массива :"); //Вводим размеры массива
        int m = in.nextInt();
        int n = in.nextInt();
        int max = 0; //Переменная максимального значения
        int maxIndex = 0; //Индекс строки с максимальным значением
        int[][] arr = new int[m][n];
        getArr(arr);
        PrintOut(arr);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j][i] > max) {
                    max = arr[j][i];
                    maxIndex = j;
                }
            }
        }
        int[] ars = new int[arr[maxIndex].length];
        for (int i = 0; i < arr[maxIndex].length; i++) {
            ars = append(ars, (int)arr[maxIndex][i], i); //Добавление значений строки в новый массив
        }
        Arrays.sort(ars);
        System.out.println(Arrays.toString(ars));
    }
    public static void getArr(int[][] arr) { //Заполнение массива случайными числами
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = r.nextInt(10);
            }
        }
    }
    public static void PrintOut(int[][] arr) { //Вывод двумерного массива
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }
    private static int[] append(int[] ars, int element, int i) { //Добавление элементов в массив
        ars[i] = element;
        return ars;
    }
}
