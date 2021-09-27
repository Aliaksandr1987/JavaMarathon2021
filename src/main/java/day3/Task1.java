package day3;
// 1. Реализовать программу, которая в консоль выводит название страны, принимая на вход название города.
// Программа должна работать до тех пор, пока не будет введено слово “Stop”.
//Реализовать, используя следующие данные:
//Москва, Владивосток, Ростов - Россия
//Рим, Милан, Турин - Италия
//Ливерпуль, Манчестер, Лондон - Англия
//Берлин, Мюнхен, Кёльн - Германия
//
//При вводе любого другого города, вывести сообщение “Неизвестная страна”.

import java.util.Objects;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введи название города");
        Scanner scanner = new Scanner(System.in);
        String siti = scanner.nextLine();
        String stop = "stop";
        for (int i=0; !siti.equals(stop);i++){

            switch (siti){
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кельн":
                    System.out.println("Германия");
                    break;
                default:
                    System.out.println("Неизвестная страна");
                    break;
            }
        siti = scanner.nextLine();
        }
    }
}
