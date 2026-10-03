package tasks;

public class ShortestPalindromeByAppending {

    public static String makeAPalindrome(String input){
        String cleanInput  = input.trim();

        StringBuilder result = new StringBuilder();

        if(isPalindrome(cleanInput)) return cleanInput;


        boolean makingAPalindrome = true;
        int count = 0;
        StringBuilder newLetters = new StringBuilder();

        while(makingAPalindrome){
            String letter  = Character.toString(cleanInput.charAt(count++));
            newLetters.append(letter);

            String reversedCopy = new StringBuilder(newLetters).reverse().toString();
            String checkTheInput  = cleanInput + reversedCopy;

            if (isPalindrome(checkTheInput)) {
                result.append(checkTheInput);
                makingAPalindrome = false;
            }

        }

        return result.toString();
    }

    private static boolean isPalindrome(String input){
        return (input.equals(new StringBuilder(input).reverse().toString()));
    }
}
