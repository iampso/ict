import java.util.Arrays;
import static java.lang.Math.*;

public class lab5_4 {
    public static void main(String[] args) {
        double[] arr = {-3, -2.5, -2, -1.5, -1, -0.5, 0, 0.5, 1, 1.5, 2, 2.5, 3};
        for(double x : arr){
            if (x >= 1){
                System.out.println(exp(pow(x,2)));
            }
            if (x > 0 & x < 2){
                System.out.println(pow(x, 2) + 5);
            }
            if (x > 2){
                System.out.println(4/pow(x, 2));
            }
            if (x == 2 || x == 0){
                System.out.println(1);
            }
        }
    }
}
