package tasks;

import java.util.Stack;

public class ReverseSubString {

    public static String reverseTheString(String input){

        String cleanInput = input.trim();
        StringBuilder result = new StringBuilder();

        String openingParenthesis = "(";
        String closingParenthesis = ")";

        StringBuilder remember = new StringBuilder();

//        Stack<StringBuilder> holdTheChars = new Stack<>();

        int totalParenthesis = countTotalParenthesis(cleanInput, openingParenthesis, closingParenthesis);

        int openingParenthesisCount = 0;
        int closingParenthesisCount = 0;


        int counter = 1;
        int count = 0;


        while(totalParenthesis != (openingParenthesisCount + closingParenthesisCount)){

            String letter = Character.toString(cleanInput.charAt(count++));

            if (letter.equals(openingParenthesis)) ++openingParenthesisCount;

            else if (letter.equals(closingParenthesis)){
                result.append(remember);
                remember = new StringBuilder();
                closingParenthesisCount++;
            }
            else remember.append(letter);

            if (openingParenthesisCount > counter){
                counter++;
                int inner = 0;
                result.append(remember);
                remember = new StringBuilder();

                while (inner<=0){
                    System.out.println(count + "  c is = ");
                    letter = Character.toString(cleanInput.charAt(count++));
                    if(letter.equals(closingParenthesis) || letter.equals(openingParenthesis)) ++inner;
                    else remember.append(letter);
                }

                if(letter.equals(closingParenthesis)){
                    result.append(remember.reverse());
                    remember = new StringBuilder();
                }
                count-=1;

                System.out.println("real count = " + count);
            }
            System.out.println(remember);
            System.out.println(result);

        }


        result.reverse();
        return result.toString();
    }

    private static int countTotalParenthesis(String input, String leftPara, String rightPara){
        int result = 0;
        for(int count = 0; count < input.length(); count++){
            String element = Character.toString(input.charAt(count));

            if (element.equals(leftPara) || element.equals(rightPara)) result++;
        }
        return result;
    }


//    public static String reverseAnotherWay(String input){
//        String cleanInput = input.trim();
//        StringBuilder result = new StringBuilder();
//
//        String openingParenthesis = "(";
//        String closingParenthesis = ")";
//
//        StringBuilder remember = new StringBuilder();
//
//        int openingParenthesisCount = 0;
//
//
//        int totalParenthesis = countTotalParenthesis(cleanInput, openingParenthesis, closingParenthesis);
//
//        int counter = 1;
//        int count = 0;
//
//
//        int totalClosingParenthesis = parenthesisAppearance(totalParenthesis);
//
//        while (openingParenthesisCount<totalClosingParenthesis){
//            String letter = Character.toString(cleanInput.charAt(count++));
//
//            if (letter.equals(openingParenthesis)) ++openingParenthesisCount;
//            else remember.append(letter);
//        }
//
//    }


    private static int parenthesisAppearance(int input){
        return input/2;
    }

}
