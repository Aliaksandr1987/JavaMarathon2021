package day19;
//В папке resources находится файл numbers19.txt. Этот файл содержит в себе 500.000 случайных целых чисел
// от 1 до миллиарда (каждое число находится на новой строке). Вам необходимо прочитать этот файл и,
// используя структуру данных HashSet, подсчитать, сколько чисел из файла лежат в диапазоне
// от 500.000.000 до 600.000.000 включительно. Количество таких чисел необходимо вывести в консоль.
// Вы можете попробовать решить эту задачу с помощью ArrayList’а и убедиться, что с помощью этой
// структуры данных задача не решается за разумное время. Поэтому, необходимо использовать
// структуру данных HashSet, которая позволяет мгновенно проверять наличие конкретного элемента
// внутри себя благодаря процедуре хэширования (см. урок про устройство HashMap).

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\resources\\numbers19.txt");
        long startTime = System.currentTimeMillis();
        Scanner scanner = new Scanner(file);
        Set<Integer> setNumbers = new HashSet<>();
        while (scanner.hasNextLine()){
            setNumbers.add(Integer.parseInt(scanner.nextLine()));
        }
        int count = 0;
        for (Integer temp:setNumbers){
            if (temp> 500000000 && temp<=600000000){
                count++;
            }
        }
        System.out.println(count); //50071
        scanner.close();

        long stopTime = System.currentTimeMillis();
        System.out.println("HashMap time: " + (stopTime-startTime)); // 1477 ms

        long startTime1 = System.currentTimeMillis();
        Scanner scanner1 = new Scanner(file);
        List<Integer> num = new ArrayList<>();
        while (scanner1.hasNextLine()){
            num.add(Integer.parseInt(scanner1.nextLine()));
        }
        int r =0;
        for (Integer xz:num){
            if (xz> 500000000 && xz<=600000000){
                r++;
            }
        }
        System.out.println(r); // 50079 не совпадает почему-то с результатом полученным выше.
        long stopTime1 = System.currentTimeMillis();
        System.out.println("ArrayList time: "+(stopTime1-startTime1)); // 613 ms Что то я начудил, наверное
        scanner1.close();

    }
}
