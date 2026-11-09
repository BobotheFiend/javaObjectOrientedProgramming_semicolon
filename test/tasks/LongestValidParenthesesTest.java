package tasks;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class LongestValidParenthesesTest {

    @ParameterizedTest
    @CsvSource({
            "((), 2",
            ")()()), 4",
            "'', 0",
            "()()(), 6",
            "(()()())()()))()()(((())))), 12"
    })
    public void test(String input, int expected){
        int actual = LongestValidParentheses.consecutiveStreak(input);
        assertEquals(expected, actual);
    }

}