package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LengthOfLastWordTest {

    @Test
    public void firstTest(){
        String input = "Hello World";

        int actual = LengthOfLastWord.lastWordLenght(input);

        int expected = 5;

        assertEquals(expected, actual);

    }

    @Test
    public void secondTest(){
        String input = "   fly me   to   the moon  ";

        int actual = LengthOfLastWord.lastWordLenght(input);

        int expected = 4;

        assertEquals(expected, actual);

    }
}