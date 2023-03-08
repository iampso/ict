package com.test;
import java.util.Scanner;
import static java.lang.Math.max;

public class lab5_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите a ");
        double a = in.nextDouble();
        System.out.println("Введите b ");
        double b = in.nextDouble();
        System.out.println("Введите c ");
        double c = in.nextDouble();
        System.out.println("Введите d ");
        double d = in.nextDouble();
        if (a == d){
            System.out.println("a = d");
        }
        if (b == d){
            System.out.println("b = d");
        }
        if (c == d){
            System.out.println("a = d");
        }
        else {
            double m1 = max(d - a, d - b);
            double m2 = max(d - b, d - c);
            double m3 = max(m1, m2);
            System.out.println("max = " + m3);
        }
    }
}
