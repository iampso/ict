import java.io.*;

public class test5 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Roman\\Desktop\\test5.txt");
        File file2 = new File("C:\\Users\\Roman\\Desktop\\test5.2.txt");
        BufferedReader fread = new BufferedReader(new FileReader(file));
        FileWriter fwrite = new FileWriter(file2,true);
        StringBuilder line = new StringBuilder();
        while (fread.ready()){
            line.append(fread.readLine());
        }
        String [] predlozhenie = String.valueOf(line).split("\\.");
        for (int i = 0;i<predlozhenie.length;i++){
            String pred1=predlozhenie[i];
            String [] slovo = predlozhenie[i].split("\\s+");
            for (int j= 0;j< slovo.length;j++){
                if (slovo[j].length()>=2){
                    String s1 =String.valueOf(slovo[j].charAt(slovo[j].length()-1)), s2 = String.valueOf(slovo[j].charAt(0));
                    if(s1.equalsIgnoreCase(s2)){
                        fwrite.write(pred1+".");
                        break;
                    }
                }
            }
        }
        fwrite.close();
    }
}
