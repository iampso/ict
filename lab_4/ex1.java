import java.util.Scanner;
import static java.lang.Math.*;
import static java.lang.Math.cos;

public class lab4_1 {
public static double SearchingG(){
        Scanner in = new Scanner(System.in);

        System.out.print("Input y:");
        double y = in.nextDouble();

        System.out.print("Input f:");
        double f = in.nextDouble();

        double g;
        g = (exp(2*y) + sin(f))/log(3.8 * y + f);

        System.out.println("G = " + g );

        return g;
    }

    public static double SearchingL() {
        Scanner in = new Scanner(System.in);

        System.out.print("Input x:");
        double x = in.nextDouble();

        System.out.print("Input a:");
        double a = in.nextDouble();

        System.out.print("Input c:");
        double c = in.nextDouble();

        double l;
        l = (sqrt(exp(x) - pow(cos(pow(x, 2) * pow(a, 2)), 4)) + pow(atan(a - pow(x, 5)), 4)) / exp(1) * sqrt(abs(a + x * pow(c, 4)));

        System.out.println("L = " + l);

        return l;
    }

    public static void main(String[] args) {
        SearchingG();
        SearchingL();
    }
}
