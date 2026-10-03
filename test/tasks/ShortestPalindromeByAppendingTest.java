package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static tasks.ShortestPalindromeByAppending.makeAPalindrome;

public class ShortestPalindromeByAppendingTest {

    @Test
    public void firstTest(){
        String input  = "madam";

        String actual = makeAPalindrome(input);

        String expected = "madam";

        assertEquals(expected, actual);
    }

    @Test
    public void secondTest(){
        String input  = "race";

        String actual = makeAPalindrome(input);

        String expected = "racecar";

        assertEquals(expected, actual);
    }

    @Test
    public void thirdTest(){
        String input  = "ab";

        String actual = makeAPalindrome(input);

        String expected = "aba";

        assertEquals(expected, actual);
    }

    @Test
    public void fourthTest(){
        String input  = "aace";

        String actual = makeAPalindrome(input);

        String expected = "aacecaa";

        assertEquals(expected, actual);
    }

    @Test
    public void fifthTest(){
        String input  = "banana";

        String actual = makeAPalindrome(input);

        String expected = "bananab";

        assertEquals(expected, actual);
    }

    @Test
    public void sixthTest(){
        String input  = "abcd";

        String actual = makeAPalindrome(input);

        String expected = "abcdcba";

        assertEquals(expected, actual);
    }

    @Test
    public void seventhTest(){
        String input  = "aabbaa";

        String actual = makeAPalindrome(input);

        String expected = "aabbaa";

        assertEquals(expected, actual);
    }

    @Test
    public void eightTest(){
        String input  = "amanda";

        String actual = makeAPalindrome(input);

        String expected = "amandadnama";

        assertEquals(expected, actual);
    }
}