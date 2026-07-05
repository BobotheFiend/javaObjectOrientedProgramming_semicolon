package dataStructure;

import dataStructures.Stack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    Stack myStack;

    @BeforeEach
    public void SetUp() {
        myStack = new Stack(5);
    }

    @Test
    public void createStack_checkThatStackIsEmptyTest() {

        //Check That
        assertTrue(myStack.isEmpty());
    }

    @Test
    public void createStack_pushOneElement_checkThatIsEmptyFalseTest() {

        //When
        myStack.push("Himnnamdi");

        //Check that
        assertFalse(myStack.isEmpty());
    }

    @Test
    public void haveMystack_push3Items_sizeOfMyStackIs3AndStackIsEmptyFalseTest() {
        //When
        myStack.push("flat plate");
        myStack.push("flat ceramic plate");
        myStack.push("flat stainless plate");

        //Check that
        assertEquals(3, myStack.size());
        assertFalse(myStack.isEmpty());
    }

    @Test
    public void createMyStack_pushAnItem_popAnItem_myStackIsEmptyTrueTest() {

        //When
        myStack.push("ceramic plate");

        myStack.pop();

        //Check that
        assertTrue(myStack.isEmpty());
    }


    @Test
    public void createMyStack_pushAnItem_popAnItemTwice_myStackIsEmptyTrueTest() {

        //When
        myStack.push("ceramic plate");

        myStack.pop();


        //Check that
        assertThrows(IllegalArgumentException.class, ()-> myStack.pop());
        assertTrue(myStack.isEmpty());
    }

    @Test
    public void createMyStack_push5Items_pop3Items_myStackIsEmptyFalseAndSizeIs3Test() {

        //When
        myStack.push("ceramic plate");
        myStack.push("bowl");
        myStack.push("stainless steel");
        myStack.push("flat plate");
        myStack.push("komkom");

        myStack.pop();
        myStack.pop();
        myStack.pop();

        //Check that
        assertFalse(myStack.isEmpty());
        assertEquals(2, myStack.size());
    }

    @Test
    public void createMyStack_pushIn5Items_popMyStack_checkMyStackReturnsTheLastElementAndtheSizeIs$_Test(){
        //When
        myStack.push("Ceramic plate");
        myStack.push("Stainless Steel");
        myStack.push("Komkom");
        myStack.push("Glass plate");
        myStack.push("Bronze Plate");


        //Check that
        assertEquals("Bronze Plate", myStack.pop());
        assertEquals(4, myStack.size());
    }

    @Test
    public void createMyStack_push3items_pop2Items_compareLastPoppedItemAndCheckThatLenghtIs1Test(){
        //Given
        myStack.push("white plate");
        myStack.push("red plate");
        myStack.push("green plate");

        //When
        myStack.pop();

        //Check that
        assertEquals("red plate", myStack.pop());
         boolean myStackLengthIsNowOne = myStack.size() == 1;
        assertTrue(myStackLengthIsNowOne);
    }

    @Test
    public void createMyStack_popItem_displayErrorMessageTest(){

        //Check that
        assertThrows(IllegalArgumentException.class, ()->  myStack.pop());

    }


    @Test
    public void createMystack_pushThreeItemsIntoMystack_whenMyStackPeeks_itReturnsTheLastItemAndSizeRemains3Test(){
        //Given
        myStack.push("Silver spoon");
        myStack.push("Golden forks");
        myStack.push("Wooden Stick");

        //
        assertEquals("Wooden Stick", myStack.peek());
        boolean myStackLengthIsStill3 = myStack.size() == 3;
        assertTrue(myStackLengthIsStill3);
    }

    @Test
    public void createMyStack_peekInMyStack_displayErrorMessageTest(){

        //Check that
        assertThrows(IllegalArgumentException.class, ()->  myStack.peek());

    }


    @Test
    public void createMystack_pushThreeItemsIntoMystackAndPopOnce_whenMyStackPeeks_itReturnsTheLastItemAndSizeRemains2Test(){
        //Given
        myStack.push("Silver spoon");
        myStack.push("Golden forks");
        myStack.push("Wooden Stick");
        myStack.pop();
        //
        assertEquals("Golden forks", myStack.peek());
        boolean myStackLengthIsStill2 = myStack.size() == 2;
        assertTrue(myStackLengthIsStill2);
    }

    @Test
    public void createMystack_pushThreeItemsIntoMystackAndPopTwice_whenMyStackPeeks_itReturnsTheLastItemAndSizeIsOneTest(){
        //Given
        myStack.push("Silver spoon");
        myStack.push("Golden forks");
        myStack.push("Wooden Stick");

        //When
        myStack.pop();
        myStack.pop();

        //Check that
        assertEquals("Silver spoon", myStack.peek());
        boolean myStackLengthIsOne = myStack.size() == 1;
        assertTrue(myStackLengthIsOne);
    }

    @Test
    public void createMyStack_push5Items_checkThatMyStackIsFullTest(){
        //When
        myStack.push("Ceramic Plate");
        myStack.push("Glass Plate");
        myStack.push("Bronze Plate");
        myStack.push("Gold Plate");
        myStack.push("Silver Plate");

        //Check that
        assertTrue(myStack.isFull());
    }

    @Test
    public void createMyStack_push6Items_displayErrorMessageTest(){
        //When
        myStack.push("Ceramic Plate");
        myStack.push("Glass Plate");
        myStack.push("Bronze Plate");
        myStack.push("Gold Plate");
        myStack.push("Silver Plate");


        //Check that
        assertThrows(IllegalArgumentException.class, ()->  myStack.push("Red Plate"));
    }

}