package hugeInteger;


import java.math.BigInteger;


public class HugeInteger {

    private int [] array;
    private int userInputLength;
    private String holdUserInput;



    public HugeInteger() {
        this.array = new int [40];
    }


    public void parse(String number){
        validateInput(number);
        userInputLength = number.length();
        holdUserInput = number;
        int endOftheArray = array.length-1;
        for(int count=0;count<number.length();count++) {
            int digit = Character.getNumericValue(number.charAt(count));
            array[endOftheArray--] = digit;
        }
    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        int counter = this.array.length-1;
        for(int count=0;count<userInputLength;count++){
            result.append(this.array[counter--]);
        }
        return result.toString();
    }

    public HugeInteger add(HugeInteger input){

        validateInput(input.toString());

        HugeInteger result = new HugeInteger();
        StringBuilder summation = new StringBuilder();

        int sum;
        int carryover = 0;

        String top = getArrayToString();
        String bottom = input.getArrayToString();

        int lengthOfTheSum;

        if(isGreaterThanOrEqualTo(input))lengthOfTheSum = length();
        else lengthOfTheSum = input.length();

        int increament = 1;

        for(int count = array.length-1; count >= 0; count--) {
            int leftSide = Character.getNumericValue(top.charAt(count));
            int rightSide = Character.getNumericValue(bottom.charAt(count));

            if(carryover == 0 && leftSide == 0 && rightSide == 0 && increament > lengthOfTheSum) break;
            increament++;

            if (carryover != 0) {
                sum = leftSide + rightSide + carryover;
                carryover = 0;
            } else sum = leftSide + rightSide;

            String sumOutCome = "" + sum;

            if (sumOutCome.length() > 1) {
                sum = Character.getNumericValue(sumOutCome.charAt(1));
                carryover = Character.getNumericValue(sumOutCome.charAt(0));
            }
            summation.append(sum);


        }
        if(summation.length() > 40 && carryover != 0) throw new IllegalArgumentException("Summation Failed, Length broken!!");
        summation.reverse();
        result.parse(summation.toString());
        return result;
    }


    public HugeInteger subtract(){
        HugeInteger result = new HugeInteger();

        return result;
    }

    public String getArrayToString() {
        StringBuilder result = new StringBuilder();
        int counter =  array.length - userInputLength - 1;
        int start =  array.length-1;
        for(int count= 0; count < array.length;count++){
            if(count > counter) result.append(array[start--]);
            else result.append(array[count]);
        }
        return result.toString();
    }
    public boolean isEquals(HugeInteger input){
        return toString().equals(input.toString());
    }

    public boolean isNotEquals(HugeInteger input){
        return !toString().equals(input.toString());
    }

    public boolean isGreaterThan(HugeInteger  input){
        int length = input.length();

        if (userInputLength > length) return true;

        if (userInputLength == length){

            for(int count=0; count < userInputLength; count++){
                if (toString().charAt(count) > input.toString().charAt(count)) return true;
            }
        }

        return false;
    }

    public boolean isLessThan(HugeInteger input){
        int length = input.length();

        if (userInputLength < length) return true;

        if (userInputLength == length){

            for(int count=0; count < userInputLength; count++){
                if (toString().charAt(count) < input.toString().charAt(count)) return true;
            }
        }

        return false;
    }

    public boolean isGreaterThanOrEqualTo(HugeInteger input){
        return isGreaterThan(input) || isEquals(input);
    }

    public boolean  isLessThanOrEqualTo(HugeInteger input){
        return isLessThan(input) || isEquals(input);
    }

    public boolean isZero(){
        for(int element : this.array) if (element != 0) return false;
        return true;
        }

    public int length() {
        return userInputLength;
    }

    private void validateInput(String input){
        String cleanInput = input.replace(" ", "");

        if (input.length() > 40) throw new IllegalArgumentException("HugeInteger Number too Large!!");
        for(int count=0;count<cleanInput.length();count++) {
            if (!Character.isDigit(cleanInput.charAt(count))) throw new IllegalArgumentException("Input Must be Numbers!!");
        }
    }


}