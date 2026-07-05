package chapterEight;

public class Time {
    private int hour;
    private int minutes;
    private int seconds;

    public Time(int hour, int minutes, int seconds){
        validateTime(hour, minutes, seconds);
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    private void validateTime(int hour, int minutes, int seconds){
        validateHour(hour);
        validateMinutes(minutes);
        validateSeconds(seconds);
    }
    private void validateHour(int hour){
        if (hour < 0 || hour > 11)
            throw new IllegalArgumentException("Invalid Hour mark");
    }

    private void validateMinutes(int minutes){
        if(minutes < 0 || minutes > 60)
            throw new IllegalArgumentException("Invalid Minutes Mark");
    }

    private void validateSeconds(int seconds){
        if (seconds < 0 || seconds > 60)
            throw new IllegalArgumentException("Invalid Seconds Mark");
    }
}
