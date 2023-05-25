package com.test;

import java.io.IOException;
import java.io.File;
import java.io.FileWriter;


public class lab10_2 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Roman\\Desktop\\ex2.txt");
        FileWriter Fwrite = new FileWriter(file);
        Fwrite.write("\t\t\t\t\t\t\tТаблица вычитания\n");
        int vic=0;
        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                vic = b - a;
                Fwrite.write(b + " - " + a + " = " + vic + "\t");
            }

            Fwrite.write("\n");
        }
    
        Fwrite.close();
    }
}
