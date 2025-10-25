public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Dog talkingDog = new Dog(){
            @Override
            void speak(){
                System.out.println("Scooby Doo speaks");
            }
        };

        dog.speak();
        talkingDog.speak();
    }
}
