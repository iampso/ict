import java.util.Scanner;

public class lab8_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int start = 0;
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i-1]) {
                if (i == 1 || arr[i-1] <= arr[i-2]) {
                    start = i-1;
                }
            } else {
                if (i > start+1) {
                    count++;
                    System.out.println("Участок " + count + ": " + start + "-" + (i-1));
                }
            }
        }
        if (n > start+1) {
            count++;
            System.out.println("Участок " + count + ": " + start + "-" + (n-1));
        }
    }
}
