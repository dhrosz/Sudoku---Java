package hello;

import java.util.ArrayList;
import java.util.List;

enum {

        }
class SudokuBoard {
    private int[][] board = new int[9][9];
    private LexicalEnvironment[] squares, rows, colums;

    SudokuBoard(String[] inputArray) {
        String Breakpoint = "break";
    }

    private void setBoard(String[] inputArray) {
        int iterator = 0;
        for(int row=0; row<9; row++){
            for (int col=0; col<9; col++) {
                if (inputArray[iterator] != "") {
                    board[row][col] = Integer.parseInt(inputArray[iterator]);
                }
                iterator++;
            }
        }
    }

    private void setEnvironments() {

    }
}

interface LexicalEnvironmentStrategy {
    boolean Possesses(int value);
}

class BoardSqaure implements LexicalEnvironmentStrategy {
    public boolean Possesses(int value) {
        return false;
    }
}

class BoardColumn implements LexicalEnvironmentStrategy {
    public boolean Possesses(int value) {
        return false;
    }
}

class BoardRow implements LexicalEnvironmentStrategy {
    public boolean Possesses(int value) {
        return false;
    }
}

class LexicalEnvironment {
    private int[] space;
    private LexicalEnvironmentStrategy strategy;

    public LexicalEnvironment() {
        space = new int[9];
    }

    public void setStrategy(LexicalEnvironmentStrategy strategy) {
        this.strategy = strategy;
    }
}
