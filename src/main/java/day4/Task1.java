package day4;
// 1. С клавиатуры вводится число n - размер массива. Необходимо создать массив указанного размера и
// заполнить его случайными числами от 0 до 10 (не включительно). Затем вывести содержимое массива в консоль,
// а также вывести в консоль информацию о:
//а) Длине массива
//б) Количестве чисел больше 8
//в) Количестве чисел равных 1
//г) Количестве четных чисел
//д) Количестве нечетных чисел
//е) Сумме всех элементов массива

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("Введие размер массива");
        Scanner scanner = new Scanner(System.in);
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        int sum5 = 0;
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i =0; i<n;i++){
            numbers[i] = (rand.nextInt(9))+1;
            System.out.print(numbers[i] + " ");
            if (numbers[i]>8){
               sum1++;
            }
            if (numbers[i]  == 1){
                sum2++;
            }
            if (numbers[i]%2 == 0){
                sum3++;
            }
            if (!(numbers[i]%2 == 0)){
                sum4++;
            }
            sum5 = sum5 + numbers[i];
        }
        System.out.println();
        System.out.println("Длина массива: " + numbers.length);
        System.out.println("Количество чисел больше 8: " + sum1);
        System.out.println("Количество чисел равных 1: " + sum2);
        System.out.println("Количество четных чисел: " + sum3);
        System.out.println("Количество нечетных чисел: " + sum4);
        System.out.println("Сумма всех элементов массива: " + sum5);
    }
}
