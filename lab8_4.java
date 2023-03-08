/* Не тестил */
import java.util.Scanner;
import java.util.Random;

public class lab8_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input size of array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        getArr(arr);
        ShakerSort(arr);
        BubbleSort(arr);
    }

    public static void ShakerSort(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int counter = 0;

        while (left <= right) {
            for (int i = left; i < right; i++) {
                counter++;
                if (arr[i] >= arr[i + 1]) {
                    getSwap(arr, i, i + 1);
                }
                right--;
            }
            for (int i = right; i > left; i--) {
                counter++;
                if (arr[i - 1] >= arr[i]) {
                    getSwap(arr, i - 1, i);
                }
                left++;
            }
            if (counter == 0) {
                System.out.println("Конец, каунтер равен 0");
                break;
            }
        }
        System.out.println("Количество итераций: " + counter);
    }

    public static void getArr(int[] arr) {
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10);
        }
    }

    public static void getSwap(int[] arr, int i, int j) {
        int array = arr[i];
        arr[i] = arr[j];
        arr[j] = array;
    }

    public static void BubbleSort(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    counter++;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (counter == 0) {
                System.out.println("Конец, каунтер равен 0");
                break;
            }
        }
        System.out.println("Количество итераций: " + counter);
    }
}
