public class Intelligence {

    // evaluation helper functions
    public static int checkWin(int[] board) {
        assert (board.length == 9) : "board length must equal 9";
        if ((   board[0] == board[3] && board[0] == board[6] ||
                board[0] == board[1] && board[0] == board[2] ||
                board[0] == board[4] && board[0] == board[8]) 
            && (board[0] != 0 )) {
                return board[0];
        } else if ((board[4] == board[3] && board[4]== board[5] ||
                    board[4] == board[2] && board[4]== board[6] ||
                    board[4] == board[1] && board[4]== board[7])
                && (board[4] != 0 )) {
            return board[4];
        } else if ((board[8] == board[7] && board[8]== board[6] ||
                    board[8] == board[5] && board[8]== board[2]) 
                && (board[8] != 0 )) {
            return board[8];
        }
        return 0;
    }
    public static int checkTie(int[] board) {
        if (board[0] != 0 &&
            board[1] != 0 &&
            board[2] != 0 &&
            board[3] != 0 &&
            board[4] != 0 &&
            board[5] != 0 &&
            board[6] != 0 &&
            board[7] != 0 &&
            board[8] != 0) {
            return 0;
        }
        return -2; // dummy number for if this check fails
    }

    // function that evaluates a position
    public static int evaluation(int[] board) {
        assert (board.length == 9) : "board length must be 9";
        
        // evaluation functions

        return 5; // !delete this later
        // * return eval; // positive if first player is winning
    }

    // minimax algorithm that uses previous function recursively
    // alpha-beta algorithm inside above function once it works well

}