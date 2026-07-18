package diaryApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DiariesTest {

    Diaries myDiaries ;
    @BeforeEach
    public void setUp(){
        myDiaries = new Diaries();
    }

    @Test
    public void createDiaryList_checkThatSizeIs0Test(){

        assertEquals(0, myDiaries.getSize());
    }

    @Test
    public void createDiaryList_addADiary_sizeIs1Test(){
        myDiaries.add("NNAmdi", "4758");
        assertEquals(1, myDiaries.getSize());
    }

    @Test
    public void createDiaries_addDiary_sizeIs1Test(){
        myDiaries.add("Nnamdi", "3445");
        assertEquals(1, myDiaries.getSize());
    }
    @Test
    public void createDiaries_add2Diary_findSecondDiaryTest(){
        myDiaries.add("NNAmdi", "4758");
        myDiaries.add("Wammadi", "7758");

        assertEquals(2, myDiaries.getSize());

        Diary foundDiary = myDiaries.findByUsername("NNAmdi");
        assertEquals("NNAmdi", foundDiary.getUsername());

    }
    @Test
    public void add3Diary_deleteSecondDiary_diariesSizeIs2_findRemovedDiaryThrowsErrorTest(){
        myDiaries.add("NNAmdi", "4758");
        myDiaries.add("Wammadi", "7758");
        myDiaries.add("Hanu", "3999");

        assertEquals(3, myDiaries.getSize());

        myDiaries.delete("Wammadi", "7758");

        assertEquals(2, myDiaries.getSize());
        assertThrows(IllegalArgumentException.class, ()-> myDiaries.findByUsername("Wammadi"));

    }

    @Test
    public void diariesIsEmpty_deleteDiary_throwsErrorTest(){
        assertThrows(IllegalArgumentException.class, ()-> myDiaries.findByUsername("NNAmdi"));
    }
}