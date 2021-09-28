package day5;
//Создать класс Автомобиль (англ. Car) с полями “Модель”, “Цвет”, “Год выпуска”.
// Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль.
// Задать значение для каждого поля, используя set методы. Вывести в консоль значение каждого из полей,
// используя get методы.
//Созданный вами класс должен отвечать принципам инкапсуляции.

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Audi");
        car.setColor("Red");
        car.setYear(2002);
        System.out.println("Марка: " + car.getModel());
        System.out.println("Цвет: " + car.getColor());
        System.out.println("Год производства: " + car.getYear());
    }
}
class Car{
    private String model;
    private String color;
    private int year;
    public void setModel(String carModel){
        model = carModel;}
    public void setColor(String carColor){
        color = carColor;}
    public void setYear(int carYear){
        year = carYear;}
    public String getModel(){
        return model;}
    public String getColor(){
        return color;}
    public int getYear(){
        return year;}
    }
