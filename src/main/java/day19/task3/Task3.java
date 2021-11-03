package day19.task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\resources\\taxi_cars.txt");
        Scanner scanner = new Scanner(file);
        Map<Integer,Point> map = new HashMap<>();

        int[] idxy = new int[3];
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");
            int counter = 0;
            for (String number : numbersString) {
                idxy[counter++] = Integer.parseInt(number);
            }
            Point point = new Point(idxy[1],idxy[2]);
            map.put(idxy[0],point);
        }
        scanner.close();
        System.out.println("Введите координаты квадрата  (x1, y1, x2, y2):");
        System.out.print("x1: ");
        Scanner scanner1 = new Scanner(System.in);
        int x1 = scanner1.nextInt();
        System.out.print("y1: ");
        Scanner scanner2 = new Scanner(System.in);
        int y1 = scanner2.nextInt();
        System.out.print("x2: ");
        Scanner scanner3 = new Scanner(System.in);
        int x2 = scanner3.nextInt();
        System.out.print("y2: ");
        Scanner scanner4 = new Scanner(System.in);
        int y2 = scanner4.nextInt();
        int count =  0;
        for (Map.Entry<Integer,Point> entry:map.entrySet()){
            if (entry.getValue().getX()>x2 && entry.getValue().getY()>y2 && entry.getValue().getX()<x1 && entry.getValue().getY()<y1){
                System.out.println(entry);
                count++;
            }
        }
        System.out.println(count);

    }
}

