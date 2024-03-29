//нет нерегламентированного ввода
package com.test;
import java.util.Scanner;

public class lab9_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int n = in.nextInt();
        String[][] array = new String[n][13];

        for (int i = 0; i < n; i++) {
            System.out.println("Введите информацию о " + (i+1) + "-м элементе массива:");
            System.out.print("Факультет: ");
            array[i][0] = in.nextLine();
            System.out.print("Кафедра: ");
            array[i][1] = in.nextLine();
            System.out.print("ФИО руководителя: ");
            array[i][2] = in.nextLine();
            System.out.print("Количество членов исследовательской группы: ");
            array[i][3] = in.nextLine();
            System.out.print("Количество членов исследовательской группы младше 39 лет: ");
            array[i][4] = in.nextLine();
            System.out.print("Количество студентов, привлеченных к проекту: ");
            array[i][5] = in.nextLine();
            System.out.print("Количество аспирантов, привлеченных к проекту: ");
            array[i][6] = in.nextLine();
            System.out.print("Сумма финансирования: ");
            array[i][7] = in.nextLine();
            System.out.print("Наличие лабораторного оборудования (да/нет): ");
            array[i][8] = in.nextLine();
            System.out.print("Общая стоимость оборудования: ");
            array[i][9] = in.nextLine();
            System.out.print("Наличие вычислительных станций (да/нет): ");
            array[i][10] = in.nextLine();
            System.out.print("Количество ПК: ");
            array[i][11] = in.nextLine();
            System.out.print("Количество серверных платформ: ");
            array[i][12] = in.nextLine();
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Информация о " + (i+1) + "-м элементе массива:");
            System.out.println("Факультет: " + array[i][0]);
            System.out.println("Кафедра: " + array[i][1]);
            System.out.println("ФИО руководителя: " + array[i][2]);
            System.out.println("Количество членов исследовательской группы: " + array[i][3]);
            System.out.println("Количество членов исследовательской группы младше 39 лет: " + array[i][4]);
            System.out.println("Количество студентов, привлеченных к проекту: " + array[i][5]);
            System.out.println("Количество аспирантов, привлеченных к проекту: " + array[i][6]);
            System.out.println("Сумма финансирования: " + array[i][7]);
            System.out.println("Наличие лабораторного оборудования: " + array[i][8]);
            System.out.println("Общая стоимость оборудования: " + array[i][9]);
            System.out.println("Наличие вычислительных станций: " + array[i][10]);
            System.out.println("Количество ПК: " + array[i][11]);
            System.out.println("Количество серверных платформ: " + array[i][12]);
            System.out.println();
        }
        double financingSum = 0; // сумма финансирования проектов, удовлетворяющих условиям
        double equipmentCostSum = 0; // сумма стоимости оборудования проектов, удовлетворяющих условиям
        int count = 0; // количество проектов, удовлетворяющих условиям
        for (int i = 0; i < n; i++) {
            double financing = Double.parseDouble(array[i][7]);
            double equipmentCost = Double.parseDouble(array[i][9]);
            int researchers = Integer.parseInt(array[i][3]);
            int youngResearchers = Integer.parseInt(array[i][4]);
            int students = Integer.parseInt(array[i][5]);
            int postgraduates = Integer.parseInt(array[i][6]);

            if (financing > 0.5 && equipmentCost > 1 && youngResearchers > researchers/2 && students >= 1 && postgraduates >= 2) {
                String leaderName = array[i][2];
                System.out.println("ФИО руководителя проекта: " + leaderName);
                financingSum += financing;
                equipmentCostSum += equipmentCost;
                count++;
            }
        }
        System.out.println("Количество проектов, удовлетворяющих условиям: " + count);
        System.out.println("Сумма финансирования проектов, удовлетворяющих условиям: " + financingSum);
        System.out.println("Сумма стоимости оборудования проектов, удовлетворяющих условиям: " + equipmentCostSum);
    }
}
