package streamAndLamdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateImpl {

    static void main(String[] args) {

        Predicate<String> supplyStrings = (word)->word.length()>6;

//        String []  arrOfWords = {"Yam", "Rice", "Timothy", "Java", "Predicate", "Boolean"};


//        supplyStrings.test(Stream.generate(()-> {
//            Random random = new Random();
//            return arrOfWords[random.nextInt()];
//        }));

        System.out.println(supplyStrings.test("Hello"));
    }
}
