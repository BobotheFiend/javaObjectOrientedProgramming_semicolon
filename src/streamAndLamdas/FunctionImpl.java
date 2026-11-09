package streamAndLamdas;

import java.math.BigDecimal;
import java.util.function.Function;

public class FunctionImpl {
    static void main() {
        Function<String, BigDecimal> getAmount = (amount)->  new BigDecimal(amount.trim());

        System.out.println(getAmount.apply("100000 "));
    }

}
