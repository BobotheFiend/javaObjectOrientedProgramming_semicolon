package tasks;

public class SecondHighestNumber {

    public static int secondHighestNumber(int[] collection) {

        int highestNumber = Integer.MIN_VALUE;
        int secondHighestNumber = Integer.MIN_VALUE;

        for (int number : collection) {
            if (number > highestNumber) {
                secondHighestNumber = highestNumber;
                highestNumber = number;
            }

            else if (number > secondHighestNumber && number != highestNumber) {
                secondHighestNumber = number;
            }


            System.out.println(highestNumber + " " + secondHighestNumber);
        }
        return secondHighestNumber;
    }
}
