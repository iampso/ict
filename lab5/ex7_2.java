import java.util.Scanner;
import static java.lang.Math.*;

public class lab5_7_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите x");
        double x = in.nextDouble();
        if (x >= - 4 & x <= 4){
            if (x <= -1){
                double z;
                z = (1 - abs(x)) / (cbrt(1 + x + pow(x, 2)));
                System.out.println("Z = " + z);
            }
            if (x > -1 & x < 0){
                double z;
                z = 2 * log(1 + pow(x, 2)) + (1 + pow(cos(x), 4)) / (2 - x);
                System.out.println("Z = " + z);
            }
            if (x >= 0){
                double z;
                z = pow(1 - x, 0.6);
                System.out.println("Z = " + z);
            }
        }
        else {
            System.out.println("Ошибка!!");
        }
    }
}
