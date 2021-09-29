package day7;
// В классе Самолет реализовать статический метод compareAirplanes, который в качестве аргументов
// принимает два объекта класса Airplane (два самолета) и выводит сообщение в консоль о том,
// какой из самолетов длиннее.
public class Task2 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boing",2000,67,75000);
        Airplane airplane2 = new Airplane("Boing",2014,76,89000);
        Airplane.compareAirplanes();

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
        if (length1<length){
            length1 = length;
        }
    }
    private static int length1;
    public static void compareAirplanes(){
        System.out.println("Cамелет с длиной " +length1+ " длинее");
    }
    void fillUp(int n){
        fuel = n;}
    void info(){
        System.out.println("Изготовитель: "+ producer+" год выпуска: "+year+" длина: "+length+" вес: "+weigth+" количество топлива в баке: "+fuel);
    }
}