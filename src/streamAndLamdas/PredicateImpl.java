package streamAndLamdas;

import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Stream;


public class PredicateImpl {

    static void main(String[] args) {

        Predicate<String> supplyStrings = (word)->word.length()>6;

        String []  arrOfWords = {"Yam", "Rice", "Timothy", "Java", "Predicate", "Boolean"};
        Random random = new Random();

        int index = random.nextInt(0, arrOfWords.length);

        String randomWord = arrOfWords[index];

        System.out.println("The outcome of the word " + randomWord + " is -> " + supplyStrings.test(randomWord));


        Stream.generate(()-> arrOfWords[random.nextInt(0, arrOfWords.length)])
                .limit(20)
                .forEach((word)->{
                    System.out.println(word + " -> " + supplyStrings.test(word));
                });
    }
}
