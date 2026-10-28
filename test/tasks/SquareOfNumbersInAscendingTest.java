package tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static tasks.SquareOfNumbersInAscending.square;

public class SquareOfNumbersInAscendingTest {

    public static Stream<Arguments> parameterTotest(){
        return Stream.of(
                Arguments.of(
                        new int [] {3,2,7,1,4},
                        new int [] {1,4,9,16,49}),
                Arguments.of(
                        new int [] {4, 8, 2, 1, 60},
                        new int [] {1, 4, 16, 64, 3600}
                )
        );


    }
    @ParameterizedTest(name ="Test {index}")
    @MethodSource("parameterTotest")
    public void test(int [] input , int [] expected){
        assertArrayEquals(expected, square(input));
    }

    @Test
    void testSortedSquares(){
        int[] input = {0, -3, -1, 9, 5};
        int[] expected = {0, 1, 9, 25, 81};
        assertArrayEquals(expected, square(input));
    }
}