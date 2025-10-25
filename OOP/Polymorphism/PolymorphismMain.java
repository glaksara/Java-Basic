package Polymorphism;

import Polymorphism.RuntimePolymorphism.Animal;
import Polymorphism.RuntimePolymorphism.Cat;
import Polymorphism.RuntimePolymorphism.Dog;

import java.util.Scanner;

public class PolymorphismMain {
    public static void runClass() {
        Bike bike = new Bike();
        Car car = new Car();

        Vehicle[] vehicles = {car, bike};

        for (Vehicle vehicle : vehicles) {
            vehicle.go();
        }

//        Runtime Polymorphism
        Scanner scanner = new Scanner(System.in);

        System.out.print("Would you like a dog or cat? (1 = dog, 2 = cat): ");
        int choice = scanner.nextInt();

        Animal animal;

        if (choice == 1) {
            animal = new Dog();
            animal.speak();
        } else if (choice == 2) {
            animal = new Cat();
            animal.speak();
        }

        scanner.close();
    }
}
