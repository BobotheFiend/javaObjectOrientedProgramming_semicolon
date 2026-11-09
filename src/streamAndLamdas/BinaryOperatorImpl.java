package streamAndLamdas;

import java.util.function.BinaryOperator;

public class BinaryOperatorImpl {

    public static void main(String[] args) {

        BinaryOperator<Integer> compareFunds = (myMoney, yourMoney)-> myMoney.compareTo(yourMoney);

        System.out.println(compareFunds.apply(30_000, 100_000_000));

    }



}
