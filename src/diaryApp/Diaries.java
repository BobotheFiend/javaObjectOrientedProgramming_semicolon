package diaryApp;

import java.util.ArrayList;
import java.util.List;

public class Diaries {
    private List<Diary> diaries;
    private Diary holdDiary;

    public Diaries(){
        this.diaries = new ArrayList<>();
    }


    public int getSize() {
        return diaries.size();
    }

    public void add(String userName, String password ) {
        Diary myDiary = new Diary(userName, password);
        this.diaries.add(myDiary);
    }


    public Diary findByUsername(String userName) {
        checkThatListIsNotEmpty();
        return getDiary(userName);
    }

    public void delete(String userName, String password){
        checkThatListIsNotEmpty();
        validatePassword(password, userName);
        Diary foundDiary = findByUsername(userName);
        diaries.remove(foundDiary);
    }

    private void checkThatListIsNotEmpty(){
        boolean listIsEmpty = getSize() == 0;
        if(listIsEmpty)
            throw new IllegalArgumentException("Diary Is Empty");
    }
    

    private Diary getDiary(String userName){
        String username = validateUsername(userName);
        for (Diary theDiary : diaries){
            if(username.equals(theDiary.getUsername().toLowerCase())) {
                return theDiary;
            }
        }
        throw new IllegalArgumentException("Diary Not Found!!!");
    }

    private String validateUsername(String userName){
        return userName.toLowerCase();
    }

    private void validatePassword(String password, String userName){
        Diary theDiary = findByUsername(userName);
        boolean thePasswordIsIncorrect = ! password.equals(theDiary.getPassword());
        if(thePasswordIsIncorrect)
            throw new IllegalArgumentException("The Password Is Incorrect");
    }
}
