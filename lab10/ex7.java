package com.test;
import java.io.*;
import java.text.DecimalFormat;

import static java.lang.Math.*;

public class lab10_7 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Roman\\Desktop\\ex7.txt");
        FileWriter Fwrite = new FileWriter(file);
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        Fwrite.write("Problem statement\n" +
                "if (x>=0){f(x)=sin(PI*x) x in [0;3], x+=0.5\n" +
                "else f(x)=PI*pow(x,2) x in [-3;0) x+=0.5\n");
        for (double x = -3;x<=3;x+=0.5){
            if (x>=0) {
                Fwrite.write("f("+x+") = "+decimalFormat.format(sin(PI*x))+"\t");
            }
            else {
                Fwrite.write("f("+x+") = "+decimalFormat.format(PI*pow(x,2))+"\t");
            }
        }
        Fwrite.close();
    }
}
