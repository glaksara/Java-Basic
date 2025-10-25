import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.setItem("Box1");

        Box<Integer> box2 = new Box<>();
        box2.setItem(1);

        System.out.println(box.getItem());
        System.out.println(box2.getItem());

        Product<String, Double> product = new Product<>("Apple", 100.5);
        System.out.println(product.item);
    }
}
