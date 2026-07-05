package projects;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MovieRatingSystemTest {

    MovieRatingSystem myMovieList;
    @BeforeEach
    public void setUp(){
        //Given
        myMovieList = new MovieRatingSystem();
    }
    @Test
    public void thatICreateMyRatings_checkThatMyMovieListIsEmptyTest(){
        //check that
        assertTrue(myMovieList.isEmpty());
    }

    @Test
    public void addItemToMyMovieLists_checkThatMyMovieListisNotEmptyTest(){
        //When
        myMovieList.addMovie("Dune");

        //Check That
        assertFalse(myMovieList.isEmpty());
    }

    @Test
    public void add2MoviesInMyMovieList_checkThatTheSizeOfTheListIs2Test(){
        //When
        myMovieList.addMovie("The Fat One");
        myMovieList.addMovie("The Slim One");

        //Check That
        assertEquals(2, myMovieList.size());
    }

//    @Test
//    public void add()
}
