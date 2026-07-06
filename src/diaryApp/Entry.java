package diaryApp;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Entry {
    private int id;
    private String title;
    private String body;
    private String day;

    public Entry(int id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.day = formatDateTime();
    }

    private String formatDateTime(){
        LocalDateTime day = LocalDateTime.now();
        DateTimeFormatter formatDayAndTime = DateTimeFormatter.ofPattern("EEEE, dd-MMM-yyyy  hh:mm a");
        return day.format(formatDayAndTime);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}