package diaryApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Diary {
    private int count;
    private String username;
    private String password;
    private boolean isLocked;
    private List<Entry> entries;

    public Diary(String username, String password){
        this.username = username;
        this.password = password;
        this.isLocked = true;
        this.entries = new ArrayList<>();
    }


    public boolean isLocked() {
        return this.isLocked;
    }

    public void unlockDiary(String password) {
        validatePassword(password);
        this.isLocked = false;
    }

    public void lockDiary(){
        this.isLocked = true;
    }

    private void validatePassword(String password){
        boolean passwordIsIncorrect = !this.password.equals(password);
        if(passwordIsIncorrect) throw new IllegalArgumentException("Incorrect Password!!");
    }

    public Entry createEntry(String title, String body) {
        validateThatDiaryIsUnLocked();
        int idNumber = generateId();
        Entry newPage = new Entry(idNumber, title, body);
        entries.add(newPage);
        return newPage;
    }

    private int generateId(){
        ++count;
        return count;

    }

    private void validateThatDiaryIsUnLocked(){
        boolean diaryIsLocked = this.isLocked == true;
        if(diaryIsLocked) throw new IllegalArgumentException("Unlock The Diary!!");
    }
    public boolean isEmpty() {
        return entries.size() == 0;
    }

    public Entry findEntry(int entryId) {
        validateThatDiaryIsUnLocked();
        for (Entry myEntry : this.entries){
            if (myEntry.getId() == entryId)
                return myEntry;
        }
        throw new IllegalArgumentException("Error 404: Entry not found");
    }
    public void deleteEntry(int entryId){
        validateThatDiaryIsUnLocked();
        Entry myEntry = findEntry(entryId);
        entries.remove(myEntry);
    }
    public int entrySize(){
        return this.entries.size();
    }

    public void updateEntry(int entryId, String title, String body){
        validateThatDiaryIsUnLocked();
        Entry myEntry = findEntry(entryId);
        myEntry.setTitle(title);
        myEntry.setBody(body);

    }

    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
}
