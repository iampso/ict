import static java.lang.Math.*;
import java.util.Scanner;

public class lab5_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите x ");
        double x = in.nextDouble();
        if (x >= - 4 & x <= 4){
            if (x <= 0){
                double g;
                g = 3*sin(x) - pow(cos(x), 2);
                System.out.println("g = " +g);
            }
            if (x > 0){
                double g;
                g = 3 * sqrt(1 + pow(x,2));
                System.out.println("g = " + g);
            }
            else {
            System.out.println("Ошибка!!!");
        }
    }
}
}
