package day15;

public class MyException2 extends Exception {

    public MyException2(int i) {
        System.out.println("кол-во столбцов отличаться от трех в строке:  " +(i+1));
    }
}
