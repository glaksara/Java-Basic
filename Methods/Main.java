public class Main {
    public static void main(String[] args) {
//        Variable Arguments: Allow a method to accept varying # of arguments
//        Helps with Overloading

        System.out.println(add(1, 2, 3, 4));

    }

    static int add(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}
