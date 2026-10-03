package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static tasks.TimeConversion.convert;

public class TimeConversionTest {

    @Test
    public void firstTest(){
        String input = "12:00:00am";
        String actual = convert(input);
        String expected = "00:00:00";
        assertEquals(expected, actual);
    }

    @Test
    public void secondTest(){
        String input = "12:00:00AM";
        String actual = convert(input);
        String expected = "00:00:00";
        assertEquals(expected, actual);
    }

    @Test
    public void thirdTest(){
        String input = "12:00:00pm";
        String actual = convert(input);
        String expected = "12:00:00";
        assertEquals(expected, actual);
    }

    @Test
    public void fourthTest(){
        String input = "12:00:00PM";
        String actual = convert(input);
        String expected = "12:00:00";
        assertEquals(expected, actual);
    }

    @Test
    public void fifthTest(){
        String input = "07:05:45PM";
        String actual = convert(input);
        String expected = "19:05:45";
        assertEquals(expected, actual);
    }
}