package turtleChapter7;

import java.util.Arrays;

public class TurtlePosition {

    private int row;
    private int column;
    private int [][] board;

//    public TurtlePosition(int row, int column) {
//        board = new int [row][column];
//        this.row = row;
//        this.column = column;
//    }

    public int getRowPosition() {
        return row;
    }

    public int getColumnPosition() {
        return column;
    }

    public void increaseColumnBy(int step) {
        this.column += step;
    }
    public void setRow(int row) {
        this.row = row;
    }

    public String toString() {
        return String.format("[%d,%d]", row, column);
    }

    public void increaseRowBy(int step) {
        this.row += step;
    }

//    public String getBoard() {
//        return java.util.Arrays.deepToString(board);
//    }
//
//    public String toString() {
//        StringBuilder s = new StringBuilder();
//        for(int[] rows : board){
//            s.append(String.format("%20s",""));
//            for(int columns : rows){
//                s.append(String.format("%-5d",columns));
//            }
//            s.append("\n");
//        }
//        return s.toString();
//    }
}