package streamAndLamdas;

import java.util.function.BiFunction;

public class BiFunctionImpl {

    static void main(String[] args) {
        BiFunction<String, String, String> biFunction = (name, cohort) -> {
            StringBuilder builder = new StringBuilder();
            builder.append("Name -> ").append(name);
            builder.append("\n");
            builder.append("Cohort -> ").append(cohort);
            return builder.toString();
        };

        System.out.println(biFunction.apply("Nnamdi", "Thirty"));
    }
}
