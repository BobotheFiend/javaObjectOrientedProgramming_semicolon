package tasks;

import java.lang.reflect.Array;

public class Conversion {

    public static int conversion(int number, int currentBase, int convertedBase){

//        if(currentBase > number) throw new IllegalArgumentException("Current base is less than number");

        int numberInBaseTen = convertToBase10(number,currentBase);

        int specifiedBase = convertToBaseSpecifiedBase(numberInBaseTen, convertedBase);
        return specifiedBase;

    }

    public static int convertToBase10(int number, int base){

        String convertToString = number + "";
        int remainder = 0;
        int countFromBehind = convertToString.length()-1;

        for(int count = 0; count < convertToString.length(); count++){


            int numberToMultiply = (int)Math.pow(base,count);
            int getDigits = Integer.parseInt(convertToString.charAt(countFromBehind)+"");
            int totalNumber = numberToMultiply * getDigits;
            System.out.printf("%d x %d = %d%n",numberToMultiply, getDigits, totalNumber);
            remainder += totalNumber;
            System.out.println(remainder);
            countFromBehind = countFromBehind - 1;
            System.out.println(countFromBehind);
        }

        return  remainder;
    }

    private static int convertToBaseSpecifiedBase(int number, int base){
        int remainder = 0;

        StringBuilder  numberToAdd = new StringBuilder();
        while(number > 0){

            remainder = number % base;
            String converter = remainder + "";
            numberToAdd.append(converter);
            number = number/base;
        }
        return Integer.parseInt(numberToAdd.reverse().toString());
    }
}
