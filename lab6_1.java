import java.util.Scanner;

import static java.lang.Math.pow;

public class laba {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите x");
        double x = in.nextDouble();
        System.out.println("Введите n");
        int n = in.nextInt();
        System.out.println("Введите M");
        double m = in.nextDouble();
        double res = 0;
        double res_m = 0;
        for (int i = 0; i <= n; i++){
            res += 1/pow(x, 2 * i - 2);
            if (1/pow(x, 2 * i - 2) < m)
                res_m += 1/pow(x, 2 * i - 2);
        }
        System.out.println("Сумма первых n членов ряда = " + res);
        System.out.println("Сумма членов ряда, которые меньше M = " + res_m);
    }
}
