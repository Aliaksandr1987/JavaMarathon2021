package day12;

import java.util.ArrayList;
import java.util.List;

//Создать список строк, добавить в него 5 марок автомобилей, вывести список в консоль.
// Добавить в середину еще 1 автомобиль, удалить самый первый автомобиль из списка.
// Вывести список в консоль.
public class Task1 {
    public static void main(String[] args) {
        List<String> carModels = new ArrayList<>();
        carModels.add("Lada");
        carModels.add("Audi");
        carModels.add("BMW");
        carModels.add("Mustang");
        carModels.add("Tesla");
        System.out.println(carModels);
        carModels.add(2,"Skoda");
        carModels.remove(0);
        System.out.println(carModels);


    }
}
