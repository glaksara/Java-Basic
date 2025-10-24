package Constructors;

public class Student {
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gpa=" + gpa +
                ", isEnrolled=" + isEnrolled +
                '}';
    }
}
