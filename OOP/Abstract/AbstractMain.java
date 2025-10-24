package Abstract;

public class AbstractMain {
    public static void runClass() {
        Square square = new Square(5.0);
        square.display();
        System.out.println(square.area());
    }
}
