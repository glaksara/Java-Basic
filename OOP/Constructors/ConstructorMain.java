package Constructors;

public class ConstructorMain {

    public ConstructorMain() {
    }

    public static void runClass() {
        Student student1 = new Student("Laksara",
                29,
                3.35);
        System.out.println(student1.name);
    }
}
