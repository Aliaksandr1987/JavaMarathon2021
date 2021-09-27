package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите х");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        if (x >= 5){
            double y = (x*x - 10)/(x + 7);
            System.out.println("Результат: " + y);
        }
        else if (x >-3){
            double y = (x + 3)*(x*x - 2);
            System.out.println("Результат: " + y);
            }
        else {
            System.out.println("Результат: " + 420);
        }
        }

    }
