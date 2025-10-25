import Abstract.AbstractMain;
import Constructors.ConstructorMain;
import Inheritance.InheritanceMain;
import Interface.InterfaceMain;
import Overriding.OverridingMain;
import Polymorphism.PolymorphismMain;

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
        InheritanceMain.runClass();
        InterfaceMain.runClass();
        PolymorphismMain.runClass();
    }
}
