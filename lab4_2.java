package com.test;

import java.util.Scanner;
import static java.lang.Math.abs;

public class lab4_2 {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите t1:");
        double t1 = in.nextDouble();

        System.out.print("Введите t2:");
        double t2 = in.nextDouble();

        System.out.print("Введите S:");
        double s = in.nextDouble();

        double v1;
        v1 = abs(s / t1 - s / t2); // Скорость течения

        double v2;
        v2 = abs(s/t1 - v1); // Собственная скорость

        System.out.println("V1 = " + v1);
        System.out.print("V2 = " + v2);

    }
}
