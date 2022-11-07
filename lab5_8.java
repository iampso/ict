import java.util.Scanner;

public class lab5_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите день недели ");
        String a = in.nextLine();
        switch (a){
            case "Понедельник" -> System.out.println("Математика");
            case "Вторник" -> System.out.println("Фмзкультура");
            case "Среда" -> System.out.println("Информатика");
            case "Четверг" -> System.out.println("Английский");
            case "Пятница" -> System.out.println("Философия");
            case "Суббота" -> System.out.println("Выходной");
            case "Воскресенье" -> System.out.println("Выходной");
        }
    }
}
