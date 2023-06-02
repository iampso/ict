package com.test;
import java.io.*;

public class lab10_9 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Roman\\Desktop\\ex9.txt");
        BufferedReader Fread = new BufferedReader(new FileReader(file));
        BufferedWriter Fwrite = new BufferedWriter(new FileWriter(file,true));
        int abc=0;

        while (Fread.ready()){
            Fread.readLine();
            abc++;
        }

        Fread.close();
        int i =0;
        String[][] room = new String[abc][11];
        BufferedReader Fread1 = new BufferedReader(new FileReader(file));

        while (i!=abc-1) {
            String[] clasi = Fread1.readLine().split(",");
            int c = 0;
                room[i][0] = clasi[c++];
                room[i][1] = clasi[c++];
                room[i][2] = clasi[c++];
                room[i][3] = clasi[c++];
                room[i][4] = clasi[c++];
                room[i][5] = clasi[c++];
                room[i][6] = clasi[c++];
                if (room[i][6].equalsIgnoreCase("Да")) {
                    room[i][7] = clasi[c++];
                }
                else {
                    room[i][7] = "0";
                }

                room[i][8] = clasi[c++];
                room[i][9] = clasi[c++];
                room[i][10] = clasi[c++];
                i++;
            }

        int count = 0;
        int countFPMM = 0;
        int countGUMF = 0;
        for (int j = 0; j < abc-1; j++) {
            if (room[j][3].equalsIgnoreCase("Лекционная") &&
                    room[j][5].equalsIgnoreCase("Да")) {
                count++;
                if (room[j][8].equalsIgnoreCase("ФПММ")) {
                    countFPMM++;
                }
                else if (room[j][8].equalsIgnoreCase("ГУМФ")) {
                    countGUMF++;
                }
            }
        }
        int countcomp = 0;
        for (int j = 0; j < abc-1; j++) {
            if (room[j][3].equalsIgnoreCase("Лекционная") &&
                    room[j][5].equalsIgnoreCase("Да") &&
                    Integer.parseInt(room[j][7]) > 0) {
                countcomp++;
            }
        }

        Fwrite.write("\nКоличество лекционных аудиторий с мультимедийным оборудованием: " + count+"\n");Fwrite.write("Из них:\n");
        Fwrite.write("        На факультете ИТ: " + countFPMM+"\n");
        Fwrite.write("        На факультете Математики: " + countGUMF+"\n");
        Fwrite.write("        Количество лекционных аудиторий с хотя бы одним компьютером: " + countcomp);
        Fwrite.close();
    }
}
