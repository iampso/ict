import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] arr = new char[10];
        System.out.println("Введите массив символов из 10 элементов:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.next().charAt(0);
        }
        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(arr[i])) {
                arr[i] = '*';
            }
        }
        System.out.println("Массив после замены символов-цифр на символ *:");
        for (char c : arr) {
            System.out.print(c + " ");
        }
    }
}
