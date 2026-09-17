package hugeInteger;


import java.math.BigInteger;


public class HugeInteger {

    private int [] array;
    private int userInputLength;
    private String holdUserInput;



    public HugeInteger() {
        this.array = new int [40];
    }

    public String getValue(){
        return  holdUserInput;
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

    public int add(){
        return 0;
    }

    public int subtract(){
        return 0;
    }

    public boolean isEquals(HugeInteger input){
        return holdUserInput.equals(input.toString());
    }

    public boolean isNotEquals(HugeInteger input){
        return !holdUserInput.equals(input.toString());
    }

    public boolean isGreaterThan(HugeInteger  input){
        int length = input.length();

        if (userInputLength > length) return true;

        if (userInputLength == length){

            for(int count=0; count < userInputLength; count++){
                if (holdUserInput.charAt(count) > input.toString().charAt(count)) return true;
            }
        }

        return false;
    }

    public boolean isLessThan(HugeInteger input){
        int length = input.length();

        if (userInputLength < length) return true;

        if (userInputLength == length){

            for(int count=0; count < userInputLength; count++){
                if (holdUserInput.charAt(count) < input.toString().charAt(count)) return true;
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

        for(int count=0;count<cleanInput.length();count++) {
            if (!Character.isDigit(cleanInput.charAt(count))) throw new IllegalArgumentException("Input Must be Numbers!!");
        }
    }
}