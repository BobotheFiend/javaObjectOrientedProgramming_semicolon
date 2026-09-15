package tasks;

public class Testing {

    public static void main(String[] args) {

        int number = 100;
        int div = 2;
        StringBuilder  numberToAdd = new StringBuilder();
        int test = 0;
        while(number > 0){

            test = number % div;
            String toString = test + "";
            numberToAdd.append(toString);
            System.out.println(" o=o " +number + " / " + test + " jjj " + numberToAdd );
            number /= div;
        }

        System.out.println(Integer.parseInt(numberToAdd.reverse().toString()));
    }
}
