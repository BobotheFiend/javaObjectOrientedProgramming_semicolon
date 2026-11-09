package streamAndLamdas;

import java.util.function.BiPredicate;

public class BiPredicateImpl {
    public static void main(String[] args) {


        BiPredicate<Integer, Integer> compareTwoScores = (firstScore, secondScore) -> firstScore.compareTo(secondScore) == 0;
        System.out.println(compareTwoScores.test(88, 88));
    }



}
