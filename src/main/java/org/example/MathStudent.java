package org.example;

public class MathStudent extends Student{
    public MathStudent (String name, String surname, String Fathersname, String course, int lastExamGrade) {
        super(name,surname,Fathersname,course,lastExamGrade);
    }
    @Override
    public void writeExam() {
        System.out.println("Студент направления ФН пишет экзамен");
    }

    @Override
    public String toString() {
        return "MathStudent{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", Fathersname='" + Fathersname + '\'' +
                ", course='" + course + '\'' +
                ", lastExamGrade=" + lastExamGrade +
                '}';
    }
}
