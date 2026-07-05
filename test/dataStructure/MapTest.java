package dataStructure;

import dataStructures.Map;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MapTest {

    Map myMap;
    @BeforeEach
    public void setUp(){
        //Given
        myMap = new Map();
    }

    @Test
    public void createMyMapCollection_checkThatIsEmptyTest(){
        //Check That
        assertTrue(myMap.isEmpty());
    }

    @Test
    public void createMyMapCollection_addAnItemCheckThatIsNotEmptyTest(){
        //When
        myMap.put("name", "Nnamdi");

        //check that
        assertFalse(myMap.isEmpty());
    }

    @Test
    public void add2ItemsInMyMap_checkTheSizeIs2Test(){
        //When
        myMap.put("name", "Nnamdi");
        myMap.put("name", "Caven");

        //Check that
        assertEquals(2, myMap.size());
    }

    @Test
    public void add4items_removeOneItemCheckThatSizeIs3Test(){
        //When
        myMap.put("name", "Nnamdi");
        myMap.put("name", "Caven");
        myMap.put("name", "Shege");
        myMap.put("name", "Yeekpa");
    }
}
