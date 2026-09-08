package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static tasks.LowestCommonMultiple.lcm;

public class LowestCommonMultipleTest {

    @Test
    public void lowestCommonMultipleTest() {
        //Given
        int [] collection = {2, 8, 12};

        //When
        int expected = lcm(collection);
        
        //Asser That
        assertEquals(24, expected);

    }

    @Test
    public void threeLowestCommonMultipleTest() {
        //Given
        int [] collection = {7, 6, 5};

        //When
        int expected = lcm(collection);

        //Asser That
        assertEquals(210, expected);

    }

    @Test
    public void fourNumberslowestCommonMultipleTest() {
        //Given
        int [] collection = {3, 6, 9, 12};

        //When
        int expected = lcm(collection);

        //Asser That
        assertEquals(36, expected);

    }

    @Test
    public void threeeNumberslowestCommonMultipleTest() {
        //Given
        int [] collection = {12, 75, 15};

        //When
        int expected = lcm(collection);

        //Asser That
        assertEquals(300, expected);

    }

    @Test
    public void twoNumberslowestCommonMultipleTest() {
        //Given
        int [] collection = {2, 12};

        //When
        int expected = lcm(collection);

        //Asser That
        assertEquals(12, expected);

    }

}