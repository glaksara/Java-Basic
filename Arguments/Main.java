import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();  // Get rid of new line character

        System.out.print("Enter your favourite color: ");
        String color = scanner.nextLine();

        System.out.println("Hello " + name);
        System.out.println("Your are " + age + " years old");
        System.out.println("Your favourite color is: " + color);

        scanner.close();
    }
}
