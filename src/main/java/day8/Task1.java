package day8;
//  Создать строку, состоящую из чисел от 0 до 20000. Важно понимать, что это одна строка,
//  полученная конкатенацией (“склеиванием”) чисел из диапазона через пробел
//  (0 + “ “ + 1 + “ “ + 2 + … + 20000).
//После создания такой строки, вызов System.out.println() на этой строке должен вывести в консоль
// сразу все числа из диапазона:
//0 1 2 3 4 5 6 7 8 9 10 11 12 … 19995 19996 19997 19998 19999 20000
//
//Для того, чтобы почувствовать разницу в производительности между конкатенацией обычных строк
// (класс String) и использовании StringBuilder, реализуйте описанную задачу этими двумя способами,
// замеряя время работы программы.
public class Task1 {
    public static void main(String[] args) {
        int arrayLength = 20000;
        long startTime = System.currentTimeMillis();
        StringBuilder stringArray = new StringBuilder();
        for (int i = 0;i<=arrayLength;i++){
            stringArray.append(i).append(" ");
        }
        System.out.println(stringArray);
        long stopTime = System.currentTimeMillis();

        long startTime1 = System.currentTimeMillis();
        for (int j = 0;j <= arrayLength;j++){
            System.out.print(j + " ");
        }
        long stopTime1 = System.currentTimeMillis();
        System.out.println();
        System.out.println("Длительность работы, в мс.: " +(stopTime - startTime));
        System.out.println("Длительность работы, в мс.: " +(stopTime1 - startTime1));




    }
}
