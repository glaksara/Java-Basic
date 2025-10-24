import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] fruits = {"apple", "orange"};

//        Array Length
        int length = fruits.length;
        System.out.println(length);

//        Sort Array
        Arrays.sort(fruits);

//        Fill Method
        Arrays.fill(fruits, "papaw");

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

//        Enhanced for loop (For Each Loop)
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
