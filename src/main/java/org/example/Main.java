package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IUStudent student1 = new IUStudent("Vika","Tsyganova", "yuriosen", "CS",5);
        IUStudent student2 = new IUStudent("Arina","Ivantsova", "Tinki", "CS",5);
        MathStudent student3 = new MathStudent("Andre","Zimmer", "TapsieSpot", "Mathematics",2);
// Информация об экзаменах
        student1.writeExam();
        student2.writeExam();
        student3.writeExam();
//Информация о студентах
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}