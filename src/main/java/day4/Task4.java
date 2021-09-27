package day4;
//Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
//Найти максимум среди сумм трех соседних элементов. Для найденной тройки с максимальной суммой
// выведите значение суммы и индекс первого элемента тройки.

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[100];
        int a = 0;
        int b = 0;

        for (int i =0;i<numbers.length;i++){
            numbers[i] = rand.nextInt(10000);
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        for (int i =0;i<97;i++){
            int sum;
            sum = numbers[i]+numbers[i+1]+numbers[i+2];
            if (a<sum){
                a = sum;
                b = i;
            }

        }


        System.out.println();
        System.out.println(a);
        System.out.println(b);



    }
}
