import java.util.Scanner;
import static java.lang.Math.*;

public class lab5_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите x ");
        double x = in.nextDouble();
        System.out.println("Введите y ");
        double y = in.nextDouble();
        if (y<sqrt(36-x*x) & y >= 0)
            if ((y<3*x+12 & y<-0.75*x+0.75) || (y<x-1 & x<4) ||
                    ((1 > pow(x+2,2)+pow(y-4,2))) || (4 > pow(x-1,2)+pow(y-3,2)
                    & 1 < pow(y-2,2) + pow(x-1,2))) {
                System.out.println("Промах");
            }
            else {
                System.out.println("Попал");
            }
        else {
            System.out.println("Промах");
        }
    }
}
