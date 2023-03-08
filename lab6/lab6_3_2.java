package com.test;
import static java.lang.Math.*;

public class lab6_3_2 {
    public static void main(String[] args) {
        double sum1 = 1;
        double sum2 = 0;

        for ( int i = 1; i < 9; i++){
            for (int j = 1; j <= 2 * i; j++){
                sum1 *= pow(j, 3) + pow(i, 2);
            }
            sum2 +=  sum1;
        }
        System.out.println(sum2);
    }
}
