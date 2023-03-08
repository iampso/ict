package com.test;
import java.util.Scanner;
import static java.lang.Math.*;

public class lab6_6 {
    public static boolean Oblast(double x, double y) {
        return ((x >= 0 && x * x + y * y <= 36) && ((pow(x - 2, 2) + pow(y - 3, 2) >= 4) || (pow(x - 2, 2) + pow(y - 4, 2) <= 1))
                && (((pow(x - 2, 2) + pow(y + 1, 2) <= 1) || (pow(x - 2, 2) + pow(y + 3, 2) <= 1)) ||
                ((!(y < -0.2 * x + 1) || !(x < 5)) || (!(y > 0.4 * x - 5)))));
    }

    public static boolean getAnswer(){
        Scanner in = new Scanner(System.in);
        System.out.println("Выполнить операцию? Да - 1, нет - 0 ");
        int ans = in.nextInt();
        return ans == 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean ans = getAnswer();
        while (ans){
            System.out.println("Введите координату х: ");
            System.out.println("Введите координату у: ");
            System.out.println(Oblast(in.nextInt(), in.nextInt()));
            ans = getAnswer();
        }
    }
}

