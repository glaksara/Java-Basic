public class Main {
    public static void main(String[] args) {
//        Java 14 feature
        String day = "Friday";

        switch (day){
          case "Monday" -> System.out.println("It is Monday");
          case "Friday" -> System.out.println("It is Friday");
          default -> System.out.println("I dont know the Day");
        }
    }
}
