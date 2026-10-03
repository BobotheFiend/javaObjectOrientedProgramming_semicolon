package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReverseSubStringTest {

    @Test
    public void firstTest(){
        String input = "(abcd)";

        String actual = ReverseSubString.reverseTheString(input);

        String expected = "dcba";
        assertEquals(expected, actual);
    }

    @Test
    public void secondTest(){
        String input = "(u(love)i)";

        String actual = ReverseSubString.reverseTheString(input);

        String expected = "iloveu";
        assertEquals(expected, actual);
    }

    @Test
    public void thirdTest(){
        String input = "(ed(et(oc))el)";

        String actual = ReverseSubString.reverseTheString(input);

        String expected = "leetcode";
        assertEquals(expected, actual);
    }

    @Test
    public void fourthTest(){
        String input = "(abc)(def)";

        String actual = ReverseSubString.reverseTheString(input);

        String expected = "cbafed";
        assertEquals(expected, actual);
    }

}