//Не спрашивайте зачем так много строк, я дурак
package com.test;
import java.util.Scanner;

public class lab9_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = in.nextLine();
        int spaces = 0; //Количество пробелов
        System.out.println("Введите слово: ");
        String word = in.nextLine(); //Слово, введенное пользователем
        System.out.println("Введите букву: ");
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.next().charAt(0); //Буква, введенная пользователем
        boolean isInSequence = false;
        System.out.println("Анализ строки:");
        for (char c : str.toCharArray()) {
            if (c == letter) {
                isInSequence = true;
                break;
            }
        }
        //Проверка нахождения буквы, введенной с клавиатуры
        if (isInSequence) {
            System.out.println("Буква " + letter + " входит в последовательность.");
        } else {
            System.out.println("Буква " + letter + " не входит в последовательность.");
        }
        //Поиск количества пробелов
        for (char c : str.toCharArray()) {
            if (c == ' ') {
                spaces++;
            }
        }
        System.out.println("Количество пробелов: " + spaces);
        //Проверка на нахождение всех букв, введенного слова в строке
        boolean isAllLettersInSequence = true;
        for (int i = 0; i < word.length(); i++) {
            boolean isLetterInSequence = false;
            for (char c : str.toCharArray()) {
                if (c == word.charAt(i)) {
                    isLetterInSequence = true;
                    break;
                }
            }
            if (!isLetterInSequence) {
                isAllLettersInSequence = false;
                break;
            }
        }
        if (isAllLettersInSequence) {
            System.out.println("Все буквы слова " + word + " входят в последовательность.");
        }
        else {
            System.out.println("Не все буквы слова " + word + " входят в последовательность.");
        }
        //Пара соседствующих букв
        boolean hasPairNoOrOn = false;
        for (int i = 0; i <  str.toCharArray().length - 1; i++) {
            if (( str.toCharArray()[i] == 'н' &&  str.toCharArray()[i + 1] == 'о') || ( str.toCharArray()[i] == 'о' &&  str.toCharArray()[i + 1] == 'н')) {
                hasPairNoOrOn = true;
                break;
            }
        }
        if (hasPairNoOrOn) {
            System.out.println("Среди символов имеется пара соседствующих букв \"но\" или \"он\".");
        }
        else {
            System.out.println("Среди символов нет пары соседствующих букв \"но\" или \"он\".");
        }
        //Пара одинаковых символов в строке
        boolean hasPairSameChars = false;
        for (int i = 1; i < str.toCharArray().length; i++) {
            if (str.toCharArray()[i] == str.toCharArray()[i - 1]) {
                hasPairSameChars = true;
                break;
            }
        }
        if (hasPairSameChars) {
            System.out.println("Среди символов имеется пара соседствующих одинаковых символов.");
        }
        else {
            System.out.println("Среди символов нет пары соседствующих одинаковых символов.");
        }
        //Буква д :)
        boolean hasPairSiSj = false;
        for (int i = 0; i < str.toCharArray().length - 2; i++) {
            if (str.toCharArray()[i] == str.toCharArray()[i + 1]) {
                for (int j = i + 2; j < str.toCharArray().length; j++) {
                    if (str.toCharArray()[j] == str.toCharArray()[j + 1]) {
                        hasPairSiSj = true;
                        break;
                    }
                }
                if (hasPairSiSj) {
                    break;
                }
            }
        }
        if (hasPairSiSj) {
            System.out.println("Верно, что существуют такие натуральные i и j, что 1 < i < j < п и что si, совпадает с si+1. a sj - с sj+1.");
        } else {
            System.out.println("Неверно, что существуют такие натуральные i и j, что 1 < i < j < п и что si, совпадает с si+1. a sj - с sj+1.");
        }
    }
}
