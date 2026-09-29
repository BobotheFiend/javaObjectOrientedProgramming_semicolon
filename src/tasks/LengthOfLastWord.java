package tasks;

public class LengthOfLastWord {

    public static int lastWordLenght(String input) {
        int result;
        StringBuilder reverseInput = new StringBuilder();
        reverseInput.append(input.trim());
        reverseInput.reverse();

        String letter = Character.toString(reverseInput.charAt(0));
        String aSpace = " ";
        int counter = 0;

        while (!letter.equals(aSpace)) {
            counter++;
            letter = Character.toString(reverseInput.charAt(counter));
        }
        result = counter;

        return result;
    }

}