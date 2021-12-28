import java.util.List;
import java.util.ArrayList;


// this is the class for a single game
// intelligence algorithms will analyze positions
// this will have some extra info
    // keeping track of previous moves
    // going back and forth between players
    // enforcing rules
    // will contain the functions for random, intelligent, and pvp modes

public class Play {
    // state
        // changelog contains order of moves, who made each move inferred by order, and location of moves
        // list would be easiest
    public List<Integer> changeLog = new ArrayList<>();
    // int of how many times a player's undone a move
    public int takebackX = 0; // x goes first
    public int takebackO = 0;
    public String playernameX; // until initialized, is empty ""
    public String playername0;


}