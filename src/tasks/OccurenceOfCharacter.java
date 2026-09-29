package tasks;

public class OccurenceOfCharacter {

    public static String occurrence(String input){
        StringBuilder result = new StringBuilder();

        String letter = Character.toString(input.charAt(0));
        int occurence = 0;

        result.append(letter);

        int count = 0;
        for (; count < input.length(); count++){

            String elements = Character.toString(input.charAt(count));


            if (!letter.equals(elements)){
                result.append(occurence);
                letter = Character.toString(input.charAt(count));
                result.append(letter);
                occurence = 0;
            }
            ++occurence;

//            System.out.println(letter + " : " + elements + " ::: " +  occurence);
        }

        result.append(occurence);

        return result.toString();
    }
}
