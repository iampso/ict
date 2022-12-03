import static java.lang.Math.*;

public class laba {
    public static void main(String[] args) {
        double sum;
        double h;
        for(double n = 10;n <= 10000; n *= 10){
            h = 1/n;
            sum = 0;
            for (int i = 0; i < n; i++){
                sum += (sin(n-h*i) - pow(n-h*(i-1),2))/2 * h;
            }
            System.out.println(n + "          " + h + "         " + sum + "         -1.38" + "       "+ sum + 1.38);
        }

    }
} 
