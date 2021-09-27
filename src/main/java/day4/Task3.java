package day4;
//Заполнить двумерный массив (матрицу) случайными числами от 0 до 50.
// Размер матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность по колонкам).
// В консоль вывести индекс строки, сумма чисел в которой максимальна. Если таких строк несколько,
// вывести индекс последней из них.

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int b = 0;
        int c = 0;

        int[][] numbers = new int[12][8];
        for (int i =0;i<numbers.length;i++){
            int sum = 0;
            for (int j = 0; j<numbers[i].length;j++){
                numbers[i][j] = rand.nextInt(50);
                System.out.print(numbers[i][j] + " ");
                sum = sum + numbers[i][j];
            }
            if (sum>=b){
                b = sum;
                c = i;

            }
            System.out.println();
        }
        System.out.println();
        System.out.println(b);
        System.out.println(c);


    }
}
