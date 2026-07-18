package diaryApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {

    Diary myDiary;
    @BeforeEach
    public void setUp(){
        //when
        myDiary = new Diary("Himothy", "easy");
    }

    @Test
    public void createMyDiary_diaryIsLockedTest(){
        //Check that
        assertTrue(myDiary.isLocked());
    }
    @Test
    public void inputPassword_diaryUnlocksTest(){
        //When
        myDiary.unlockDiary("easy");

        //Check that
        assertFalse(myDiary.isLocked());
    }


    @Test
    public void createDiary_unlockDiary_lockItTest(){
        //When
        myDiary.unlockDiary("easy");
        assertFalse(myDiary.isLocked());

        //Check That
        myDiary.lockDiary();
        assertTrue(myDiary.isLocked());
    }

    @Test
    public void unlockDiary_inputIncorrectPassword_throwsError_DiaryRemainsLockedTest(){
        //When
        assertThrows(IllegalArgumentException.class, ()-> myDiary.unlockDiary("HArd"));

        //Check That
        assertTrue(myDiary.isLocked());
    }

    @Test
    public void unlockDiary_createEntry_entryIsNotEmptyTest(){
        myDiary.unlockDiary("easy");

        myDiary.createEntry("title", "body");

        assertFalse(myDiary.isEmpty());
    }

    @Test
    public void unlockDiary_create2Entry_findFirstEntryTest(){
        myDiary.unlockDiary("easy");

        Entry first = myDiary.createEntry("My Genesis", "I was Born as Large As Elephant, as Strong as A SilverBack as quiet as a Lamb ");
        myDiary.createEntry("My Revelations", "...although I always thought myself to be the strongest, i now see that strength doesnt equate power..silly me");

        assertEquals(myDiary.findEntry(1), first);
    }

    @Test
    public void unlockDiary_createAnEntry_lockDiary_findEntry_throwsErrorTest(){
        myDiary.unlockDiary("easy");

        Entry first = myDiary.createEntry("My Genesis", "I was Born as Large As Elephant, as Strong as A SilverBack as quiet as a Lamb ");

        myDiary.lockDiary();

        assertThrows(IllegalArgumentException.class, ()-> myDiary.findEntry(1));
    }

    @Test
    public void unlockDiary_createAnEntry_removeEntry_entrySizeIs0Test(){
        myDiary.unlockDiary("easy");

        Entry first = myDiary.createEntry("My Genesis", "I was Born as Large As Elephant, as Strong as A SilverBack as quiet as a Lamb ");

        myDiary.deleteEntry(1);

        assertEquals(myDiary.entrySize(), 0);
    }

    @Test
    public void unlockDiary_create2Entry_updateFirstEntry_checkThatEntrySizeIs2AndCheckThatEntryIsUpdatedTest(){
        myDiary.unlockDiary("easy");

        Entry first = myDiary.createEntry("My Genesis", "I was Born as Large As Elephant, as Strong as A SilverBack as quiet as a Lamb ");
        myDiary.createEntry("My Revelations", "...although I always thought myself to be the strongest, i now see that strength doesnt equate power..silly me");

        myDiary.updateEntry(1, "Updated My Genesis", "I Lied in my Story");

        assertEquals(2, myDiary.entrySize());
        assertEquals(first, myDiary.findEntry(1));
    }

}