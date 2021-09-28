package day5;
//Создать класс Мотоцикл (англ. Motorbike) с полями “Модель”, “Цвет”, “Год выпуска”.
// Создать экземпляр класса Мотоцикл, используя конструктор (set методы не использовать).
// Необходимо придерживаться принципов инкапсуляции и использовать ключевое слово this.
// Вывести в консоль значение каждого из полей,используя get методы.

public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("Reno","Blue",2009);
        System.out.println("Марка: "+ motorbike.getMotoModel());
        System.out.println("Цвет: " + motorbike.getMotoColor());
        System.out.println("Год выпуска: " + motorbike.getMotoYear());

    }
}
class Motorbike{
    private final String motoModel;
    private final String motoColor;
    private final int motoYear;
    public Motorbike(String motoModel,String motoColor,int motoYear){
        this.motoModel = motoModel;
        this.motoColor = motoColor;
        this.motoYear = motoYear;
    }
    public String getMotoModel(){
        return motoModel;
    }
    public String getMotoColor(){
        return motoColor;
    }
    public int getMotoYear(){
        return motoYear;
    }
}