package diaryApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DiaryTest {

    @Test
    public void createMyDiary_diaryIsLockedTest(){
        Diary myDiary = new Diary("Himothy", "easy");

        assertTrue(myDiary.isLocked());
    }
}
