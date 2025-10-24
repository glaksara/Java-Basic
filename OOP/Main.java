import Abstract.AbstractMain;
import Constructors.ConstructorMain;
import Inheritance.InheritanceMain;
import Overriding.OverridingMain;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.make);

        System.out.println(car.isRunning);
        car.isRunning = true;

        car.start();
        System.out.println(car.isRunning);
        car.stop();
        System.out.println(car.isRunning);

        car.drive();

        ConstructorMain.runClass();
        InheritanceMain.runClass();
        OverridingMain.runClass();
        AbstractMain.runClass();
    }
}
