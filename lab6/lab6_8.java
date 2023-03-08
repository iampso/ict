package com.test;
import java.util.Scanner;
import static java.lang.Math.*;

public class lab6_8 {
    public static double FunctionMy1(double y){
        double f = 1;
        return (exp(2*y) + sin(f))/log(3.8 * y + f);
    }

    public static double FunctionMy2(double y){
        double x = 1;
        double a = 1;
        double c = 1;
        return (sqrt(exp(x) - pow(cos(pow(x, 2) * pow(a, 2)), 4)) + pow(atan(a - pow(x, 5)), 4)) / exp(1) * sqrt(abs(a + x * pow(c, 4)));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        double sum = 0;

        while (n < 10){
            System.out.println("Введите y");
            double y = in.nextDouble();
            sum += FunctionMy1(y) + FunctionMy2(y);
            n++;
        }
        System.out.println(sum);

    }
}
