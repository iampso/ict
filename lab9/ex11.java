package com.test;
import java.util.Arrays;

public class lab9_11 {
    public static void main(String[] args) {
        String[] names = {"John Smith", "Mary Johnson", "Robert Williams", "Laura Davis"};

        // Регулярное выражение для замены пробелов на знак подчеркивания
        String regex1 = "\\s+";
        String replacement1 = "_";
        String[] formattedNames1 = formatStringArray(names, regex1, replacement1);
        System.out.println(Arrays.toString(formattedNames1));

        // Регулярное выражение для замены первой буквы в каждом слове на заглавную
        String regex2 = "(\\b\\w)(\\w*)";
        String replacement2 = "$1" + "$2".toUpperCase();
        String[] formattedNames2 = formatStringArray(names, regex2, replacement2);
        System.out.println(Arrays.toString(formattedNames2));

        // Регулярное выражение для замены имени и фамилии местами
        String regex3 = "(\\w+)\\s+(\\w+)";
        String replacement3 = "$2 $1";
        String[] formattedNames3 = formatStringArray(names, regex3, replacement3);
        System.out.println(Arrays.toString(formattedNames3));
    }

    public static String[] formatStringArray(String[] array, String regex, String replacement) {
        String[] result = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i].replaceAll(regex, replacement);
        }
        return result;
    }
}
