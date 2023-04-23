import java.util.Scanner;

public class lab8_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите кол-во эл-тов массива: ");
        int n = scan.nextInt(), count = 0;
        int[] mas = new int[n];
        System.out.println("Введите эл-ты массива: ");
        for (int i = 0; i < n; i++) {
            mas[i] = scan.nextInt();
        }
        System.out.println("Исходный массив:");
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        int left = 0, right = mas.length - 1;
        do {
            count++;
            for (int i = left; i < right; i++) {
                if (mas[i] > mas[i + 1]) {
                    int in = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = in;
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (mas[i - 1] > mas[i]) {
                    int in = mas[i];
                    mas[i] = mas[i - 1];
                    mas[i - 1] = in;
                }
            }
            left++;
        }
        while (left <= right);
        System.out.println();
        System.out.println("Отсортированный массив: ");
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
            System.out.println();
            System.out.print("Кол-во итерации = " + count);
        }
    }
}
