package day12.task3;
//Создать класс Музыкальная Группа (англ. MusicBand) с полями name и year (название музыкальной группы
// и год основания). Создать 10 или более экземпляров класса MusicBand , добавить их в список
// (выбирайте такие музыкальные группы, которые были созданы как до 2000 года, так и после, жанр не важен).
// Перемешать список. Создать статический метод в классе Task3:
//public static List<MusicBand> groupsAfter2000(List<MusicBand> bands)
//Этот метод принимает список групп в качестве аргумента и возвращает новый список, состоящий из групп,
// основанных после 2000 года. Вызвать метод groupsAfter2000(List<MusicBand> bands) в методе main()
// на вашем списке из 10 групп. Вывести в консоль оба списка (оригинальный и с группами,
// основанными после 2000 года).

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand Incubus  = new MusicBand("Incubus",2003 );
        MusicBand Epica = new MusicBand("Epica",2003);
        MusicBand JMORC = new MusicBand("J:МОРС",1999);
        MusicBand LittleBig = new MusicBand("Little Big",2013);
        MusicBand Maroon = new MusicBand("Maroon 5",1994);
        MusicBand StreetDogs = new MusicBand("Street Dogs",2002);
        MusicBand Sistar = new MusicBand("Sistar",2010);
        MusicBand TacoyakiRainbow = new MusicBand("Tacoyaki Rainbow",2012);
        MusicBand SDN48 = new MusicBand("SDN48",2009);
        MusicBand TamerlanAlena = new MusicBand("TamerlanAlena",2009);

        List<MusicBand> bands = new ArrayList<>();
        bands.add(Incubus);
        bands.add(Epica);
        bands.add(JMORC);
        bands.add(LittleBig);
        bands.add(Maroon);
        bands.add(StreetDogs);
        bands.add(Sistar);
        bands.add(TacoyakiRainbow);
        bands.add(SDN48);
        bands.add(TamerlanAlena);

        Collections.shuffle(bands);
        System.out.println(bands);
        System.out.println(groupsAfter2000(bands));

    }
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> groupsAfter2000 = new ArrayList<>();
        for (MusicBand band:bands){
            if (band.getYear()>2000){
                groupsAfter2000.add(band);
            }
        }
        return groupsAfter2000;

    }
}
class MusicBand{
    private String name;
    private int year;



    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    public int getYear() {
        return year;
    }
    public String getName() {
        return name;
    }
}