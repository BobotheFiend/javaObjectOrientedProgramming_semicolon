package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CodeWarTest {

    @Test
    public void testThatBoardExampleSwaps(){
        int [] arrayExample = {2,5,3,8,2,1};

        int [] expected = CodeWar.collections(arrayExample);
        int [] actual = {5,2,8,3,1,2};
        assertArrayEquals(expected, actual);

    }

    @Test
    public void boardExampleSwapsExample2Test(){
        int [] arrayExample = {2,4,3,8,2,1,5};

        int [] expected = CodeWar.collections(arrayExample);
        int [] actual = {2,4,8,3,1,2,5};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void boardExampleSwapsExample3Test(){
        int [] arrayExample = {2,4,8,8,2,6,5,5,8,9};

        int [] expected = CodeWar.collections(arrayExample);
        int [] actual = {2,4,8,8,2,6,5,5,9,8};
        assertArrayEquals(expected, actual);
    }

}