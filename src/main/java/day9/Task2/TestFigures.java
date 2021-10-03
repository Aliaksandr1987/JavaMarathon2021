package day9.Task2;

import java.util.Objects;

// Создайте абстрактный класс Фигура (англ. Figure). Этот класс будет являться абстрактным представлением
// геометрической фигуры в нашей программе.
//У всех фигур в нашей программе есть цвет, поэтому в классе Фигура есть строковое поле color.
// Создайте конструктор и геттер для этого поля.
//У класса Фигура определены два абстрактных метода:
//public abstract double area();
//public abstract double perimeter();
//Реализация первого метода должна возвращать площадь фигуры, а реализация второго метода должна возвращать
// периметр фигуры.
//Создайте 3 геометрические фигуры: Круг (англ. Circle), Прямоугольник (англ. Rectangle) и Треугольник
// (англ. Triangle). Каждая из фигур должна наследоваться от абстрактного класса Фигура (англ. Figure).
//У класса Круг будет одно поле - радиус окружности.
//У класса Прямоугольник будет два поля - ширина и высота.
//У класса Треугольник будет три поля - длина каждой из сторон.
//Для каждого из этих трех классов необходимо реализовать конструктор, который принимает на вход размерности
// фигуры и цвет фигуры.
//В этих же классах, вам необходимо реализовать два метода (area() и perimeter()). Реализация этих методов
// будет разной для каждой из геометрических фигур. Формулы для вычисления площади и периметра легко
// находятся в интернете.
//После того, как геометрические фигуры будут полностью реализованы, вам необходимо будет реализовать
// еще один класс - TestFigures. В этом классе, в методе main() должны быть созданы и помещены в
// массив следующие геометрические фигуры:
//Figure[] figures = {
//        new Triangle(10, 10, 10, "Red"),
//        new Triangle(10, 20, 30, "Green"),
//        new Triangle(10, 20, 15, "Red"),
//        new Rectangle(5, 10, "Red"),
//        new Rectangle(40, 15, "Orange"),
//        new Circle(4, "Red"),
//        new Circle(10, "Red"),
//        new Circle(5, "Blue")
//};
//
//В этом же классе реализуйте два метода:
//public static double calculateRedPerimeter(Figure[] figures)
//public static double calculateRedArea(Figure[] figures)
//
//Первый метод, принимая на вход массив геометрических фигур, должен вернуть сумму периметров
// красных фигур. Второй метод, принимая на вход массив геометрических фигур, должен вернуть сумму площадей
// красных фигур.
//Вызовите эти два метода на массиве figures и выведите результат в консоль.
//
//* В java есть константа Math.PI, используйте ее, вместо ручного ввода 3,14
public class TestFigures {
    public static void main(String[] args) {

        Figure[] figures = {
        new Triangle(10, 10, 10, "Red"),
        new Triangle(10, 20, 30, "Green"),
        new Triangle(10, 20, 15, "Red"),
        new Recktankle(5, 10, "Red"),
        new Recktankle(40, 15, "Orange"),
        new Circle(4, "Red"),
        new Circle(10, "Red"),
        new Circle(5, "Blue")};
        System.out.println(calculateRedArea(figures));
        System.out.println(calculateRedPerimeter(figures));
    }

    public static double calculateRedPerimeter(Figure[] figures){
        double calculateRedPerim =0;
       for (Figure figure:figures){
           if (figure.getColor().equals("Red")){
               calculateRedPerim += figure.perimeter();
           }
       }
       return calculateRedPerim;
    }
    public static double calculateRedArea(Figure[] figures){
        double calculateRedArea=0;
        for (Figure figure:figures){
            if (figure.getColor().equals("Red")){
                calculateRedArea += figure.area();
            }
        }
        return calculateRedArea;
    }
}
abstract class Figure {
    private String color;
    public Figure(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public abstract double area();

    public abstract double perimeter();
}

class Circle extends Figure {
    private double radius;
    Circle( double radius, String color) {
        super(color);
        this.radius = radius;

    }
    @Override
    public double area(){
        return Math.PI*radius*radius;}

    @Override
    public double perimeter() {
        return  2*Math.PI*radius;}
}

class Recktankle extends Figure {
    private double length; private double width;
    Recktankle(double length, double width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length*width;
    }

    @Override
    public double perimeter() {
        return  (length+width)*2;
    }
}
class Triangle extends Figure {
    private double lengthBase; private double height; private double diagonal;
    Triangle(double lengthBase, double height, double diagonal, String color) {
        super(color);
        this.diagonal = diagonal;
        this.height = height;
        this.lengthBase = lengthBase;
    }
    @Override
    public double area() {
        return  (lengthBase*height)/2;
    }

    @Override
    public double perimeter() {
        return lengthBase+height+diagonal;
    }
}