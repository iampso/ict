package com.test;

import java.io.*;
import java.util.Scanner;

public class lab10_10 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Roman\\Desktop\\ex10.txt");
        BufferedWriter Fwrite = new BufferedWriter(new FileWriter(file));
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число abs меньше 1");
        double x = in.nextDouble();

        if (Math.abs(x) < 1) {
            int n = 10;
            double summ = 0;
            double sumr = 0;
            int st = -4;
            double eps = Math.pow(10,st);
            for (int i = 1; i < n; i++) {
                summ += ((2 * i - 1) * Math.pow(x, (2 * i + 1))) / ((2 * i) * (2 * i + 1));
                sumr += Math.PI/2 - x - summ;
                if ((Math.abs(Math.acos(x)) - sumr) < eps) {
                    Fwrite.write("Функция f(x) = arccos(x) для x = " + x + " равняется " + sumr + "\n" +
                            "Результаты определения значений функции f(x) = arccos(x) с помощью ряда Маклорена\n" +
                            "Погрешность итерационной процедуры " + eps + "\n"+
                            "Значение функции по Маклорену  Погрешность, %   Число итераций\n\t"+
                            sumr + "\t\t" + eps * 100 + "\t\t\t" + i +"\n\n");

                    if (st == -2){
                        break;
                    }
                    eps = Math.pow(10,st++);
                }
            }
        }
        else {
            System.out.println(" Abs X по должен быть меньше 1");
        }
        Fwrite.close();
    }
}
