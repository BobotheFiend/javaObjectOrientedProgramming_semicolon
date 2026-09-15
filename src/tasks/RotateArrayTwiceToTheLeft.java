package tasks;
import java.util.Arrays;

public class RotateArrayTwiceToTheLeft {

    public static int [] rotatedArray(int shift, int [] collection){

        int [] result = new int [collection.length];
        int startOver = 0;
        for(int count = 0; count < collection.length; count++){
            int increment = count + shift;
            if(increment >= collection.length){
                result[count] = collection[startOver++];
            }
            else {
                result[count] = collection[increment];
            }

        }
        return result;
    }
}
