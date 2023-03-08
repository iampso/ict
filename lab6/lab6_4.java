package com.test;
import java.util.Scanner;

public class lab6_4 {
    public static boolean Searching_Number(){
        Scanner in = new Scanner(System.in);

        long number; //Вводимое число
        int ns; //Номер системы счисления
        int a = 10; // Десятичная система счисления

        System.out.println("Введите число: ");
        number = Long.parseLong(in.nextLine(), a);

        System.out.println("Введите систему счисления: ");
        ns = in.nextInt();

        if (ns < 2 || ns > 10){
            System.out.println("Введите число меньше 11 и больше 1");
            return false;
        }

        System.out.println("Полученое число " + Long.toString(number, ns));
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Выполнить перевод??");
            String ans = in.nextLine();

            if (ans.startsWith("yes")){
                Searching_Number();
            }
            else {
                break;
            }
        }

    }
}




