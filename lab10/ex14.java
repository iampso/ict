import java.io.*;
import java.text.DecimalFormat;

import static java.lang.Double.parseDouble;
import static java.lang.Math.abs;

public class test14 {
    public static DecimalFormat forma = new DecimalFormat("##");
    public static DecimalFormat forma1 = new DecimalFormat("####.####");
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\Roman\\Desktop\\test14.txt");
        File file2 = new File("C:\\Users\\Roman\\Desktop\\test14.2.txt");
        BufferedReader fread = new BufferedReader(new FileReader(file));
        FileWriter frite2 = new FileWriter(file2);

        Double maxUX = -100.0, minUX = 100.0, minUY = 100.0, maxUY = -100.0, maxUZ = -100.0, minUZ = 100.0, maxUSUM = -100.0,
                minUSUM = 100.0, sumUSUM = 0.0, srUSUM = 0.0, sumUX = 0.0, srUX = 0.0, sumUY = 0.0, srUY = 0.0, sumUZ = 0.0, srUZ = 0.0,
                otklonenieUX=0.0,otklonenieUY=0.0,otklonenieUZ=0.0,otklonenieUSUM=0.0;

        String[] dannie2;
        int kolvo_strok = 0;
        for (int i = 0; i < 10; i++) {
            fread.readLine();
        }

        while (fread.ready()) {
            dannie2 = fread.readLine().split("-0\\.");
            for (int i = 1;i < dannie2.length;i++){
                dannie2[i]="\s-0." + dannie2[i];
            }
            String line = conec(dannie2).replaceFirst("\\s+","");
            String [] dannie = line.split("\\s+");
//max
            if (parse(dannie[1])>=maxUX){maxUX=parse(dannie[1]);}
            if (parse(dannie[2])>=maxUY){maxUY=parse(dannie[2]);}
            if (parse(dannie[3])>=maxUZ){maxUZ=parse(dannie[3]);}
            if (parse(dannie[4])>=maxUSUM){maxUSUM=parse(dannie[4]);}
//min
            if (parse(dannie[1])<=minUX){minUX=parse(dannie[1]);}
            if (parse(dannie[2])<=minUY){minUY=parse(dannie[2]);}
            if (parse(dannie[3])<=minUZ){minUZ=parse(dannie[3]);}
            if (parse(dannie[4])<=minUSUM){minUSUM=parse(dannie[4]);}
//sum
            sumUSUM+=parse(dannie[4]);sumUZ+=parse(dannie[3]);sumUY+=parse(dannie[1]);sumUX+=parse(dannie[2]);

            kolvo_strok++;
        }
        fread.close();
        BufferedReader fread1=new BufferedReader(new FileReader(file));

        srUSUM= sumUSUM/kolvo_strok;srUY = sumUY/kolvo_strok;srUX = sumUX/kolvo_strok;srUZ = sumUZ/kolvo_strok;

        frite2.write("ВЫВОД\n\n\tМакс знач\tМин значение\tСреднее значение\n" +
                "UX\t"+maxUX+"\t"+minUX+"\t\t"+srUX+"\n"+
                "UY\t"+maxUY+"\t"+minUY+"\t\t"+srUY+"\n"+
                "UZ\t\s\s"+maxUZ+"\t\t\t"+minUZ+"\t\t\t"+srUZ+"\n"+
                "USUM\t"+maxUSUM+"\t"+minUSUM+"\t\t"+srUSUM+"\n\n");

        for (int i =0;i<10;i++){
            fread1.readLine();
        }
        frite2.write("PRINT U  Г7НПЕМ ИРТОЬДЩ0З  NODAL SOLUTION PER NODE\n" +
                " \n" +
                "  ***** POST1 NODAL DEGREE OF FREEDOM LISTING *****                            \n" +
                " \n" +
                "  LOAD STEP=     1  SUBSTEP=    20                                             \n" +
                "   TIME=    1.0000      LOAD CASE=   0                                         \n" +
                " \n" +
                "  THE FOLLOWING DEGREE OF FREEDOM RESULTS ARE IN THE GLOBAL COORDINATE SYSTEM  \n" +
                " \n" +
                "    NODE       UX           UY           UZ           USUM\n");
        while (fread1.ready()) {//zapis otklonenia

            String[] dannie = fread1.readLine().split("-0\\.");
            for (int i = 1;i<dannie.length;i++){
                dannie[i]=" -0."+dannie[i];
            }

            String line = conec(dannie).replaceFirst("\\s+","");
            String [] dan = line.split("\\s+");

            otklonenieUX=parse(dan[1]);otklonenieUY=parse(dan[2]);otklonenieUZ=parse(dan[3]);otklonenieUSUM=parse(dan[4]);

            frite2.write("\s\s\s\s"+dan[0]+ "\t" + otklonenie(otklonenieUX,srUX)+"\t"+otklonenie(otklonenieUY,srUY)+ "\t\t"
                    + 0 + "\t\t" + otklonenie(otklonenieUSUM,srUSUM) + "\n");
        }

        frite2.flush();frite2.close();
    }
    public static String otklonenie(double n,double m){
        return forma1.format(abs(n/m*100-100));
    }
    public static String conec(String [] mas){
        String fwe="";
        for (int i = 0;i<mas.length;i++){
            fwe+=mas[i];
        }
        return fwe;
    }
    public static double parse(String cifra){
        return Double.parseDouble(cifra);
    }
}
