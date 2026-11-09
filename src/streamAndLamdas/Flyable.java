package streamAndLamdas;

@FunctionalInterface
public interface Flyable {
    void fly(Double value);

    default void message(){
        System.out.println("Thats amazing!!!");
    };

}
