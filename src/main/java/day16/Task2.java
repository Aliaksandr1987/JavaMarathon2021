package day16;

import java.io.*;
import java.util.*;

//Реализовать программу, записывающую числа разных типов в 2 файла.
//Файл 1 должен называться “file1.txt”, а Файл 2 должен называться “file2.txt”.
//Оба файла должны находиться в корне проекта. Создаваться файлы должны не вручную, а при запуске программы.
//
//
//Файл 1 должен содержать 1000 случайных чисел от 0 до 100.
//Файл 2 создается на основании Файла 1, но содержит числа вещественного типа данных.
//Метод заполнения Файла 2 следующий: для каждой группы из 20 целых чисел из Файла 1 рассчитывается их среднее
// арифметическое. Затем, полученное значение записывается в Файл 2. Таким образом в Файле 2 будет находиться
// 50 вещественных чисел (1000 / 20 = 50).
//После того, как Файл 2 будет сформирован, необходимо реализовать статический метод printResult(File file).
// Этот метод должен рассчитать сумму всех вещественных чисел из Файла 2 и вывести её в консоль,
// отбросив вещественную часть.
//
//Пример:
//Для простоты, в Файле 1 находится 12 целых чисел, а среднее арифметическое рассчитывается для группы из
// 4 целых чисел.
//
//Файл 1: 3 8 7 5 28 73 4 1 5 32 89 12
//Файл 2: 5.75 26.5 34.5
//Ответ: 66
//
//Комментарии к примеру:
//Среднее арифметическое для четверки 3 8 7 5 равно 5.75
//Таким же образом рассчитаны средние арифметические для остальных четверок из Файла 1.
//Сумма вещественных чисел из Файла 2 равняется 66.75
//Отбросив вещественную часть (числа после запятой) получаем ответ 66.
public class Task2 {
    public static void main(String[] args) {

        Random random = new Random();
        try {
            File file1 = new File("\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\resources\\file1.txt");
            PrintWriter file1pw = new PrintWriter(file1);
            for (int i = 0; i < 1000; i++) {
                file1pw.println(random.nextInt(100));
            }
            file1pw.close();
            File file2 = new File("\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\resources\\file2.txt");
            PrintWriter file2pw = new PrintWriter(file2);
            Scanner scanner = new Scanner(file1);
            int[] value = new int[1000];
            int i =0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                value[i] = Integer.parseInt(line);
                i++;
            }
            int n = 20;
            int c =0;
            for (int j =0;j<50;j++) {
                  int sum = 0;
            for (int k = c; k < n; k++) {
                sum += value[k];

            }
            double srednee = (double) sum/20;
            file2pw.println(srednee);
            c+=20;
            n+=20;
            }
            file2pw.close();
            scanner.close();
             printResult(file2);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void printResult(File file) {

        try {
            int value = 0;
            int d =0;
            Scanner scanner1 = new Scanner(file);
            while (scanner1.hasNextLine()) {
                value += Double.parseDouble(scanner1.nextLine());
                d++;
            }
            System.out.println(value/d);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
