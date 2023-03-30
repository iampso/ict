package com.test;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String text = in.nextLine();
        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (word.matches("[a-zA-Zа-яА-Я]+")) {
                result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
            }
            else {
                result.append(word).append(" ");
            }
        }
        System.out.println(result.toString().trim());
    }
}
