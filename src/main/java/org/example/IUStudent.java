package org.example;

public class IUStudent extends Student{
    public IUStudent (String name, String surname, String Fathersname, String course, int lastExamGrade) {
        super(name,surname,Fathersname,course,lastExamGrade);
    }

    @Override
    public void writeExam() {
        System.out.println("Студент направления ИУ пишет экзамен");
    }

    @Override
    public String toString() {
        return "IUStudent{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", Fathersname='" + Fathersname + '\'' +
                ", course='" + course + '\'' +
                ", lastExamGrade=" + lastExamGrade +
                '}';
    }
}
