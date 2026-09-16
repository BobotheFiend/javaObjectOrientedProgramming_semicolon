package tasks;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class RotateArrayTwiceToTheLeftTest {

    @Test
    public void testThatThisArrayRotatesToTheLeftTwice(){
        //Given
        int [] input = {2,3,4,5,6};

        //When
        int [] expected = RotateArrayTwiceToTheLeft.rotatedArray(2, input);

        //Assert That
        int [] result = {4,5,6,2,3};
        System.out.println(Arrays.toString(result));

        assertArrayEquals(expected, result);
    }

    @Test
    public void testTwoThatThisArrayRotatesToTheLeftTwice(){
        //Given
        int [] input = {2,3,6};

        //When
        int [] expected = RotateArrayTwiceToTheLeft.rotatedArray(2, input);

        //Assert That
        int [] result = {6,2,3};

        assertArrayEquals(expected, result);
    }

    @Test
    public void testThatThisArrayRotatesToTheLeftTrice(){
        //Given
        int [] input = {4,10,66,2,3,6};

        //When
        int [] expected = RotateArrayTwiceToTheLeft.rotatedArray(3, input);

        //Assert That
        int [] result = {2, 3, 6, 4, 10, 66};

        assertArrayEquals(expected, result);
    }

}