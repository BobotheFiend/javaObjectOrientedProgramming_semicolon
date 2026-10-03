package tasks;

public class AddDigits {

    public static int add(int number){
        int result = 0;

        String input = number + "";

        if (input.length() == 1 ) return number;
        if(input.length() > 7) return number;

        String start = "yes";
        boolean solving = start.equals(start);

        while(solving){
            int sum = 0;
            int count = 0;
            int counter = 1;

            while (input.length() >= counter){
                String num = Character.toString(input.charAt(count++));
                sum += Integer.parseInt(num);
                counter++;
            }

            input = sum + "";

            if(input.length() == 1){
                result = sum;
                solving = false;
            }
        }

        return result;

    }
}
