package day11.task1;

// Эту задачу не удалось самостоятельно сделать(((

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse,0,false);
        Courier courier = new Courier(warehouse,0,false);
        businessProcess(picker);
        businessProcess(courier);
        System.out.println(warehouse);
        System.out.println(courier);
        System.out.println(picker);

        Warehouse warehouse2 = new Warehouse();
        Picker picker2 = new Picker(warehouse2,0,false);
        Courier courier2 = new Courier(warehouse2,0,false);
        businessProcess(picker2);
        businessProcess(courier2);
        System.out.println(warehouse2);
        System.out.println(courier2);
        System.out.println(picker2);
    }
    public static void businessProcess(Worker worker){
        for (int i =0;i<10000;i++){
            worker.doWork();
        }
        worker.bonus();
    }
}
class Warehouse implements Worker{
    private int countPickedOrders =0;
    private int countDeliveredOrders =0;
    public void setCountPickedOrders(int countPickedOrders) {
        this.countPickedOrders = countPickedOrders;
    }
    public void setCountDeliveredOrders(int countDeliveredOrders) {
        this.countDeliveredOrders = countDeliveredOrders;
    }
    @Override
    public String toString() {
        return "Warehouse{" +
                "countPickedOrders=" + countPickedOrders +
                ", countDeliveredOrders=" + countDeliveredOrders +
                '}';}
    public int getCountPickedOrders() {
        return countPickedOrders;}

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;}

    public void sumPickedOrders(){
        countPickedOrders++;
    }
    public void sumDeliveredOrders(){
        countDeliveredOrders++;
    }
    @Override
    public void doWork() {

    }
    @Override
    public void bonus() {

    }
}
class Picker implements Worker{
    private int salary;
    private boolean isPayed;
    private Warehouse wh;

    public Picker(Warehouse wh, int salary, boolean isPayed) {
        this.salary = salary;
        this.isPayed = isPayed;
        this.wh = wh;
    }
    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';}
    public int getSalary() {
        return salary;}
    public boolean isPayed() {
        return isPayed;}

    @Override
    public void doWork() {
        salary += 80;
        wh.sumPickedOrders();
      }

    @Override
    public void bonus() {
        if (wh.getCountPickedOrders() < 10000){
            System.out.println("Бонус пока не доступен");
        return;}
        if (isPayed){
            System.out.println("Бонус уже был выплачен");
        return;}
        salary+=70000;
        isPayed = true;
    }
}
class Courier implements Worker{

    private int salary;
    private boolean isPayed;
    private Warehouse wh;

    public Courier(Warehouse wh,int salary, boolean isPayed) {
        this.salary = salary;
        this.isPayed = isPayed;
        this.wh = wh;
    }
    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';}
    public int getSalary() {
        return salary;}
    public boolean isPayed() {
        return isPayed;}

    @Override
    public void doWork() {
        salary+=100;
        wh.sumDeliveredOrders();
    }

    @Override
    public void bonus() {
        if (wh.getCountDeliveredOrders() < 10000){
            System.out.println("Бонус пока не доступен");
            return;}
        if (isPayed){
            System.out.println("Бонус уже был выплачен");
            return;}
        salary+=50000;
        isPayed = true;
    }
}

interface Worker {
    void doWork();
    void bonus();
}
