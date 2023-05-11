package com.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class lab10_3 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\79504\\OneDrive\\Рабочий стол\\1.txt"); // название файла
        ArrayList<String> words = new ArrayList<>(); // список для хранения слов

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            // читаем строки файла, пока они не закончатся
            while ((line = br.readLine()) != null) {
                String[] lineWords = line.split(" "); // разбиваем строку на слова
                for (String word : lineWords) {
                    // проверяем, соответствует ли слово условиям
                    if (word.length() > 0 && Character.isUpperCase(word.charAt(0)) && Character.isLowerCase(word.charAt(word.length() - 1))) {
                        words.add(word); // добавляем слово в список
                    }
                }
            }
        }

        // выводим список слов
        System.out.println("Words starting with uppercase and ending with lowercase letter:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
