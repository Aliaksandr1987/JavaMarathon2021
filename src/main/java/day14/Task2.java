package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class Task2 {
    public static void main(String[] args) {
        File file = new File("\\Users\\User\\Desktop\\people.txt");
        System.out.println(parseFileToStringList(file));

    }
    public static List<String> parseFileToStringList(File file){
        try {
            Scanner scanner = new Scanner(file);

            List<String> strings = new ArrayList<>();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                strings.add(line);
                String[] numbersString = line.split(" ");

                if (Integer.parseInt(numbersString[1]) < 0) {
                    throw new IllegalArgumentException();
                }
            }
            return strings;
        }
        catch (FileNotFoundException e) {
            System.out.println("Файл не найден");}
        catch (IllegalArgumentException e){
            System.out.println("Некорректный входной файл");
        }
    return null;

    }
}
