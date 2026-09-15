package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondHighestNumberTest {

    @Test
    public void secondHighestNumberTest() {
        //Given
        int [] input = {2, 7, 6, 8, 1};

        //When
        int expected = SecondHighestNumber.secondHighestNumber(input);

        //Assert That
        int output = 7;
        assertEquals(output, expected);
    }


    @Test
    public void secondHighestNumberForDuplicateHighestTest() {
        //Given
        int [] input = {20, 14, 7, 20, 1, 19,};

        //When
        int expected = SecondHighestNumber.secondHighestNumber(input);

        //Assert That
        int output = 19;
        assertEquals(output, expected);
    }

    @Test
    public void secondHighestNegativeNumberTest() {
        //Given
        int [] input = {-20, -14, -7, -2, -1, -19};

        //When
        int expected = SecondHighestNumber.secondHighestNumber(input);

        //Assert That
        int output = -2;
        assertEquals(output, expected);
    }

}