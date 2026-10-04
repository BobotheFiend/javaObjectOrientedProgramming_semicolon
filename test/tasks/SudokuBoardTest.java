package tasks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SudokuBoardTest {

    SudokuBoard sudoku;

    @BeforeEach
    public void setUp(){
        sudoku = new SudokuBoard();
    }

    @Test
    public void rowsHaveValidInput_isValidTest(){
        String [][] board = {
                {"", "", "1", "2", "9", "5", "8", "4", "6"},
                {"2", "3", "5", "", "9", "", "", "", "8"},
                {"", "", "", "2", "9", "5", "", "1", "6"},
                {"", "5", "", "2", "1", "", "", "", "7"},
                {"", "", "", "2", "9", "3", "", "4", ""},
                {"3", "1", "4", "7", "9", "5", "8", "6", "2"},
                {"9", "", "", "2", "9", "", "4", "7", ""},
                {"3", "", "", "2", "9", "", "", "1", ""},
                {"", "1", "", "2", "", "4", "", "3", "6"}
        };
        sudoku.addToBoard(board);

        assertTrue(sudoku.isRowValid());
    }

    @Test
    public void rowsHaveInvalidInput_isValidFalseTest(){
        String [][] board = {
                {"", "", "4", "2", "9", "5", "8", "4", "6"},
                {"2", "3", "5", "", "9", "", "", "", "8"},
                {"", "", "", "2", "9", "5", "", "1", "6"},
                {"", "5", "", "2", "1", "", "", "", "7"},
                {"", "", "", "2", "9", "3", "", "4", ""},
                {"3", "1", "4", "7", "9", "5", "8", "6", "2"},
                {"9", "", "", "2", "9", "", "4", "7", ""},
                {"3", "", "", "2", "9", "", "", "1", ""},
                {"", "1", "", "2", "", "4", "", "3", "6"}
        };
        sudoku.addToBoard(board);

        assertFalse(sudoku.isRowValid());
    }
}