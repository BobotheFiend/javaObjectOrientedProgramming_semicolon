package dataStructure;

import dataStructures.Queue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {

    Queue myQueue;
    @BeforeEach
    public void SetUp(){
        //Given
        myQueue = new Queue(4);
    }

    @Test
    public void createMyQueue_checkThatItIsEmptyTest(){
        //Check that
        assertTrue(myQueue.isEmpty());
    }

    @Test
    public void createMyQueue_addAnItemInMyQueue_checkThatMyQueueIsNotEmptyTest(){
        //When
        myQueue.add("First");

        //Check That
        assertFalse(myQueue.isEmpty());
    }

    @Test
    public void createMyQueue_add2Elements_checkThatTheSizeIs3Test(){
        //When
        myQueue.add("First");
        myQueue.add("Second");

        //Check that
        assertEquals(2, myQueue.size());
    }

    @Test
    public void createMyQueue_add4Items_checkThatItisFull(){
        //When
        myQueue.add("First");
        myQueue.add("Second");
        myQueue.add("Third");
        myQueue.add("Fourth");

        //Check
        assertTrue(myQueue.isFull());
    }

    @Test
    public void createMyQueue_addItemsWhenQueueIsFull_displayErrorMessageTest(){
        //When
        myQueue.add("First");
        myQueue.add("Second");
        myQueue.add("Third");
        myQueue.add("Fourth");

        //Check
        assertTrue(myQueue.isFull());
        assertThrows(IllegalArgumentException.class, ()-> myQueue.add("Fifth"));
    }

    @Test
    public void createQueue_offerItemsToQueue_checkThatThatMyOfferIsTrueFor3TInputsTest() {
        //Check That
        assertTrue(myQueue.offer("First"));
        assertTrue(myQueue.offer("Second"));
        assertTrue(myQueue.offer("Third"));
    }

    @Test
    public void createQueue_offerItemsToQueueWhenQueueIsFull_checkThatOfferIsFalseTest(){
        //When
        myQueue.add("First");
        myQueue.add("Second");
        myQueue.add("Third");
        myQueue.add("Fourth");

        //Check that
        assertFalse(myQueue.offer("Fifth"));

    }

    @Test
    public void createMyQueue_addAndOffer2ItemsEachToMyQueue_checkThatTheLengthIs4Test(){
        //When
        myQueue.add("First");
        myQueue.add("Second");
        myQueue.offer("Third");
        myQueue.offer("Fourth");

        //Check that
        assertEquals(4, myQueue.size());
    }

    @Test
    public void createQueue_add3Items_checkThatWhenMyQueuePeeksItReturnsTheFirstElementTest(){
        //When
        myQueue.add("First");
        myQueue.add("Second");
        myQueue.add("Third");

        //Check that
        assertEquals("First", myQueue.peek());
    }

    @Test
    public void createMyStack_myStackIsEmpty_myStackPeeks_checkThatItDisplaysErrorMessageTest(){
        //Check That
        assertThrows(IllegalArgumentException.class, ()-> myQueue.peek());
    }

    @Test
    public void createMyStack_add3ThreeItems_myQueueRemovesOnce_checkThatTheElementSameAsIndex0Test(){
        //When
        myQueue.add("First");
        myQueue.add("Second");
        myQueue.add("Third");

        //Check that
        assertEquals("First", myQueue.remove());
    }

    @Test
    public void createMyQueue_myQueueHas3Items_myQueueRemovesTwice_checkThatItDisplaysTheSecondItemTest(){
        //When
        myQueue.add("First");
        myQueue.add("Second");
        myQueue.add("Third");

        myQueue.remove();

        //Check that
        assertEquals("Second", myQueue.remove());
    }

    @Test
    public void createMyQueue_myQueueHas3Items_myQueueRemovesOnce_checkThatTheLengthIs2AndDisplaysFirstItemTest(){
        //When
        myQueue.add("First");
        myQueue.add("Second");
        myQueue.add("Third");

        //Check that
        assertEquals("First", myQueue.remove());
        assertEquals(2, myQueue.size());
    }

    @Test
    public void createMyQueue_myQueueHas3Items_myQueueRemovesTwice_checkThatTheLengthIs1AndDisplaysFirstItemTest(){
        //When
        myQueue.add("First");
        myQueue.add("Second");
        myQueue.add("Third");

        myQueue.remove();

        //Check that
        assertEquals("Second", myQueue.remove());
        assertEquals(1, myQueue.size());
    }

    @Test
    public void add4ItemsRemoveTwice_checkThatSeekReturnsTheThirdElement(){
        //When
        myQueue.add("First");
        myQueue.add("Second");
        myQueue.add("Third");
        myQueue.add("Fourth");

        myQueue.remove();
        myQueue.remove();

        //Check that
        assertEquals("Third", myQueue.peek());
    }

    @Test
    public void myQueueIsEmpty_removeItem_checkThatLengthIsZeroTest(){
        //When
        myQueue.remove();

        //Check That
        assertEquals(0, myQueue.size());

    }

    @Test
    public void add3ItemsToMyQueue_pollMyQueue_checkThatTheSizeIs2AndItReturnsTheFirstElementTest(){
        //When
        myQueue.add("First");
        myQueue.add("Second");
        myQueue.add("Third");

        //Check that
        assertEquals("First", myQueue.poll());
        assertEquals(2, myQueue.size());
    }

    @Test
    public void add3ItemsToMyQueue_pollMyQueueTwice_checkThatTheSizeIs1AndItReturnsTheSecondElementTest(){
        //When
        myQueue.add("First");
        myQueue.add("Second");
        myQueue.add("Third");

        myQueue.poll();

        //Check that
        assertEquals("Second", myQueue.poll());
        assertEquals(1, myQueue.size());
    }


    @Test
    public void myQueueIsEmpty_pollMyQueue_checkThatItReturnsANullMessage(){
        //Check that
        assertThrows(IllegalArgumentException.class, ()-> myQueue.poll());
    }

}
