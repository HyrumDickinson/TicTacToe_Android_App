// this class represents a single game

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Game extends Position {

    // STATE
    // changelog contains order of moves, who made each move inferred by odd/even in order, and location of moves being the actual values contained
    private List<Integer> changeLog = new ArrayList<>(); // begins empty
    // takebacks are ints counting how many times each player's undone a move
    private int[] takeBack = new int[2]; // x is first
    private String[] playerName = new String[2]; // until initialized, is empty "" - x is first
    
    // CONSTRUCTORS
    public Game(int[] setboard) {
        super(setboard); // new Game instance should have all data from Position and state above
    }
    public Game() {
        super();
    }

    // SETTERS AND GETTERS
    public void setChangeLog(List<Integer> input) {
        changeLog = input;
    }
    public List<Integer> getChangeLog() {
        return changeLog;
    }
    public void setTakeBack(boolean isPlayerX) {
        if (isPlayerX) {
            takeBack[0]++;
        } else {
            takeBack[1]++;
        }
    }
    public void setPlayerName(boolean isPlayerX, String name) {
        if (isPlayerX) {
            playerName[0] = name;
        } else {
            playerName[1] = name;
        }
    }
    public int getTakeBack(boolean isPlayerX) {
        if (isPlayerX) {
            return takeBack[0];
        } else {
            return takeBack[1];
        }
    }
    public String getPlayerName(boolean isPlayerX) {
        if (isPlayerX) {
            return playerName[0];
        } else {
            return playerName[1];
        }
    }
    // METHODS
    public void setPiece(int location) {
        if ((location < -1) || (location > 9)) {
            throw new IllegalArgumentException("location is not on the board");
          }
        if (this.getBoard()[location] != 0) {
            throw new IllegalArgumentException("location is already occupied");
        }
        this.getBoard()[location] = this.turn();
    }

    public boolean positionIsValid() {
        int index = 0; // checks if X and O have a valid number of squares on the board
        for (int squares : this.getBoard()) {
            index += squares;
        }
        if (index != 0 && index != 1) {
            return false;
        }
        if (this.getBoard().length != 9) { // checks if board is correct size
            return false;
        }
        return true;
    }

    public void scanPlayerName(boolean isPlayerX) {
        Scanner scanner = new Scanner(System.in);
            if (isPlayerX) {
                System.out.println("Player 1 enter name"); // Tell user what to input
                if (scanner.hasNextLine()) {
                    playerName[0] = scanner.nextLine();  // Read user input
                }
                System.out.println(playerName[0] + " will place the X's");  // Display user input
            } else {
                System.out.println("Player 2 enter name");
                if (scanner.hasNextLine()) {
                    playerName[1] = scanner.nextLine();  // Read user input
                }
                System.out.println(playerName[1] + " will place the O's");
            }
        scanner.close();
    }

    public void playRandom() {
        Random random = new Random(); // * random number generator
        try {
            this.setPiece(random.nextInt(10));
        } catch (Exception e) {
            this.playRandom(); // if random location is already occupied, tries again with a new random number
        }
    }

}