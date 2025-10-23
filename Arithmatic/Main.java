public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 3;
        int z;

//        z = x + y;
//        z = x - y;
//        z = x * y;
//        z = x / y;
        z = x % y; // Get Reminder (Modulus)
        System.out.println(z);

//        Augmented Assignment Operators
        x += y; // x = x + y
        System.out.println(x);

//        Increment and Decrement Operators
        int a = 1;
        int b = 5;
        a++; // a = a + 1
        b--;
        System.out.println(a);
        System.out.println(b);
    }
}
