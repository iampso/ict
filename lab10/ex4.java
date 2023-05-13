package com.test;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class lab10_4 {
    
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\79504\\OneDrive\\Рабочий стол\\input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\79504\\OneDrive\\Рабочий стол\\output.txt"))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("[_.,;:\\n\\t!?]");
                for (String word : words) {
                    if (isSymmetric(word) && containsOnlyVowels(word)) {
                        writer.write(word);
                        writer.newLine();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static boolean isSymmetric(String word) {
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean containsOnlyVowels(String word) {
        String vowels = "aeiou";
        for (char c : word.toCharArray()) {
            if (!vowels.contains(Character.toString(c))) {
                return false;
            }
        }
        return true;
    }
}
