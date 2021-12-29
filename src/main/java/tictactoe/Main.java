// this will contain the code executed when the program is ran
// prompts allowing the user to choose game modes, action flow, etc.
// this will function as a script that directs the functionality of the other files

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // board setup
        System.out.println("Welcome to tictactoe_java");
        Game newGame = new Game();
        
        // player setup
        newGame.scanPlayerName(true);
        newGame.scanPlayerName(false);
        System.out.println(newGame.getPlayerName(true) + " vs " + newGame.getPlayerName(false));

        // gameplay
        while (newGame.getChangeLog().size() < 9 && Intelligence.checkWin(newGame.getBoard()) == 0) {
            newGame.playRandom();
            newGame.positionIsValid();
        }

        // end of game
        if (Intelligence.checkWin(newGame.getBoard()) == 0) {
            System.out.println("Congratulations both players! This game is a tie");
        } else if (Intelligence.checkWin(newGame.getBoard()) == 1) {
            System.out.println("Congratulations " + newGame.getPlayerName(true) + " for winning this game!");
        } else if (Intelligence.checkWin(newGame.getBoard()) == -1) {
            System.out.println("Congratulations " + newGame.getPlayerName(false) + " for winning this game!");
        } else {
            System.out.println("End of game error");
        }
    }
}
