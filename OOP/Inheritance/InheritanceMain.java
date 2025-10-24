package Inheritance;

import Inheritance.Super.Person;
import Inheritance.Super.Student;

public class InheritanceMain {
    public static void runClass() {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.eat();
        cat.eat();

        System.out.println(dog.lives);
        dog.speak();

        System.out.println(cat.lives);
        cat.speak();

        Plant plant = new Plant();
        System.out.println(plant.isAlive);
        plant.photosynthesis();

//        Super Key Word
        Person person = new Person("Harry", "Potter");
        person.showName();

        Student student = new Student("Harry", "Potter", 3.35);
        student.showName();
        student.show();
    }
}
