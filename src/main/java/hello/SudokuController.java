package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import hello.SudokuBoard;

import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class SudokuController {

    @RequestMapping("/sudoku")
    public String solve(@RequestParam(value="sudoku_board", required=true) String[] inputArray) {
        String breakpoint = "breakpoint";

        SudokuBoard GameSpace = new SudokuBoard(inputArray);
        return "This has been a test of the emergency broadcast system!" ;
    }
}

