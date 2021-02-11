package Scrabble.GameRuntime;

import Scrabble.Logic.GameObjects.Board;
import Scrabble.Logic.GameObjects.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GameStateController {
    private static final Logger LOGGER = Logger.getLogger( GameStateController.class.getName());
    private final List<Player> players = new ArrayList<>();
    private final Board board = new Board();
    private boolean gameOver = false;

    public GameStateController() {

        playerDefaultSetup();

        // setup
        // assume default setup worked as intended (add error checking and support for non-default params)


        while(!gameOver){
        // game loop (round)
            // check for exit conditions
                // if found -> break
                // else -> ignore section


        // turn
            for (int i = 0; i < players.size(); i++){
            // check no prior challenge turn skip applied
                checkGameOver();

            // p1 turn
            // must play tiles
                players.get(i).play();
                awaitPlay();
            // p2 can challenge

                // if no challenge -> refill hand
                // else -> check word

                    // if word exists -> skip p2 turn
                    // else -> remove tiles from board to p1 hand

        // go to turn start and increment player e.g. p1 -> p2 ect...



        // round loop -> exit condition, no available play/ no tiles available in turn player's hand
            }
        }
    }

    private void awaitPlay() {

    }

    private void checkGameOver() {
        //TODO add actual game over conditions and pass appropriate params to do so
        this.gameOver = false;
    }


    private void playerDefaultSetup() {
        this.players.add(new Player("player1name"));
        this.players.add(new Player("player2name"));
        LOGGER.log(Level.FINE, "{0} players in game", players.size());
    }
}
