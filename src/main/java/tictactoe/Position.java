public class Position {

    // class state
    public int[] board = new int[9];

    // setter
    Position(int[] setBoard) {
        board = setBoard;
    }

    public void setBoard(int[] input) { 
        assert (input.length == 9) : "board array must contain 9 elements";
        board = input;
    }
    public int[] getBoard() {
        return board;
    }

    private int turn() { // returns the player who is to move in the current position
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
    private int evaluation() {
        return Intelligence.evaluation(this.board);
    }

}