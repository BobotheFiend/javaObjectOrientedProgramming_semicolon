package tasks;

public class SudokuBoard {


    private String [][] board;

    private StringBuilder currentValidNumbers = new StringBuilder();
    private String [] validNumbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
    private boolean isCubeValid;



    public void board(String [][] input){
        board = input;
    }


    public  boolean isValid(){
        return isRowValid() && isColumnValid() && isCubeValid();
    }

    public boolean isCubeValid() {
        this.isCubeValid = true;
        currentValidNumbers.setLength(0);

        for(int count = 0; count <= board.length-3; count+=3){

            int counter = 1;
            for(int innerCount = 0; innerCount < board.length; innerCount++){
                String cubeUp = board[count][innerCount];
                String cubeMid = board[count+1][innerCount];
                String cubeLow = board[count+2][innerCount];

                validate3x3(cubeUp);
                validate3x3(cubeMid);
                validate3x3(cubeLow);

                if(!isCubeValid){
                    currentValidNumbers.setLength(0);
                    return false;
                }

                if(counter % 3  == 0){
                    currentValidNumbers.setLength(0);
                }
                counter++;
            }

            currentValidNumbers.setLength(0);
        }

        return true;
    }

    public boolean isColumnValid() {

        for(int count = 0; count < board.length; count++){

            for(int innerCount = 0; innerCount < board.length; innerCount++ ){
                String number = board[innerCount][count];

                if (number.isEmpty()) continue;

                if(currentValidNumbers.indexOf(number) != -1){
                    currentValidNumbers.setLength(0);
                    return false;
                }

                digitAppearance(number);
            }
            currentValidNumbers.setLength(0);
        }

        return true;
    }

    public boolean isRowValid(){
        for (String [] row : this.board){
            for(String number : row){
                if (number.isEmpty()) continue;

                if(currentValidNumbers.indexOf(number) != -1){
                    currentValidNumbers.setLength(0);
                    return false;
                }

                digitAppearance(number);

            }

            currentValidNumbers.setLength(0);
        }
        return true;
    }

    private void digitAppearance(String input){
        for(String number : validNumbers){
            if(input.equals(number)) currentValidNumbers.append(number);
        }
    }

    private void validate3x3(String input){
        if(input.isEmpty()) return;
        if(currentValidNumbers.indexOf(input) != -1) isCubeValid = false;
        else {
            for (String number : validNumbers) {
                if (input.equals(number)) {
                    currentValidNumbers.append(number);
                }
            }
        }
    }

}
