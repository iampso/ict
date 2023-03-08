package com.test;
import static java.lang.Math.*;

public class lab6_3_3 {
    public static void main(String[] args) {
        double sum = 0;

        for (int i = 1; i <= 8; i++){
            for (int j = 1; j <= i; j++){
                for (int k = 1; k <= 3; k++){
                    sum += pow(j, 2) + i * k;
                }
            }
        }
        System.out.println(sum);
    }
}
