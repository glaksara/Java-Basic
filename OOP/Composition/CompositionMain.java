package Composition;

public class CompositionMain {
    public static void runClass() {
        Car car = new Car("Corvette", 2025, "V8");
        System.out.println(car.model);
        System.out.println(car.engine.type);
    }
}
