package dataStructure;

import dataStructures.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {

    ArrayList myArrayList;

    @BeforeEach
    public void SetUp(){
        //Given
        myArrayList = new ArrayList();
    }

    @Test
    public void createMyArrayList_checkThatIsEmptyTest(){

        //Check
        assertTrue(myArrayList.isEmpty());
    }

    @Test
    public void createMyArrayList_addItemIntoMyArrayList_checkThatIsEmptyIsFalseTest(){

        //when
        myArrayList.add("nnamdi");

        //Check That
        assertFalse(myArrayList.isEmpty());
    }

    @Test
    public void  createMyArrayList_add2ItemsIntoMyArrayList_checkThatIsEmptyisFalseAndTheSizeIsTwoTest(){

        //When
        myArrayList.add("Nnamdi");
        myArrayList.add("Aniakor");

        //CheckThat
        assertFalse(myArrayList.isEmpty());
        assertEquals(2, myArrayList.size());
    }

    @Test
    public void createMyArrayList_add3Items_removeAnItem_checkThatTheLengthIs2Test(){
        //Given
        myArrayList.add("CJ");
        myArrayList.add("PJ");
        myArrayList.add("TJ");

        //When
        myArrayList.remove(1);

        //Check that
        assertEquals(2, myArrayList.size());
    }

    @Test
    public void createMyArrayList_add5Items_remove2Item_checkThatTheLengthIs3Test(){
        //Given
        myArrayList.add("CJ");
        myArrayList.add("PJ");
        myArrayList.add("TJ");
        myArrayList.add("MJ");
        myArrayList.add("LJ");

        //When
        myArrayList.remove(1);
        myArrayList.remove(4);

        //Check that
        assertEquals(3, myArrayList.size());
    }

    @Test
    public void add10Elements_checkThatItIsFullTest(){
        //When
        myArrayList.add("CJ");
        myArrayList.add("PJ");
        myArrayList.add("TJ");
        myArrayList.add("MJ");
        myArrayList.add("LJ");
        myArrayList.add("AJ");
        myArrayList.add("OJ");
        myArrayList.add("EJ");
        myArrayList.add("BJ");
        myArrayList.add("JJ");

        //Check that
        assertTrue(myArrayList.isFull());

        //When

    }

    @Test
    public void add10Elements_checkThatItIsFull_addAnItemAgainAndMyArrayListisNotFullTest(){
        //When
        myArrayList.add("CJ");
        myArrayList.add("PJ");
        myArrayList.add("TJ");
        myArrayList.add("MJ");
        myArrayList.add("LJ");
        myArrayList.add("AJ");
        myArrayList.add("OJ");
        myArrayList.add("EJ");
        myArrayList.add("BJ");
        myArrayList.add("JJ");

        //Check that
        assertTrue(myArrayList.isFull());

        //When
        myArrayList.add("IJ");

        //Check That
        assertFalse(myArrayList.isFull());
    }

    @Test
    public void createMyListCallTheEnsureCapacityAtSize20_add10Items_checkthatTheListIsNotFullTest(){
        //When
        myArrayList.ensureCapacity(20);

        myArrayList.add("CJ");
        myArrayList.add("PJ");
        myArrayList.add("TJ");
        myArrayList.add("MJ");
        myArrayList.add("LJ");
        myArrayList.add("AJ");
        myArrayList.add("OJ");
        myArrayList.add("EJ");
        myArrayList.add("BJ");
        myArrayList.add("JJ");

        //check that
        assertFalse(myArrayList.isFull());
    }

    @Test
    public void createMyArrayList_add3Items_checkThatMyListContainsThatElementsTEst(){
        //When
        myArrayList.add("MJ");
        myArrayList.add("DJ");
        myArrayList.add("CJ");

        //Check that
        assertTrue(myArrayList.contains("MJ"));
    }

    @Test
    public void myArrayListHas3Items_whenMyListRemovesCJ_checkThatMyListDoesNotContainsThatElementsTest(){
        //When
        myArrayList.add("MJ");
        myArrayList.add("DJ");
        myArrayList.add("CJ");

        myArrayList.remove(2);

        //Check that
        assertFalse(myArrayList.contains("CJ"));
    }
}
