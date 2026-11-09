package streamAndLamdas;

public class Main {
    public static void main(String[] args) {
        Flyable jet = (distance)-> System.out.printf("I am A jet That flies at %s mph%n", distance);
        jet.fly(119.9);
        jet.message();

        Flyable bat = (distance)-> System.out.printf("I am a Bat that Ozzeebaaas at %s mph%n",distance);
        bat.fly(23.02);
        bat.message();

    }

}
