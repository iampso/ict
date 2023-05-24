//Не тестил

package com.test;
import java.io.*;

public class lab10_1 {
    /*Проверка на пробелы*/
    public static int Space(String str){
        int Space = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ') {
                Space += 1;
            }
        }
        return Space;
    }

    /*Проверка на введенную с клавиатуры букву*/
    public static Boolean Letter(String str, String letter){
        if (str.contains(letter)){
            return true;
        }
        return false;
    }
    
    /*Проверка на последовательность*/
    public static Boolean Sequence(String str, String Sequence) {
        for (int i = 0; i < str.length() - 1; i++) {
            char[] charac = str.toCharArray();
            if (charac[i] == Sequence.charAt(0) && charac[i + 1] == Sequence.charAt(1) && charac[i + 2] ==
                    Sequence.charAt(2) && charac[i + 3] == Sequence.charAt(3)) {
                return true;
            }
        }
        return false;
    }

    /*Проверка на пару соседствующих букв*/
    public static Boolean TwoLetters(String str){
        if (str.contains("но") || str.contains("он") ){
            return true;
        }
        return false;
    }

    /*Проверка на одинаковые буквы*/
    public static Boolean Same(String str){
        for (int i = 0; i < str.length()-3; i++){
            char x = str.charAt(i+2);
            char y = str.charAt(i+1);
            char z = str.charAt(i);
            if ((z == y) || (y == x)) {
                return true;
            }
        }
        return false;
    }

    /*Проверка на натуральные*/
    public static boolean Natural(String str){
        for (int i = 2; i < str.length()-2; i++){
            char a = str.charAt(i);
            char b = str.charAt(i+1);
            for(int j = i + 1; j < str.length()-1; j++){
                char c = str.charAt(j);
                char d = str.charAt(j + 1);
                if((a == b && c == d )){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {

        File file= new File("C:\\Users\\Roman\\Desktop\\test1.txt");
        BufferedReader fread = new BufferedReader(new FileReader(file));
        FileWriter fwrite = new FileWriter(file,true);

        String str = fread.readLine();
        String str1 = fread.readLine();
        String str2 = fread.readLine();

        fwrite.write("\n\nOUTPUT\nNumber of spaces = " + Space(str)+"\n");

        if (Letter(str,str1)){
            fwrite.write("This letter '" + str1 + "' included in the line\n");
        }

        else {
            fwrite.write("This letter '" + str1 + "' not included in the line\n");
        }

        if (Sequence(str,str2)){
            fwrite.write("This sequence '" + str2+ "' included in the line \n");
        }

        else {
            fwrite.write("This sequence '" + str2+ "' not included in the line\n");
        }
        if (TwoLetters(str)){
            fwrite.write("Letters 'но' or 'он' included in the line\n");
        }

        else {
            fwrite.write("Letters 'но' or 'он' not included in the line\n");
        }

        if (Same(str)){
            fwrite.write("There are a pair of adjacent identical characters\n");
        }

        else {
            fwrite.write("There are not a pair of adjacent identical charactersn");
        }

        if(Natural(str)){
            fwrite.write("Match\n");
        }

        else {
            fwrite.write("Not match\n");
        }
        fwrite.close(); fread.close();
    }
}
