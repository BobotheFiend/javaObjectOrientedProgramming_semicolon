package tasks;

public class CodeWar {

    public static int [] collections(int [] collection){

        for(int count = 0; count < collection.length-1; count+=2){
            int summedElements = collection[count] + collection[count+1];
            if(summedElements % 2 != 0){
                int temp = collection[count];
                collection[count] = collection[count+1];
                collection[count+1] = temp;
            }
        }
        return collection;
    }
}
