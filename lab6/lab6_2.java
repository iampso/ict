package com.test;

public class lab6_2 {
    public static void main(String[] args) {
        int n = 0;
        for (int i = 0; i < 999999; i++) {
            String s = String.format("%06d", i); //Пример: 000001
            int sum1 = 0; //Сумма первых трёх цифр
            int sum2 = 0; //Сумма последних трёх цифр

            for (int j = 0; j < 3; j++) {   //Равенство сумм
                sum1 += s.charAt(j) - '0';
                sum2 += s.charAt(j + 3) - '0';
            }

            if (sum2 == sum1 && sum1 == 13) { //Проверка на "счастливость"
                n++;
            }
        }
        System.out.println("Количество билетов: " + n);

    }
}

