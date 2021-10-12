package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Скопировать MusicBand из прошлого задания и доработать таким образом, чтобы в группу можно было
// добавлять и удалять участников. Под участником понимается строка (String) с именем и фамилией.
// Реализовать статический метод слияния групп (в классе MusicBand), т.е. все участники группы А
// переходят в группу B. Название метода: transferMembers. Этот метод принимает в качестве аргументов
// два экземпляра класса MusicBand. В классе MusicBand, реализовать метод printMembers(), печатающий
// список участников в консоль и метод getMembers(), возвращающий список участников.
//Проверить состав групп после слияния.
public class Task4 {
    public static void main(String[] args) {
        List<BandNamber> bandNambersMaroon5 = new ArrayList<>(Arrays.asList(new BandNamber("Adam","Levine"), new BandNamber("Jesse","Carmichael "),
                new BandNamber("James ","Valentine "),new BandNamber("Matt ","Flynn" ),
                new BandNamber("Sam ","Farrar ")));
        List<BandNamber> bandNambersRammstein = new ArrayList<>(Arrays.asList(new BandNamber("Till",
                "Lindemann"), new BandNamber("Richard","Kruspe "),new BandNamber("Paul",
                "Landers "),new BandNamber("Oliver","Riedel "),new BandNamber("Christoph",
                "Schneider")));
        MusicBand Maroon5 = new MusicBand("Maroon 5",1994, bandNambersMaroon5);
        MusicBand Rammstein = new MusicBand("Rammstein",1994,bandNambersRammstein);
        MusicBand.transferMembers(Maroon5,Rammstein);
        Rammstein.printMembers();
        Maroon5.printMembers();





    }
}
class MusicBand{
    private String bandName;
    private int year;
    private List<BandNamber> bandNambers;
    public String getBandName() {
        return bandName;}
    public int getYear() {
        return year;}
    public List<BandNamber> getBandNambers() {
        return bandNambers;}

    public MusicBand(String bandName, int year, List<BandNamber> bandNambers) {
        this.bandName = bandName;
        this.year = year;
        this.bandNambers = bandNambers;
    }
    public static void transferMembers(MusicBand band1, MusicBand band2){
        for (BandNamber bandNamber: band1.getBandNambers()){
            band2.getBandNambers().add(bandNamber);
        }
        band1.getBandNambers().clear();
        }
    public void  printMembers(){
        System.out.println(this.bandNambers);
    }
}

class BandNamber{
    private String name;
    private String surname;
    @Override
    public String toString() {
        return "BandNamber{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
    public BandNamber(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public String getName() {
        return name;}
    public String getSurname() {
        return surname;}
}