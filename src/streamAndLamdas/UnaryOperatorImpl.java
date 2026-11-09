package streamAndLamdas;

import java.util.function.UnaryOperator;

public class UnaryOperatorImpl {

    static void main(String[] args) {
        UnaryOperator<String> operator = (word)-> word.toUpperCase();

        System.out.println(operator.apply("clement"));
    }
}
