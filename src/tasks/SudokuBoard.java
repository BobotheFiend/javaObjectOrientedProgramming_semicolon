package tasks;

import java.util.InputMismatchException;

public class SudokuBoard {


    private String [][] board = {
            {"", "", "", "", "", "", "", "", ""},
            {"", "", "", "", "", "", "", "", ""},
            {"", "", "", "", "", "", "", "", ""},
            {"", "", "", "", "", "", "", "", ""},
            {"", "", "", "", "", "", "", "", ""},
            {"", "", "", "", "", "", "", "", ""},
            {"", "", "", "", "", "", "", "", ""},
            {"", "", "", "", "", "", "", "", ""},
            {"", "", "", "", "", "", "", "", ""}
    };

    private StringBuilder currentValidNumbers = new StringBuilder();
    private String [] validNumbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
    private boolean isRowValid;
    private boolean isColumnValid;
    private boolean isCubeValid;



    public void addToBoard(String [][] input){
        board = input;
    }
    public  boolean isValid(){
        isRowValid();
        return true;
    }

    public boolean isRowValid(){
        for (String [] row : this.board){
            for(String number : row){
                if(currentValidNumbers.indexOf(number) != -1){
                    this.isRowValid = false;
                    return false;
                }
                digitAppearance(number);

            }

        }
        return true;
    }

    private void digitAppearance(String input){
        int counter = 0;
        for(String number : validNumbers){
            if(input.equals(number)){
                counter++;
                currentValidNumbers.append(number);
            }
        }

    }
}
