package tasks;

import java.util.Arrays;

public class SquareOfNumbersInAscending {

    public static int [] square(int [] collection){

        int count = 0;
        for(int number : collection){
            collection[count++] = number*number;
        }
        sortedAsc(collection);
        return collection;
    }

    private static int [] sortedAsc(int [] collection){
        for(int count = 0; count < collection.length; count++){

            for(int inner = count+1; inner < collection.length; inner++){
                if(collection[count] > collection[inner]){
                    collection[count] = collection[count] + collection[inner];
                    collection[inner] = collection[count] - collection[inner];
                    collection[count] = collection[count] - collection[inner];
                }
            }
        }
        return collection;
    }
}
