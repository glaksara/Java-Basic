package Wrapper;

public class WrapperMain {
    public static void runClass() {
        Integer a = 123;
        System.out.println(a);

//        Unboxing (Object to primitive)
        int x = a;
        System.out.println(x);

        String b = Integer.toString(1);
        String c = Double.toString(3.1);
        String d = Character.toString('c');
        String e = Boolean.toString(true);

        String y = b + c + d + e;
        System.out.println(y);

//        Parsing
        int f = Integer.parseInt("11");
        double g = Double.parseDouble("2.59");
        char h = "Pizza".charAt(0);
        boolean i = Boolean.parseBoolean("true");

        System.out.printf("%d %f %c %b",f, g, h, i);

        

    }
}
