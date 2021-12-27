public class Position {

    public int[] board = new int[9];

    Position(int topLeft,    int topCenter,    int topRight, 
             int middleLeft, int middleCenter, int middleRight, 
             int bottomLeft, int bottomCenter, int bottomRight) {
        this.board = [topLeft, topCenter, topRight, middleLeft, middleCenter, middleRight, bottomLeft, bottomCenter, bottomRight];
    }
    public int[] setBoard(int[9] input) {
        this.board = input;
    }
    public int[] getBoard() {
        return this.board;
    }

    private int turn(this.board) { // returns the player who is to move in the current position
        int index = 0;
        for (int space : board) {
            index += space;
        }
        if (index == 0) { // equal numbers of pieces on the board; it's first player's move
            return 1
        } else {
            return -1
        }
    }
    private int evaluation(this.board) {
        return Intelligence.evaluation(this.board);
    }

}