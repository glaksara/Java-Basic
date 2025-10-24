import java.util.Arrays;
import java.util.Scanner;

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

//        Empty Arrays
        String[] foods = new String[3];
        foods[0] = "pizza";

        System.out.println(foods.length);

//        User Inputs into array
        Scanner scanner = new Scanner(System.in);

        String[] inputs = new String[3];

        for (int i = 0; i < inputs.length; i++) {
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

        for (String food : foods) {
            System.out.println(food);
        }

        scanner.close();
    }
}
