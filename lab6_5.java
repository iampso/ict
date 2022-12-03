import java.util.Scanner;
import static java.lang.Math.*;

public class laba {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double x;
        System.out.println("Введите значение x");
        while ((x = in.nextDouble()) >= 1){
            System.out.println("Ошибка! Введите другое значение x");
        }
        int k;
        double s;
        for (double ep = 0.0001; ep <= 0.01; ep*=10){
            s = 0;
            k = 0;
            while (Math.abs(pow(cos(x),3) - s) > ep){
                s += 1/4f * pow(-1, k) * (pow(3, 2 * k) + 3)/factorial1(2*k) * pow(x, 2 * k);
                k++;
            }
            System.out.println(k);
            System.out.println(s + " " + ep);
        }
    }
    public static int factorial1(int enter1){
        int res1 = 1;
        for (int i = 1; i <= enter1; i ++){
            res1 *= i;
        }
        return res1;
    }
}
