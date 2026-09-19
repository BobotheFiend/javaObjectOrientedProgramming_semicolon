package tasks;

import java.util.ArrayList;

public class HighestOccurenceOfNumberSequence {

    public static int mostSequentialOccurence(int [] collection) {

        int result  = 0;

        int variableRememberer;

        for(int count = 0; count < collection.length; count++){
            int counter = 1;
            variableRememberer = collection[count];

            for(int innerCount = count + 1; innerCount < collection.length; innerCount++){
                int nextNumber = collection[innerCount];
                if(nextNumber != ++variableRememberer){
                    break;
                }
                counter++;

            }
            if(counter > result) result = counter;
        }
        return result;
    }
}
