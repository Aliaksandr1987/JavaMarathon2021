package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

//В папке resources находится файл dushi.txt. Этот файл содержит в себе полный текст произведения
// “Мертвые души” Н. В. Гоголя. Вам необходимо прочитать этот файл и, используя структуру данных HashMap,
// подсчитать, сколько раз в этом произведении было использовано каждое слово. После того, как подсчет будет
// произведен, вам необходимо вывести в консоль 100 самых часто используемых слов. Изучите вывод и посмотрите,
// сколько раз в произведении было использовано слово “Чичиков” (фамилия главного героя). Это число выпишите
// в коде в виде комментария (например: // Чичиков - 120).
//Для того, чтобы класс Scanner считывал слова, разделяя текст по знакам препинания, используйте следующий
public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\resources\\dushi.txt");
        Scanner scanner = new Scanner(file);
        scanner.useDelimiter("[.,«»<>:;()?!\"\\s–]+"); // «»<> - этого не хватало
        Map<Integer,String> map = new HashMap<>();
        int i = 0;
        while (scanner.hasNextLine()) {
            map.put(i, scanner.next());       //Чичиков - 607
            i++;
        }
        Map<Integer, String> map1 = new TreeMap<>();
        for (String tm:map.values()) {           // несколько минут обрабатывает эти два цикла
            int count=0;
            for (String tmp : map.values()) {
                if (tm.equals(tmp)) {
                    count++;
                }

            }
            map1.put(count,tm); // далеко не сразу сообразил поместить результаты подсчета в отдельный mар
            }
        int k =0;
        for (Integer key:map1.keySet()){
            if (k < map1.size() - 100){
                k++;
            }
            else {
                System.out.print(map1.get(key)+" ");
                k++;
            }
        }
        System.out.println();
        scanner.close();


    }
}
