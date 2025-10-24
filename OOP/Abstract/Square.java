package Abstract;

public class Square extends Shape{
    double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    double area() {
        return Math.pow(this.length, 2);
    }
}
