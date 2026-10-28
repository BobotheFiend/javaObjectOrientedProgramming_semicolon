package tasks;

public class ShortestWordInSentence {

    public static String shortestWord(String input){
        String cleanInput = input.trim();
        cleanInput = cleanInput.replaceAll("[^a-zA-Z ]", "");
        String [] words = cleanInput.split(" ");

        String result = cleanInput;
        for (String word : words){
            if(word.matches("[a-zA-z]+") && (word.length() < result.length())) result = word;
            }
        return result;
    }
}
