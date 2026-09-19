package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HighestOccurenceOfNumberSequenceTest {

    @Test
    public void inputOneTest(){
        //Given
        int [] input = {2, 2, 3, 5, 6, 7, 8};

        //When
        int expected = HighestOccurenceOfNumberSequence.mostSequentialOccurence(input);
        int actual = 4;
        //Assert that
        assertEquals(actual, expected);
    }

    @Test
    public void inputTwoTest(){
        //Given
        int [] input = {5, 6, 1, 2, 3, 4};

        //When
        int expected = HighestOccurenceOfNumberSequence.mostSequentialOccurence(input);
        int actual = 4;
        //Assert that
        assertEquals(actual, expected);
    }
}