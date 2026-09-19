package tasks;

import java.util.ArrayList;

public class HighestOccurenceOfNumberSequence {

    public static int mostSequentialOccurence(int [] collection) {

        int result  = 0;
        int variableRememberer;

        validateInput(collection, result);


        for(int count = 0; count < collection.length; count++){
            int counter = 1;
            variableRememberer = collection[count];

            for(int innerCount = count + 1; innerCount < collection.length; innerCount++){
                int nextNumber = collection[innerCount];
                ++variableRememberer;

                if(nextNumber != variableRememberer){
                    break;
                }

                counter++;

            }
            if(counter > result) result = counter;
        }
        return result;
    }


    public static int usingLinearSearch(int [] collection) {

        int result = 1;
        int counter = 1;
        int variableRememberer;

        validateInput(collection, result);

        for(int count = 1; count < collection.length; count++){
            variableRememberer = collection[count - 1] + 1;
            int currentNumber = collection[count];

            if(currentNumber != variableRememberer){
                counter = 1;
            }
            else ++counter;

            if(counter > result) result = counter;
        }
        return result;
    }

    private static int validateInput(int [] collection, int result) {
        if(collection.length < 1 || collection == null) result = 0;
        return result;
    }
}
