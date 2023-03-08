import java.util.Scanner;
import static java.lang.System.exit;

public class lab5_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько тебе лет?");
        int ans1 = sc.nextInt();
        if (sc.hasNextLine())
            switch (ans1) {
                case 18 -> System.out.println("Ты старый");
                case 17 -> System.out.println("Ты молодой");
                case 16 -> {
                    System.out.println("Выключи компьютер, спать пора");
                    exit(0);
                }

            }
        System.out.println("Где ты учишься? 1 - в Политехе, 2 - не в Политехе");
        int ans3 = sc.nextInt();
        if (sc.hasNextLine())
            switch (ans3) {
                case 1 -> System.out.println("Легенда");
                case 2 -> {
                    System.out.println("Отойди от компьютера!!!");
                    exit(0);
                }
            }
        System.out.println("На каком ты факультете? 1) ФПММ 2)ГНФ 3)МТФ 4)ЭТФ");
        int ans2 = sc.nextInt();
        if (sc.hasNextLine())
            switch (ans2) {
                case 1 -> System.out.println("Реально легенда");
                case 2 -> System.out.println("Такое");
                case 3 -> System.out.println("Ну....");
                case 4 ->
                        System.out.println("У тебя есть друзья?");
            }

        System.out.println("Спасибо за внимание! <3");
    }
}
