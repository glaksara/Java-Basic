package Inheritance;

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
    }
}
