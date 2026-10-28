package tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
import static tasks.ShortestWordInSentence.shortestWord;

public class ShortestWordInSentenceTest {

    @ParameterizedTest(name = "test {index}")
    @CsvSource({
            "I am a boy who loves yam, I",
            "'What water cannot quench the Avatar, huh?', the",
            ".. Hippo .., Hippo",
            ".. ,''"
    })
    public void test(String sentence, String expected){
        assertEquals(expected, shortestWord(sentence));
    }

    @Test
    void testCanFindShortestWord(){
        String sentence = "Hippopotamus ..";
        String expected = "Hippopotamus";
        assertEquals(expected, shortestWord(sentence));
    }
}