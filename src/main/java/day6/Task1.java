package day6;
//В классах Автомобиль и Мотоцикл реализуйте два метода:
//void info() - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),
//int yearDifference(int inputYear) - принимает в качестве аргумента целое число (год) и
// возвращает разницу между переданным годом и годом выпуска транспортного средства
// (возвращаться должно всегда положительное число).
//
//В методе main() класса Task1 создайте экземпляр автомобиля или мотоцикла, проверьте работу каждого метода.

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Audi");
        car.setColor("Red");
        car.setYear(2002);
        System.out.println("Марка: " + car.getModel());
        System.out.println("Цвет: " + car.getColor());
        System.out.println("Год производства: " + car.getYear());
        car.info();
        System.out.println(car.yearDifference(2021));
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
    void info (){
        System.out.println("Это автомобиль ");
    }
    int yearDifference (int inputYear){
        int dif = inputYear - year;
        return Math.max(dif, 0);
    }
}