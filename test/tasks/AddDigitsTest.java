package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AddDigitsTest {

    @Test
    public void firstTest(){
        int input = 47;

        int actual = AddDigits.add(input);

        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void secondTest(){
        int input = 1000;

        int actual = AddDigits.add(input);

        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void thirdTest(){
        int input = 4;

        int actual = AddDigits.add(input);

        int expected = 4;

        assertEquals(expected, actual);
    }
}