package diaryApp;

import java.util.ArrayList;
import java.util.List;

public class Diary {

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
        return true;
    }
}
