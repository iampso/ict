package com.test;

public class lab8_10 {

    // Метод проверки попадания точки в область
    public static boolean checkPoint(double x, double y) {
        if ((y >= 0 && y <= x + 2) && (y >= 0 && y <= -x + 2) &&
                (y <= 0 && y >= -x - 2) && (y <= 0 && y >= x - 6)) {
            return true;
        } 
        else {
            return false;
        }
    }

    // Метод для определения результатов попадания точек в область
    public static void getResults(double[][] matrix) {
        int n = matrix[0].length;
        int[] results = new int[n];
        for (int i = 0; i < n; i++) {
            double x = matrix[0][i];
            double y = matrix[1][i];
            if (checkPoint(x, y)) {
                results[i] = 1;
            } 
            else if (y == x + 2 || y == -x + 2 || y == -x - 2 || y == x - 6) {
                results[i] = 0;
            } 
            else {
                results[i] = -1;
            }
        }
        // Вызов метода для стилизованного вывода результатов
        printResults(matrix, results);
    }

    // Метод для стилизованного вывода результатов
    public static void printResults(double[][] matrix, int[] results) {
        int n = matrix[0].length;
        System.out.println("Results:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Point (%f, %f) is ", matrix[0][i], matrix[1][i]);
            if (results[i] == 1) {
                System.out.println("inside the area.");
            } 
            else if (results[i] == 0) {
                System.out.println("on the border of the area.");
            } 
            else {
                System.out.println("outside the area.");
            }
        }
    }

    public static void main(String[] args) {
        double[][] matrix = {{0, 2, 4, 1, 5}, {0, 4, 0, 4, 0}};
        getResults(matrix);
    }
}
