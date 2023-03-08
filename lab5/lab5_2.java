import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class lab5_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        System.out.println("Введите певрое число ");
        a = in.nextInt();
        System.out.println("Введите второе число ");
        b = in.nextInt();
        System.out.println("Введите третье число ");
        c = in.nextInt();
        Integer[] arr = {a, b, c};
        Arrays.sort(arr, Collections.reverseOrder());
        for (double values : arr){
            System.out.print(values + ", ");
        }
    }
}


