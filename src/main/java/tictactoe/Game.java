import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


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
    public int takeBackX = 0; // x goes first
    public int takeBackO = 0;
    public String playerNameX; // until initialized, is empty ""
    public String playerName0;
    
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

    public void setPlayerNameX() {
        try (Scanner playerNameScannerX = new Scanner(System.in)) {
            System.out.println("Player 1 enter name");

            String playerNameX = playerNameScannerX.nextLine();  // Read user input
            System.out.println(playerNameX + " will place the X's");  // Output user input
        }
    }

    public void setPlayerNameY() {
        try (Scanner playerNameScannerO = new Scanner(System.in)) {
            System.out.println("Player 2 enter name");

            String playerNameO = playerNameScannerO.nextLine();  // Read user input
            System.out.println(playerNameO + " will place the O's");  // Output user input
        }
    }

}