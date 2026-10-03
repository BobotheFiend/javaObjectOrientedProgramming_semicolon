package tasks;

import java.time.LocalTime;
import java.util.Locale;

public class TimeConversion {

    public static String convert(String input){

        String cleanInput  = input.trim();

        String am = "am";


        StringBuilder result = new StringBuilder();
        String letter = "";

        int count = 1;

        if(cleanInput.contains(am) || cleanInput.contains(am.toUpperCase())) {
            String convertToTwentyFourHours = twentyFourHourFormatAM(cleanInput);
            result.append(convertToTwentyFourHours);



            while(!letter.equalsIgnoreCase("a")){
                result.append(letter);
                letter = Character.toString(cleanInput.charAt(++count));

            }

            return result.toString();
        }

        String convertToTwentyFourHours = twentyFourHourFormatPM(cleanInput);
        result.append(convertToTwentyFourHours);

        while(!letter.equalsIgnoreCase("p")){
            result.append(letter);
            letter = Character.toString(cleanInput.charAt(++count));

        }

        return result.toString();
    }

    private static String twentyFourHourFormatAM(String s){
        String input  = Character.toString(s.charAt(0)) + Character.toString(s.charAt(1));

        if(input.equals("12"))  input  = "00";

        return input;
    }

    private static String twentyFourHourFormatPM(String s){
        String input  = Character.toString(s.charAt(0)) + Character.toString(s.charAt(1));

        switch(input){
            case "01" -> input = "13";
            case "02" -> input =  "14";
            case "03" -> input = "15";
            case "04" -> input = "16";
            case "05" -> input = "17";
            case "06" -> input  = "18";
            case "07" -> input = "19";
            case "08" -> input = "20";
            case "09" -> input  = "21";
            case "10" -> input = "22";
            case "11" -> input  = "23";
        }

        return input;
    }
}

