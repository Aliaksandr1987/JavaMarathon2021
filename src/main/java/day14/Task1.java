package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("\\Users\\User\\Desktop\\test14.txt"); // не видит файл созданный в папке проекта
        printSumDigits(file);
    }

    public static void printSumDigits(File file){
        try {
            Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");
        int[] numbers = new int[numbersString.length];
        int counter = 0;
        for (String number : numbersString) {
            numbers[counter++] = Integer.parseInt(number);
        }
        if (numbersString.length != 10){
            throw new IllegalArgumentException("Некорректный входной файл");
        }
        int sum =0;
        for ( int intNumber:numbers){
            sum+=intNumber;
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(sum);

        scanner.close();}
        catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }
}

