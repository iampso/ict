package com.test;
import static java.lang.Math.*;

public class lab6_3_1 {
    public static void main(String[] args) {
        double sum1 = 0;

        for (int i = 1; i < 9; i++){
            for (int j = 1; j <= i; j++){
                sum1 += pow(j, 2);
            }
        }
        System.out.println(sum1);

    }
}
