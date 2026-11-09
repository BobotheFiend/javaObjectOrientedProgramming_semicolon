package streamAndLamdas;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierImpl {
    static void main() {

        Supplier<String> stringSupplier = ()-> "Am MR mi-SIX!";

        Stream.generate(stringSupplier).forEach(System.out::println);
    }

}
