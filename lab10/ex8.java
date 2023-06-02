package com.test;

import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;
import java.util.Random;


public class lab10_8{
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество точек для проверки");
        int n = in.nextInt();
        File file= new File("C:\\Users\\Roman\\Desktop\\ex8.txt");
        BufferedReader Fread = new BufferedReader(new FileReader(file));
        BufferedWriter Fwrite = new BufferedWriter(new FileWriter(file));
        Random randomizer = new Random();
        
        Fwrite.write("Уравнения фигур\n"+
                "1)  1/ y >= -x - 1      y >= 0     y <= -1.5x + 3.5\n" +
                "    2/ y <= 2.5x + 3.5  y <= 0     y >= -2x - 1\n" +
                "    3/ y >= 2.5x + 3.5  y >= -1    y <= -1.5x + 3.5\n" +
                "    4/ (x + 1)^2 + (y - 3)^2 <= 4  x<=-1\n" +
                "2)  1/ y >= x + 1       x >= 0     y <= -0.2x + 1.4\n" +
                "    2/ y >= x - 7       y <= 0     y >= -1/3x + 1\n" +
                "    3/ y >= -1          y <= x-3   y <= - 1/3x + 1\n "+
                "\nx y\n");
        
        DecimalFormat dec = new DecimalFormat("#.#");
        for (int i = 0;i<n;i++){
            Fwrite.write(dec.format(randomizer.nextDouble(-4,8))+" "+dec.format(randomizer.nextDouble(-4,6)) + " (" + (i+1) +")\n");
        }
        Fwrite.write("\nВывод\n");
        Fwrite.close();// закрытие файла для сохранения массива чисел

        FileWriter result = new FileWriter(file,true);
        for (int i = 0;i<10;i++){//propusk 8 str
            Fread.readLine();
        }
        
        int Count=1;
        for (int i = 0;i<n;i++){
            String [] xy = Fread.readLine().split("\\s+");
            double x = Double.parseDouble(xy[0].replaceAll(",","\\.")), y = Double.parseDouble(xy[1].replaceAll(",","\\."));
            
            if (One(x, y) || Two(x, y) || Three(x, y) || Four(x, y)) {
                result.write("Точка "+Count+" ("+x+";"+y+") попала в область 1.\n");
            } 
            
            else if (Five(x, y) || Six(x, y) || Seven(x, y) || Eight(x, y)) {
                result.write("Точка "+Count+" ("+x+";"+y+") попала в область 2.\n");
            }
            
            else if(OneOne(x, y) || TwoTwo(x, y) || ThreeThree(x, y) || FourFour(x, y)){
                result.write("Точка "+Count+" ("+x+";"+y+") попала на границу 1.\n");
            }
            
            else if(FiveFive(x, y) || SixSix(x, y) || SevenSeven(x, y) || EightEight(x, y)){
                result.write("Точка "+Count+" ("+x+";"+y+") попала на границу 2.\n");
            }
            
            else { result.write("Точка "+Count+" ("+x+";"+y+") не попала.\n");
            }
            Count++;
        }
        result.close();
    }

    public static double b(double x1, double y1, double x2, double y2) {
        return y1 - x1 * k(x1, y1, x2, y2);
    }
    
    public static double k(double x1, double y1, double x2, double y2) {
        return (y1 - y2) / (x1 - x2);
    }
   
     public static boolean One(double x, double y) {
        if ((y < k(0, -1, 1, 2) * x + b(0, -1, 1, 2)) && x >= 0 && y < k(1, 2, 0, 3.5) * x + b(1, 2, 0, 3.5)) {
            return true;
        }
        return false;

    }
    
    public static boolean Two(double x, double y) {
        if ((y < k(-1, 1, 0, 3.5) * x + b(-1, 1, 0, 3.5)) && x <= 0 && y > k(0, -1, -1, 1) * x + b(0, -1, -1, 1)) {
            return true;
        }
        return false;
    }
    
    public static boolean Three(double x, double y) {
        if ((y > k(-1, 1, 0, 3.5) * x + b(-1, 1, 0, 3.5)) && x >= -1 && y < k(-1, 5, 0, 3.5) * x + b(-1, 5, 0, 3.5)) {
            return true;
        }
        return false;
    }

    public static boolean Four(double x, double y) {
        if ((Math.pow(x + 1, 2) + Math.pow(y - 3, 2) < 4) && x <= -1) {
            return true;
        }
        return false;
    }

    public static boolean Five(double x, double y) {
        if ((y < k(2, 1, 7, 0) * x + b(2, 1, 7, 0)) && x >= 0 && y > k(2, 3, 0, 1) * x + b(-1, 5, 0, 3.5)) {
            return true;
        }
        return false;
    }

    public static boolean Six(double x, double y) {
        if ((y > k(7, 0, 6, -1) * x + b(7, 0, 6, -1)) && y <= 0 && y > k(3, 0, 6, -1) * x + b(3, 0, 6, -1)) {
            return true;
        }
        return false;
    }
    public static boolean Seven(double x, double y) {
        if ((y < k(3, 0, 6, -1) * x + b(3, 0, 6, -1)) && y >= -1 && y < k(3, 0, 2, -1) * x + b(3, 0, 2, -1)) {
            return true;
        }
        return false;
    }
    public static boolean Eight(double x, double y) {
        if ((Math.pow(x - 4, 2) + Math.pow(y + 1, 2) < 4) && y <= -1) {
            return true;
        }
        return false;
    }
    public static boolean OneOne(double x, double y) {
        if (((y == k(0, -1, 1, 2) * x + b(0, -1, 1, 2)) || y == k(1, 2, 0, 3.5) * x + b(1, 2, 0, 3.5)) && x >= 0 && x <= 1) {
            return true;
        }
        return false;

    }

    public static boolean TwoTwo(double x, double y) {
        if ((y == k(0, -1, -1, 1) * x + b(0, -1, -1, 1)) && x <= 0 && x>=-1) {
            return true;
        }
        return false;
    }

    public static boolean ThreeThree(double x, double y) {
        if (( y == k(-1, 5, 0, 3.5) * x + b(-1, 5, 0, 3.5))&& x >= -1 && x<=0) {
            return true;
        }
        return false;
    }

    public static boolean FourFour(double x, double y) {
        if ((Math.pow(x + 1, 2) + Math.pow(y - 3, 2) == 4) && x <= -1) {
            return true;
        }
        return false;
    }

    public static boolean FiveFive(double x, double y) {
        if ((y == k(2, 1, 7, 0) * x + b(2, 1, 7, 0) && x>=2 && x<=3)  || (y == k(2, 3, 0, 1) * x + b(-1, 5, 0, 3.5) && x >= 2 && x<=7)) {
            return true;
        }
        return false;
    }

    public static boolean SixSix(double x, double y) {
        if ((y == k(7, 0, 6, -1) * x + b(7, 0, 6, -1)) && y <= 0 && y>=-1) {
            return true;
        }
        return false;
    }
    public static boolean SevenSeven(double x, double y) {
        if (y < k(3, 0, 2, -1) * x + b(3, 0, 2, -1) && y >= -1 && y<=0) {
            return true;
        }
        return false;
    }
    public static boolean EightEight(double x, double y) {
        if ((Math.pow(x - 4, 2) + Math.pow(y + 1, 2) == 4) && y <= -1) {
            return true;
        }
        return false;
    }
}
