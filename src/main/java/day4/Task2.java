package day4;
//Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
//Затем, используя цикл for each вывести в консоль:
//наибольший элемент массива
//наименьший элемент массива
//количество элементов массива, оканчивающихся на 0
//сумму элементов массива, оканчивающихся на 0
//
//Использовать сортировку запрещено.

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] numders = new int[100];
        int a = 0;
        int b = 10000;
        int c = 0;
        int d = 0;
        Random rand = new Random();
        for (int i:numders ){
            numders[i] = rand.nextInt(10000);
            System.out.print(numders[i] + " ");
            if (a<numders[i]){
                a = numders[i];
            }
            if (b>numders[i]){
                b = numders[i];
            }
            if (numders[i]%10 == 0){
                c++;
                d = d + numders[i];
            }
        }
        System.out.println();
        System.out.println("Наибольший элемент массива: " + a);
        System.out.println("Наименьший элемент массива: " + b);
        System.out.println("Количество элементов оканчивающихся на 0: " + c);
        System.out.println("Сумма элементов оканчивающихся на 0: " + d);

    }
}
