package com.test;
import java.util.Scanner;
import static java.lang.Math.*;

public class lab4_3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input R:");
        double r = in.nextDouble();

        System.out.print("Input r:");
        double r1 = in.nextDouble();

        System.out.print("Input h:");
        double h = in.nextDouble();

        double v;
        v = PI * h * (pow(r1, 2) + pow(r, 2) + r * r1) / 3;

        double l;
        l = sqrt(pow(abs(r - r1), 2) + pow(h, 2));

        double s;
        s = PI * pow(r, 2) + PI * pow(r1, 2) + PI * (r + r1) * l;

        System.out.println("V = " + v);
        System.out.println("S = " + s);

    }
}
