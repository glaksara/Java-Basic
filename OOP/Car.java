public class Car {
    String make = "Audi";
    String model = "A6";
    int year = 2025;
    double price = 5800.99;
    boolean isRunning = false;

    void start() {
        isRunning = true;
        System.out.println("You start the engine");
    }

    void stop() {
        isRunning = false;
        System.out.println("You stop the engine");
    }

    void drive() {
        System.out.println("You drive the " + model);
    }

}
