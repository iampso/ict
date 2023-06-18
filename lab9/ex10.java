package com.test;
import java.util.Scanner;

public class lab9_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the number of people:");
        int n = in.nextInt();
        int count = 0;
        System.out.println("Input data:");
        String [][] inf = new String[n][];
        in.nextLine();
        for (int i = 0; i < n; i++) {
            inf[i] = in.nextLine().split(";");
        }

        for (int i = 0; i < n; i++){
            int height = Integer.parseInt(inf[i][5]), weight = Integer.parseInt(inf[i][6]);
            if (height >= 150 & height <= 180 & weight >= 50 & weight <= 80){
                count++;
                for (int j = 0; j < 10; j++){
                    System.out.print(inf[i][j] + ";");
                }
                System.out.println();
            }
        }
        System.out.println("Such people: " + count);
    }
}
