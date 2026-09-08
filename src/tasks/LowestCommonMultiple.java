package tasks;

import java.util.Arrays;

public class LowestCommonMultiple {

    public static int lcm(int [] collection) {

        int result = 1;
        boolean dividing = true;
        int [] output = collection;
        int divisor;
        System.out.println( "Numbers to Divide: " + Arrays.toString(output));

        while(dividing) {

            int count = 0;
            divisor = changeDivisor(output);
            System.out.println("Divisors: " + divisor);

            int[] newOutPut = new int[collection.length];
            for (int number : output) {
                int remainder = number / divisor;
                if ((number % divisor) != 0) newOutPut[count] = number;
                else newOutPut[count] = remainder;
                count++;
            }

            result = result * divisor;
            output = newOutPut;
            System.out.println("Current division: " + Arrays.toString(output));

            if (allOutputAreOne(output)) dividing = false;
        }
        return result;
    }

    private static boolean allOutputAreOne(int[] collection) {
        for (int number : collection) if (number != 1) return false;
        return true;
    }

    private static boolean outputIsStale(int[] output, int[] previousResult) {

        for (int count = 0; count < previousResult.length; count++) {
            if (previousResult[count] != output[count]) return false;
        }
        return true;
    }

    private static int changeDivisor(int[] collection) {
        int [] output = new int[collection.length];
        int count = 0;
        int divisor = 2;
        int newDivisor = divisor;

        for (int number : collection) {
            int dividing = number / divisor;
            if ((number % divisor) != 0) output[count] = number;
            else output[count] = dividing;
            count++;
        }

        boolean outPutIsSame = outputIsStale(output, collection);
        if (outPutIsSame) {
            int lowest = Integer.MAX_VALUE;
            for (int number : output) {
                if (number < lowest  && number > 1) lowest = number;
            }
            newDivisor = lowest;
        }
        return newDivisor;
    }

    
}
