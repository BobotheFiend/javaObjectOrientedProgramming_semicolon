package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OccurenceOfCharacterTest {

    @Test
    public void firstInputTest(){
        String input = "aaaabbbccd";

        String actual = OccurenceOfCharacter.occurrence(input);

        String expected = "a4b3c2d1";

        assertEquals(expected, actual);
    }

    @Test
    public void secondInputTest(){
        String input = "aaabbaa";

        String actual = OccurenceOfCharacter.occurrence(input);

        String expected = "a3b2a2";

        assertEquals(expected, actual);
    }
}