public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(1 / 0);
        } catch (ArithmeticException e) {
            System.out.println("YOU CANT DIVIDE BY ZERO!");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }finally {
            System.out.println("Execute at end");
        }
    }
}
