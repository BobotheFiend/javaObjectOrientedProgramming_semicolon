package tasks;

public class LongestValidParentheses {

    static String REGEX = "^[()]$";

    public static int consecutiveStreak(String input){
        if(input.isEmpty()) return 0;
        String newInput = input.replace("()", "2");
        String replacement = newInput.replace("(", "").replace(")", "");
        return replacement.length()*2;
    }


}
