package tasks;

import java.util.Arrays;

public class ArraySwap {

    public static void main(String... args) {

        int[] collection = {5,1,2,7,6,3};
        int[] result = swap(collection);
        System.out.println(java.util.Arrays.toString(result));

    }

    public static int[] swap(int[] collection) {


        int[] result = new int[collection.length];
        int[] sorted = sorted(collection);
        int start = 0;
        int end = sorted.length - 1;
        for (int count = 0; count < sorted.length; count+=2) {

            result[count] = sorted[start];
            result[count + 1] = sorted[end];

            start++;
            end--;
        }
        return result;
    }


    public static int[] sorted(int[] collection) {

int[] result = new int[collection.length];

        for (int count = 0; count < collection.length; count++) {

            for (int secondCount = count+1; secondCount < collection.length; secondCount++) {

                if (collection[count] < collection[secondCount]) {
                    int temp = collection[count];
                    collection[count] = collection[secondCount];
                    collection[secondCount] = temp;
                }
            }
            result[count] = collection[count];
        }


        System.out.println("collection = " + Arrays.toString(collection));
        System.out.println("result = " + Arrays.toString(result));
        return result;

    }

}

