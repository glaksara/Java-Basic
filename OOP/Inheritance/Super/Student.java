package Inheritance.Super;

public class Student extends Person {

    double gpa;

    public Student(String first, String last, double gpa) {
        super(first, last);
        this.gpa = gpa;
    }

    public void show() {
        System.out.println(this.first + "'s gpa is: " + this.gpa);
    }
}
