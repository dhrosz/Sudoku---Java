package hello;

import java.util.ArrayList;
import java.util.List;

class SudokuBoard {
    static private SudokuCell[][] board = new SudokuCell[9][9];
    private LexicalEnvironment[] squares, rows, colums;

    SudokuBoard(String[] inputArray) {
        setBoard(inputArray);
        String Breakpoint = "break";
    }

    private void setBoard(String[] inputArray) {
        int iterator = 0;
        for(int row=0; row<9; row++){
            for (int col=0; col<9; col++) {
                if (inputArray[iterator] != "") {
                    board[row][col] = new SudokuCell(Integer.parseInt(inputArray[iterator]), row, col);
                }
                else {
                    board[row][col] = new SudokuCell(0, row, col);
                }
                iterator++;
            }
        }
    }

    private void buildEnvironments() {
        for (int x=9; x<9; x++) {
            LexicalEnvironment le = new LexicalEnvironment();
        }
    }
}

class SudokuCell {
    private int x, y, value;
    private Candidates candidates;

    {candidates = new Candidates();}

    public SudokuCell() {
        super();
    }

    public SudokuCell(int value, int x, int y) {
        this();
        this.value = value;
        this.x = x;
        this.y = y;
    }

    public void setValue(int value) {
       this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}

class Candidates {
    private int [] candidates;

    Candidates() {
        candidates = new int[9];
    }

    public void update() {

    }

    public int[] getCandidates(){
        return candidates;
    }
}

class EnvironmentFactory {

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
