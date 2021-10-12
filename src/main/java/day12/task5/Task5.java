package day12.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Скопировать MusicBand из прошлого задания и доработать - теперь у участника музыкальной группы
// есть не только имя, но и возраст. Соответственно, теперь под участником понимается не строка,
// а объект класса MusicArtist. Необходимо реализовать класс MusicArtist и доработать класс MusicBand
// (создать копию класса) таким образом, чтобы участники были - объекты класса MusicArtist. После этого,
// надо сделать то же самое, что и требовалось в 4 задании - слить две группы и проверить состав групп после
// слияния. Методы для слияния и для вывода участников в консоль необходимо тоже переработать,
// чтобы они работали с объектами класса MusicArtist.
public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> musicArtistsMaroon5 = new ArrayList<>(Arrays.asList(new MusicArtist("Adam","Levine",34), new MusicArtist("Jesse","Carmichael ",23),
                new MusicArtist("James ","Valentine ",34),new MusicArtist("Matt ","Flynn",42 ),
                new MusicArtist("Sam ","Farrar ",27)));
        List<MusicArtist> musicArtistsRammstein = new ArrayList<>(Arrays.asList(new MusicArtist("Till",
                "Lindemann",56), new MusicArtist("Richard","Kruspe ",55),new MusicArtist("Paul",
                "Landers ",61),new MusicArtist("Oliver","Riedel ",59),new MusicArtist("Christoph",
                "Schneider",62)));
        MusicBand Maroon5 = new MusicBand("Maroon 5",1994, musicArtistsMaroon5);
        MusicBand Rammstein = new MusicBand("Rammstein",1994,musicArtistsRammstein);
        MusicBand.transferMembers(Maroon5,Rammstein);
        Rammstein.printMembers();
        Maroon5.printMembers();

    }
}
class MusicBand{
    private String bandName;
    private int year;
    private List<MusicArtist> musicArtists;
    public String getBandName() {
        return bandName;
    }
    public int getYear() {
        return year;
    }
    public List<MusicArtist> getMusicArtists() {
        return musicArtists;
    }
    public MusicBand(String bandName, int year, List<MusicArtist> musicArtists) {
        this.bandName = bandName;
        this.year = year;
        this.musicArtists = musicArtists;
    }
    public static void transferMembers(MusicBand band1, MusicBand band2){
        for (MusicArtist musicArtist: band1.getMusicArtists()){
            band2.getMusicArtists().add(musicArtist);
        }
        band1.getMusicArtists().clear();
    }
    public void  printMembers(){
        System.out.println(this.musicArtists);
    }

}

class MusicArtist{
    private String name;
    private String surname;
    private int age;
    @Override
    public String toString() {
        return "MusicArtist{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public MusicArtist(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
}