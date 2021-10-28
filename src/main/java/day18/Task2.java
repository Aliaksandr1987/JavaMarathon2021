package day18;

import java.util.Scanner;

// Создайте рекурсивный метод, который принимает на вход единственный аргумент - число, и возвращает
// количество цифр 7 в этом числе. Циклы использовать запрещено, можно использовать только рекурсивные вызовы.
public class Task2 {
    public static void main(String[] args) {
        System.out.println(count7(77771877));

    }
    public static int count7(int number){
        StringBuilder s = new StringBuilder();
        if(number <= 0)
            return 0;
        else
            s.insert(0,number%10);
            if (s.toString().equals("7"))
                 return count7(number / 10)+1;
            else
                 return count7(number / 10);

    }
}
