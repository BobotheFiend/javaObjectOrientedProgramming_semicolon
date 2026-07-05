package projects;

public class MovieRatingSystem {

    private String movie;
    private int count;

    public boolean isEmpty(){
        return count == 0;
    }

    public void addMovie(String movieTitle){
        movie = movieTitle;
        count++;
    }

    public int size(){
        return count;
    }
}
