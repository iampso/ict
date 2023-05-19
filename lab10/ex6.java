import java.io.*;

public class test6 {
    public static void main(String[] args) throws IOException {
        File file= new File("C:\\Users\\Roman\\Desktop\\test6.txt");
        BufferedReader fread = new BufferedReader(new FileReader(file));
        FileWriter fwrite = new FileWriter(file,true);
        int Count=0;
        fwrite.write("\n\nВЫВОД\n");
        while (fread.ready()){
            String line = fread.readLine();
            String [] Massiv = line.split("\\s+");
            if (Double.parseDouble(Massiv[1])>=2.0 & Double.parseDouble(Massiv[1])<=5.0 &
                    Integer.parseInt(Massiv[2])>=2000 & Integer.parseInt(Massiv[2])<=2007){
                fwrite.write(line+"\n");
                Count++;
            }
        }
        fwrite.write("Количество таких машин\t"+Count);
        fwrite.close();
    }
}
