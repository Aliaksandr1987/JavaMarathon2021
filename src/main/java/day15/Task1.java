package day15;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\resources\\shoes.csv");

        PrintWriter printWriter = null;
        try {
            PrintWriter missingShoes = new PrintWriter(new BufferedWriter(new FileWriter("\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\resources\\missing_shoes.txt",true)));
            Scanner scanner = new Scanner(file);
            List<String> strings = new ArrayList<>();
            if (file.length()==0){
                throw new MyException();
            }
            int i = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] numbersString = line.split(";");
                if (numbersString.length != 3){
                    throw new MyException2(i);
                }
                if (Integer.parseInt(numbersString[2]) == 0) {
                   missingShoes.println(line);   // Не хочет записывать, не могу понять почему, все остальное работает
                }
                i++;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (MyException e ) {
            System.out.println("Исходный файл пуст");
        }
        catch (MyException2 e) {
            System.out.println("  "); // не дает сделать commit с пустым блоком
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
