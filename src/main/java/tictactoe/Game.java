import java.util.List;
import java.util.ArrayList;


// this is the class for a single game
// intelligence algorithms will analyze positions
// this will have some extra info
    // keeping track of previous moves
    // going back and forth between players
    // enforcing rules
    // will contain the functions for random, intelligent, and pvp modes

public class Game extends Position {
    // state
        // changelog contains order of moves, who made each move inferred by order, and location of moves
        // list would be easiest
    public List<Integer> changeLog = new ArrayList<>(); // begins empty
    // int of how many times a player's undone a move
    public int takebackX = 0; // x goes first
    public int takebackO = 0;
    public String playernameX; // until initialized, is empty ""
    public String playername0;
    
    Game(int[] setboard) {
        super(setboard); // new Game instance should have all data from Position and state above
        int[] newBoard = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        this.setBoard(newBoard);
    }

    public void setPiece(int location) {
        // ! exception for incorrect piece placement here
        this.board[location] = this.turn();
    }

    public boolean isValid() {
        int index = 0; // checks if X and O have a valid number of squares on the board
        for (int squares : this.board) {
            index += squares;
        }
        if (index != 0 && index != 1) {
            return false;
        }
        if (this.board.length != 9) { // checks if board is correct size
            return false;
        }
        return true;
    }



}