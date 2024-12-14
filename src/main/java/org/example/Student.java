package org.example;

public abstract class Student {
    protected String name;
    protected String surname;
    protected String Fathersname;
    protected String course;
    protected int lastExamGrade;

    public Student(String name, String surname, String Fathersname, String course, int lastExamGrade) {
        this.name = name;
        this.surname = surname;
        this.Fathersname = Fathersname;
        this.course = course;
        this.lastExamGrade = lastExamGrade;
    }

    public void writeExam() {}
}
