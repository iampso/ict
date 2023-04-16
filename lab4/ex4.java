package com.test;

import java.util.Scanner;

public class lab4_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("A рублей ");
        double a = in.nextDouble(); //А рублей

        System.out.print("Курс доллара "); //Курс доллара
        double d = in.nextDouble();

        System.out.print("Курса евро "); //Курс евро
        double e = in.nextDouble();

        System.out.print("Из доллара в евро "); //Курс доллара к евро
        double ed = in.nextDouble();

        double res1;
        res1 = a / d; //Перевод из рублей в доллары

        double res2;
        res2 = res1 / ed; //Перевод из долларов в евро

        double res3;
        res3 = a / e - res2; // Скока бабок потеряли

        System.out.println("Из доллара в евро " + res2 + " евро");
        System.out.println("Потрачено " + res3 + " рублей");

    }
}

