public class Position {

    public int[] board = new int[9];
    public int turn;
    public int evaluation;

    Position(int topLeft,    int topCenter,    int topRight, 
             int middleLeft, int middleCenter, int middleRight, 
             int bottomLeft, int bottomCenter, int bottomRight) {
        this.board = [topLeft, topCenter, topRight, middleLeft, middleCenter, middleRight, bottomLeft, bottomCenter, bottomRight];
    }
    public int[] setBoard() {

    }
    public int[] getBoard() {
        return this.board;
    }
    public int getTurn() {
        this.computeTurn();
        return this.turn;
    }
    public int getEvaluation() {
        this.computeEvaluation();
        return this.evaluation;
    }

    private int computeTurn(this.board) {
        ;
        return this.turn;
    }
    private int computeEvaluation(this.board) {
        ;
        return this.evaluation;
    }

}