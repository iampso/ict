package com.test;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = in.nextLine();
        CountWords(str);
    }
    public static int CountWords(String str) {
    String[] words = str.split(" ");
    int count = 0;
    for (String word : words) {
        boolean propisn = true;
        for (char c : word.toCharArray()) {
            if (!Character.UnicodeBlock.of(c).equals(Character.UnicodeBlock.CYRILLIC) || !Character.isLowerCase(c)) {
                propisn = false;
                break;
            }
        }
        if (propisn) {
            count++;
        }

    }
    if (count == 0){
        System.out.println("Нет такого");
    }
    else {
        System.out.println(count);
    }
    return count;

}
}
