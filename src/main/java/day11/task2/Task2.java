package day11.task2;
//
public class Task2 {
    public static void main(String[] args) {
        Warrior warrior= new Warrior();
        Paladin paladin = new Paladin();
        Magician magician = new Magician();
        Shaman shaman = new Shaman();
        warrior.physicalAttack(paladin);
        System.out.println(paladin);
        paladin.physicalAttack(magician);
        System.out.println(magician);
        shaman.healTeammate(magician);
        System.out.println(magician);
        magician.magicalAttack(paladin);
        System.out.println(paladin);
        shaman.physicalAttack(warrior);
        System.out.println(warrior);
        paladin.healHimself();
        System.out.println(paladin);
        for (int i=0;i<5;i++){
            warrior.physicalAttack(magician);
            System.out.println(magician);
        }

    }
}

class Warrior extends Hero implements physAttak {
    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health + '}';
    }
    public Warrior() {
        health = 100;
        physDef = 80;
        magicDef=0;
        physAtt=30;
    }
    @Override
    public void physicalAttack(Hero hero) {
        if (hero.physDef>0 && hero.health>MIN_HEALSE){
        hero.health = hero.health - (this.physAtt - (hero.physDef/100)*this.physAtt);
        if(hero.health < MIN_HEALSE)
            {hero.health = MIN_HEALSE;}}
        if(hero.physDef == 0 && hero.health>MIN_HEALSE) {
            hero.health-=this.physAtt;
        if(hero.health < MIN_HEALSE)
        {hero.health = MIN_HEALSE;}}
    }
}

class Paladin extends Hero implements physAttak,healer{
    public Paladin() {
        health = 100;
        physDef = 50;
        magicDef = 20;
        physAtt = 15;
    }
    @Override
    public void healHimself() {
        if(this.health<MAX_HEALSE){
            this.health+=25;
            if (this.health>MAX_HEALSE)
            {this.health=MAX_HEALSE;}}
    }

    @Override
    public void healTeammate(Hero hero) {
        if(hero.health<MAX_HEALSE){
            hero.health+=10;
            if (hero.health>MAX_HEALSE)
            {hero.health=MAX_HEALSE;}}
    }

    @Override
    public void physicalAttack(Hero hero) {
        if (hero.physDef>0 && hero.health>MIN_HEALSE){
            hero.health = hero.health - (this.physAtt - (hero.physDef/100)*this.physAtt);
            if(hero.health < MIN_HEALSE)
            {hero.health = MIN_HEALSE;}}
        if(hero.physDef == 0 && hero.health>MIN_HEALSE) {
            hero.health-=this.physAtt;
            if(hero.health < MIN_HEALSE)
            {hero.health = MIN_HEALSE;}}
    }
    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health + '}';
    }
}

class Magician extends Hero implements magicalAttak,physAttak{
    public Magician() {
        health = 100;
        physDef = 0;
        magicDef = 80;
        physAtt = 5;
        magicAtt = 20;
    }
    @Override
    public void physicalAttack(Hero hero) {
        if (hero.physDef>0 && hero.health>MIN_HEALSE){
            hero.health = hero.health - (this.physAtt - (hero.physDef/100)*this.physAtt);
            if(hero.health < MIN_HEALSE)
            {hero.health = MIN_HEALSE;}}
        if(hero.physDef == 0 && hero.health>MIN_HEALSE) {
            hero.health-=this.physAtt;
            if(hero.health < MIN_HEALSE)
            {hero.health = MIN_HEALSE;}}
    }

    @Override
    public void magicalAttack(Hero hero) {
        if (hero.magicDef>0 && hero.health>MIN_HEALSE){
            hero.health = hero.health - (this.magicAtt - (hero.magicDef/100)*this.magicAtt);
            if(hero.health < MIN_HEALSE)
            {hero.health = MIN_HEALSE;}}
        else if(hero.magicDef == 0 && hero.health>MIN_HEALSE) {
            hero.health-=this.magicAtt;
        if(hero.health < MIN_HEALSE)
        {hero.health = MIN_HEALSE;}}
    }
    @Override
    public String toString() {
        return "Magikan{" +
                "health=" + health + '}';
    }
}
class Shaman extends Hero implements magicalAttak,physAttak,healer{
    public Shaman() {
        health = 100;
        physDef = 20;
        magicDef = 20;
        physAtt = 10;
        magicAtt = 15;
    }
    @Override
    public void healHimself() {
        if(this.health<MAX_HEALSE){
            this.health+=50;
                if (this.health>MAX_HEALSE)
                 {this.health=MAX_HEALSE;}}
    }

    @Override
    public void healTeammate(Hero hero) {
        if(hero.health<MAX_HEALSE){
            hero.health+=30;
                if (hero.health>MAX_HEALSE)
                 {hero.health=MAX_HEALSE;}}
    }

    @Override
    public void physicalAttack(Hero hero) {
        if (hero.physDef>0 && hero.health>MIN_HEALSE){
            hero.health = hero.health - (this.physAtt - (hero.physDef/100)*this.physAtt);
            if(hero.health < MIN_HEALSE)
            {hero.health = MIN_HEALSE;}}
        if(hero.physDef == 0 && hero.health>MIN_HEALSE) {
            hero.health-=this.physAtt;
            if(hero.health < MIN_HEALSE)
            {hero.health = MIN_HEALSE;}}
    }

    @Override
    public void magicalAttack(Hero hero) {
        if (hero.magicDef>0 && hero.health>MIN_HEALSE){
            hero.health = hero.health - (this.magicAtt - (hero.magicDef/100)*this.magicAtt);
            if(hero.health < MIN_HEALSE)
            {hero.health = MIN_HEALSE;}}
        else if(hero.magicDef == 0 && hero.health>MIN_HEALSE) {
            hero.health-=this.magicAtt;
            if(hero.health < MIN_HEALSE)
            {hero.health = MIN_HEALSE;}}
    }
    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health + '}';
    }
}
abstract class Hero {
    public double health;
    public double physDef;
    public double magicDef;
    public double physAtt;
    public double magicAtt;
    public static final int MAX_HEALSE = 100;
    public static final int MIN_HEALSE = 0;}
    interface healer{
        void healHimself();
        void healTeammate(Hero hero);
    }
    interface physAttak{
        void physicalAttack(Hero hero);
    }
    interface magicalAttak{
        void magicalAttack(Hero hero);
    }

