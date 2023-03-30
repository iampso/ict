//не проверяет на введенное слово, потом коммитну
package com.test;
import java.util.Scanner;

public class lab9_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = scanner.nextLine();
        int spaces = 0;
        boolean hasLetter = false;
        boolean hasAllLetters = true;
        System.out.println("Анализ строки:");
        for (char c : str.toCharArray()) {
            if (c == ' ') {
                spaces++;
            }
            if (c == 'ю') {
                hasLetter = true;
            }
            if (c >= 'а' && c <= 'я') {
                if (!str.contains(String.valueOf((char)(c - 32))) && !str.contains(String.valueOf(c))) {
                    hasAllLetters = false;
                }
            }
        }
        System.out.println("Количество пробелов: " + spaces);
        if (hasLetter) {
            System.out.println("Строка содержит букву 'ю'.");
        } else {
            System.out.println("Строка не содержит букву 'ю'.");
        }
        if (hasAllLetters) {
            System.out.println("Строка содержит все буквы из введенного слова.");
        } else {
            System.out.println("Строка не содержит все буквы из введенного слова.");
        }
    }
}
