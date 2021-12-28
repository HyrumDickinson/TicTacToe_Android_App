public class Position {

    // class state
    public int[] board = new int[9];

    // setter
    Position(int[] setBoard) {
        board = setBoard;
    }

    public void setBoard(int[] input) { 
        if (input.length != 9) {
            throw new IllegalArgumentException("Board must contain 9 squares");
        }
        board = input;
    }
    public int[] getBoard() {
        return board;
    }

    public int turn() { // returns the player who is to move in the current position
        int index = 0;
        for (int space : this.board) {
            index += space;
        }
        if (index == 0) { // equal numbers of pieces on the board; it's first player's move
            return 1;
        } else {
            return -1;
        }
    }
    
    public int evaluation() {
        return Intelligence.evaluation(this.board);
    }
}