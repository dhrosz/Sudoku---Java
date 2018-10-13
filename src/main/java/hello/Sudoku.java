package hello;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SudokuController {

    @RequestMapping("/sudoku");
    public Greeting solve(@RequestParam(value="board", defaultValue='NULL') int[] board) {
        String break = '';
    }
}

public class SudokuBoard {
    private integer[] board;

    public void SudokuBoard() {

    }

    private void setBoard() {

    }

    private void addBoardElement(int row, int column, int value) {

    }


}

public class LexicalRegion {
    private List region = new ArrayList();

    public void LexicalRegion(int[] region) {
        this.region = region;
    }

    private void getRegion() {
        return this.region;
    }

    private void contains(int value) {

    }

}
