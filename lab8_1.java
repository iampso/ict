package com.test;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.System.exit;

public class lab8_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long res = 0; //Инициализируем переменную, в которую будет записываться результат
        System.out.println("Input array length: ");
        int size = in.nextInt(); //Читаем с клавиатуры размер массива

        int mas[] = new int[size]; //Создаем массив с заданным размером
        System.out.println("Insert array elements: ");

        /*Проходимся по массиву и заполняем его*/
        for (int i = 0, j = 1; i < size; i++, j++) {
            mas[i] = in.nextInt(); //Заполняем массив элементами, введёнными с клавиатуры

            if (mas[i] < 0 || mas[i] > 1) { //Проверка на двоичную СС
                System.out.println("Invalid number!!");
                exit(0);
            }
        }
            System.out.println("Array: " + Arrays.toString(mas));
            for (int i = size - 1, j = 0; i > -1; i--, j++){
                res += mas[j] * pow(2, i); //Переводим в десятичную
                System.out.println(res);
            }
            System.out.println("Dec:" + res);
            res = Long.parseLong(Long.toString(res, 7)); //Переводим в семеричную
            System.out.println("Septenary: " + res);

    }
}

