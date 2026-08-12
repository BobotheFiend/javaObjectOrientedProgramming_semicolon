package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static tasks.Conversion.*;

public class ConversionTest {

    @Test
    public void testConversion() {
        int number = 1037;
        int base = 8;
        int convertToBase = 10;
        int conversion = conversion(number, base, convertToBase);


        assertEquals(543, conversion);
    }

    @Test
    public void testConversion2() {
        int number = 1037;
        int base = 8;
        int convertion = convertToBase10(number, base);

        assertEquals(543, convertion);
    }

    @Test
    public void testConversion3() {
        int number = 100;
        int base = 10;
        int convertToBaseTwo = 2;

        int conversion = conversion(number, base, convertToBaseTwo);
        assertEquals(1100100, conversion);

    }

    @Test
    public void testConversion4() {
        int number = 60;
        int base = 8;
        int convertToBaseTwo = 2;

        int conversion = conversion(number, base, convertToBaseTwo);
        assertEquals(110000, conversion);

    }
}