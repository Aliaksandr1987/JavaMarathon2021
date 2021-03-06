package day7;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random rand = new Random();
        Player player1 = new Player((rand.nextInt(11)+90));
        Player player2 = new Player((rand.nextInt(11)+90));
        Player player3 = new Player((rand.nextInt(11)+90));
        Player player4 = new Player((rand.nextInt(11)+90));
        Player player5 = new Player((rand.nextInt(11)+90));
        Player player6 = new Player((rand.nextInt(11)+90));
        int i = 0;
        while (i<95){
            player1.run(player1);
            i++;}
        player1.info();
        System.out.println("Количество играков на поле "+Player.getCountPlayes());
    }
}
class Player{
    int countTeam = 6;
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    public static int stamina;

    public Player(int stamina){
        Player.stamina = stamina;
        if(countPlayes<countTeam){
        countPlayes++;}
    }
    static int countPlayes;
    public static int getCountPlayes() {
        return countPlayes;}
    public int getStamina() {
        return stamina;}
    void run(Player player){
        stamina -= 1;
        if (stamina == MIN_STAMINA){
            countPlayes = countPlayes -1;
        }

    }
    void info(){

        switch (countPlayes){
            case 0:
            case 1:
                System.out.println("Команды неполные. На поле еще есть " + (countTeam-countPlayes)+" свободных мест");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("Команды неполные. На поле еще есть " + (countTeam-countPlayes)+" свободных места");
                break;
            case 5:
                System.out.println("Команды неполные. На поле еще есть " + (countTeam-countPlayes)+" свободное место");
                break;
            default:
                System.out.println("На поле нет свободных мест");
                break;
        }
    }
}