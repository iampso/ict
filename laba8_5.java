import java.util.Scanner;
import static java.lang.Math.*;

public class lab8_5 {
    public static void main(String[] args) {
        int s = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Input n: ");
        int n = in.nextInt();
        int[][] B = new int[n][n];

        for (int i = 0; i < B.length; i++){
            for (int j = 0; j < B[i].length; j++ ){
                B[i][j] = (int) (random() * 10);
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 1; i < B.length; i++){
            for (int j = 0; j < i && j < B[i].length; j++){
                s *= B[i][j];
            }
        }
        System.out.println("S = " + s);
