package day7;
//Для игры в футбол во дворе требуется 6 человек (3х3). Класс Игрок (англ. Player) содержит следующие поля:
//Поле “выносливость” (англ. stamina), разное для каждого экземпляра, инициализируется через конструктор.
//Константы “максимальная выносливость” (англ. MAX_STAMINA) со значением 100 и “минимальная выносливость”
// (англ. MIN_STAMINA) со значением 0, единые для всех экземпляров.
//Статическое поле countPlayers, которое считает количество игроков на футбольном поле (изначально их 0,
// выходом на поле считается создание экземпляра класса, уходом - когда игрок устал).
//Геттеры для полей “выносливость” и “количество игроков”.
//
//и следующие методы:
//run() - игрок бежит при вызове этого метода. Этот метод уменьшает выносливость игрока на 1 при однократном
// вызове. Когда выносливость достигает 0, игроку нужен отдых и он уходит с поля.
//info() -  выводит сообщение в зависимости от количества игроков на поле. Если игроков меньше 6,
// то выводит сообщение: “Команды неполные. На поле еще есть ... свободных мест”, иначе: “На поле нет свободных
// мест”. Грамматикой русского языка пренебречь, т.е. фраза “еще есть 1 свободных мест” допустима.
//
//Задание: Создать класс Player по вышеописанному шаблону. В методе main() создать объект класса Random,
// который будет генерировать случайные числа. Создать 6 игроков, передавая им в качестве аргумента в
// конструктор случайно сгенерированные числа от 90 до 100. Вызвать метод info(). При попытке создать 7,8 … n
// игрока, количество игроков на поле меняться не должно, проверить это.
//Примените к одному игроку метод run(), пока он полностью не выдохнется (отрицательное значение выносливости
// не допускается). Вывести количество игроков на поле.
//
//*По желанию: доработать метод info() так, чтобы при выводе в консоль грамматика русского языка учитывалась.

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