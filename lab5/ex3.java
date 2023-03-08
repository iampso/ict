import static java.lang.Math.*;

public class lab5_3 {
    public static void main(String[] args) {
        double[] arr = {-3, -2.5, -2, -1.5, -1, -0.5, 0, 0.5, 1, 1.5, 2, 2.5, 3};

        for (double x : arr){
            if (x >= 1){
                double f = pow(x, 2) + 5;
                System.out.println(f);
            }
            else {
                double a = cos(x);
                System.out.println(a);
            }
        }
    }
}
