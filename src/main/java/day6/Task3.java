package day6;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Bob","Histori");
        Student student = new Student("Tom");
        teacher.evaluate(student.name);
    }
}
class Teacher{
    String teacherName;
    String subject;
    public Teacher(String teacherName,String subject){
        this.teacherName = teacherName;
        this.subject = subject;
    }
    Random rand = new Random();
    void  evaluate(String name){
       int n = (rand.nextInt(4)+2);
       String rating = "";
       switch (n){
           case 2:
               rating = " неудолетворительно ";
               break;
           case 3:
               rating = " удолетварительно ";
               break;
           case 4:
               rating = " хорошо ";
               break;
           case 5:
               rating = " отлично ";
               break;
       }
        System.out.println("Преподаватель " + teacherName + " оценил студента с именем "  + name +  " по предмету " + subject + " на оценку " + rating);
    }
}
class Student{
    String name;
    public Student(String studentName){
        name = studentName;}
    }


