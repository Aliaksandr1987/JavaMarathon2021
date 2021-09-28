package day6;
// Создать класс Самолет (Airplane) с полями:
//producer (изготовитель)
//year (год выпуска)
//length (длина)
//weight (вес)
//fuel (количество топлива в баке)
//Для всех полей должны быть реализованы сеттеры, а для поля fuel еще и геттер.
//Создать конструктор в классе Самолет, принимающий в качестве аргументов значения четырех полей класса
// (значение поля “количество топлива в баке” установить равным 0). В конструкторе для передачи полям значений
// использовать ключевое слово this. Помимо этого, в классе необходимо реализовать метод info(),
// который выводит сообщение в следующем формате:
//“Изготовитель: … , год выпуска: … , длина: ..., вес: ..., количество топлива в баке: …”
//Также, необходимо реализовать метод fillUp(int n), который в качестве аргумента принимает число и
// заправляет топливный бак самолета на это значение.
//Создать новый объект класса Самолет с произвольными данными.
//Изменить год выпуска и длину с помощью сеттеров, вызвать метод fillUp(int n) два раза,
// передав разные значения. Вызвать метод info().
public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boing",2000,67,75000);
        airplane.fillUp(8766);
        airplane.fillUp(5654);
        changeYear(airplane);
        changeLength(airplane);
        airplane.info();
    }
    static void changeYear(Airplane year){
        year.setYear(1987);
    }
    static void changeLength(Airplane length){
        length.setLength(99);
    }
}
class Airplane{
    private String producer;
    private int year;
    private int length;
    private int weigth;
    private int fuel;
    public void setProducer(String aProducer){
        producer = aProducer;}
    public void setYear(int aYear){
        year = aYear;}
    public void setLength(int aLength){
        length = aLength;}
    public void setWeigth(int aWeigth){
        weigth = aWeigth;}
    public void setFuel(int aFuel){
        fuel = aFuel;}
    public int getFuel() {
        return fuel;}
    public Airplane(String producer,int year,int length,int weigth){
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weigth = weigth;
    }
    void fillUp(int n){
        fuel = n;}
    void info(){
        System.out.println("Изготовитель: "+ producer+" год выпуска: "+year+" длина: "+length+" вес: "+weigth+" количество топлива в баке: "+fuel);
    }
}