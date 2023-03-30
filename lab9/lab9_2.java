package com.test;
import java.util.Scanner;
import static java.lang.Math.*;

public class lab9_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] binaryArr;
        boolean isBinary;
        do {
            System.out.println("Введите число в двоичной системе счисления: ");
            binaryArr = in.next().toCharArray();
            isBinary = true;
            for (char c: binaryArr){
                if (c != '0' && c != '1'){
                    isBinary = false;
                    break;
                }
            }
            if (!isBinary){
                System.out.println("Неверный ввод! Число должно содержать только символы 0 и 1.");

            }
        }
        while (!isBinary);
        int decimal = 0;
        for (int i = 0; i < binaryArr.length; i++){
            if (binaryArr[i] == '1'){
                decimal += pow(2, binaryArr.length - 1 - i);
            }
        }
        char[] decimalArr = String.valueOf(decimal).toCharArray();
        System.out.println("Число в десятичной системе счисления: ");
        for (char c : decimalArr){
            System.out.println(c + " ");
        }
    }
}
