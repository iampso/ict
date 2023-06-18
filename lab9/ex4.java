package com.test;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.Math.cos;

public class lab9_4{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the number of examples:");
        int n = in.nextInt();
        while (n<11){
            System.out.println("You have entered an insufficient number!");
            n= in.nextInt();
        }
        System.out.println("How do you prefer to make input? \n1 - by lines\n2 - by columns");
        int m = in.nextInt();
        String [][] primer= new String[n][n];
        if (m==1){
            for (int i = 0;i<n;i++){
                System.out.println("Example "+(i+1));
                for (int j = 0;j<n;j++){
                    primer[i][j] = in.next();
                }
            }
        }
        else {
            for (int i = 0;i<n;i++){
                System.out.println("Example "+(i+1));
                for (int j = 0;j<n;j++) {
                    primer[j][i] = in.next();
                }
            }
        }
        int cnt = 0;
        ArrayList<String> ArrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            //Строка
            if (Figure(primer[i][0]) & Figure(primer[i][3]) & Figure(primer[i][5]) & Figure(primer[i][8]) 
                    & Objects.equals(primer[i][1], "*") & Objects.equals(primer[i][2], "(") & 
                    Objects.equals(primer[i][4], "-") 
                    & Objects.equals(primer[i][6], ")") & Objects.equals(primer[i][7], "-")& Objects.equals(primer[i][9], "=")) {
                LinesPrint(primer, i);
                
                if (countSTR(primer, i)) {
                    cnt++;
                } 
                else {
                    ExampleToArrayString(primer, ArrayList, i);
                }
                //столбец
                } 
            else if (Figure(primer[0][i]) & Figure(primer[3][i]) & Figure(primer[5][i]) & Figure(primer[8][i]) 
                    & Objects.equals(primer[1][i], "*") & Objects.equals(primer[2][i], "(") & 
                    Objects.equals(primer[4][i], "-") & 
                    Objects.equals(primer[6][i], ")") & Objects.equals(primer[7][i], "-") & Objects.equals(primer[i][9], "=")) {
                ColumnsPrint(primer, i);
                if (countColumns(primer, i)) {
                    cnt++;
                } 
                else {
                    ExampleToArrayColumns(primer, ArrayList, i);
                }
            }
        }
        System.out.println("Number of correct solutions: " + cnt + "\nCorrected solutions:" + "\n");
        printArr(ArrayList);
    }

public static boolean Figure(String m) {
        if (m == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(m);
        } 
        catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

private static boolean countSTR(String[][] m, int o) {
        int i = 8;
        while (i != m.length) {
            for (i = 8; i < m.length; i++) {
                if (parseInt(m[o][0]) * (parseInt(m[o][3]) - parseInt(m[o][5]))-parseInt(m[o][8]) == parseInt(m[o][i])) {
                    return true;
                }
            }
        }
        return false;
        }

private static boolean countColumns(String[][] m, int o) {
        int i = 8;
        while (i != m.length) {
            for (i = 8; i < m.length; i++) {
                if (parseInt(m[0][o]) * (parseInt(m[3][o])) - parseInt(m[5][o])-parseInt(m[8][o]) == parseInt(m[i][o])) {
                    return true;
                }
            }
        }
        return false;
        }

public static void LinesPrint(String[][] m, int p) {
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[p][i] + "\t");
        }
        System.out.println();
    }

public static void ColumnsPrint(String[][] m, int p) {
        for (int i = 0; i < m[0].length; i++) {
            System.out.print(m[i][p] + "\t");
        }
        System.out.println();
    }

public static void ExampleToArrayString(String[][] m, ArrayList<String> arrayList, int p) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            if (i == 8) {
                str.append(String.valueOf(parseInt(m[p][0]) * (parseInt(m[p][3]) - parseInt(m[p][5]))-parseInt(m[p][8])));
            } 
            else {
                str.append(m[p][i]);
            }
        }
        arrayList.add(String.valueOf(str));
    }

public static void ExampleToArrayColumns(String[][] m, ArrayList<String> arrayList, int p) {
        StringBuilder str= new StringBuilder();
        for (int i = 0; i < 9; i++) {
            if (i == 8) {
                str.append(String.valueOf(parseInt(m[0][p]) * (cos(parseInt(m[3][p])) - parseInt(m[5][p]))));
            } 
            else {
            str.append(m[i][p]);
            }
        }
        arrayList.add(String.valueOf(str));
    }

public static void printArr(ArrayList<String> ar) {
        for (String i:ar){
            System.out.println(i);
        }
    }
}
