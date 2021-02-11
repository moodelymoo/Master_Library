package Scrabble.GameRuntime;

import Scrabble.Dictionary.DictionaryController;
import Scrabble.Logic.GameObjects.Board;
import Scrabble.Logic.GameObjects.Exceptions.InvalidFileFormatException;
import Scrabble.Logic.GameObjects.Exceptions.WordNotFoundException;
import Scrabble.Logic.GameObjects.Player;
import Scrabble.Logic.GameObjects.TileBag;
import Scrabble.Logic.GameObjects.Tiles;
import Scrabble.Logic.WordChecker;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GameStateController {
    private static final Logger LOGGER = Logger.getLogger(GameStateController.class.getName());
    private final List<Player> players = new ArrayList<>();
    private final Board board = new Board();
    private TileBag tileBag = new TileBag();
    private boolean gameOver = false;
    private final DictionaryController dictionaryController =
            new DictionaryController("src/Scrabble/Dictionary/Dictionary.txt");

    public GameStateController() {

        playerDefaultSetup();
        try {
            dictionaryController.importDictionary();
        } catch (IOException | InvalidFileFormatException e) {
            LOGGER.log(Level.SEVERE, e.toString(), e);
        }


        // setup
        // assume default setup worked as intended (add error checking and support for non-default params)


        while (!gameOver) {
            // game loop (round)
            // check for exit conditions
            // if found -> break
            // else -> ignore section


            // turn
            for (int i = 0; i < players.size(); i++) {
                // check no prior challenge turn skip applied
                checkGameOver();

                // p1 turn
                // must play tiles
                List<Tiles> play = players.get(i).play();
                LOGGER.log(Level.FINE, MessageFormat.format("word size: {0}, word: {1}", play.size(), Arrays.toString(play.toArray())));
                awaitPlay();

                // p2 can challenge
                boolean challenge = awaitChallenge();

                // if no challenge -> refill hand
                if (!challenge) {
                    // pass the tile bag to the hand filler, needs to get back the tile bag
                    // once the tiles drawn are removed

                    LOGGER.log(Level.FINER, MessageFormat.format("{0} tiles in bag before player {1}''s play",
                            tileBag.getBag().size(), i+1));
                    tileBag = players.get(i).fillHand(tileBag);
                    LOGGER.log(Level.FINER, "{0} tiles in bag at the end of turn", tileBag.getBag().size());

                }
                // else -> check word
                else {
                    try {
                        // if word exists -> skip p2 turn
                        if (new WordChecker().check(dictionaryController.getDictionary(), "temp")) {
                            //TODO imp, skip turn of appropriate player
                            System.out.println("stopping annoying empty body warnings, if");
                        }
                        // else -> remove tiles from board to p1 hand
                        else {
                            //TODO imp, returning the tiles from the board to the hand
                            System.out.println("stopping annoying empty body warnings, else");
                        }
                    } catch (WordNotFoundException e) {
                        LOGGER.log(Level.SEVERE, e.toString(), e);
                    }
                }

                //LOGGER.log(Level.SEVERE, MessageFormat.format("moving from player {0}''s turn to player {1}''s " +
                //"turn", i + 1,i+2>players.size() ? i+1 <= players.size() : i+2, i+2 - players.size()));

                //TODO make this work with more than 2 players/comment it out as its only logging
                int p1;
                int p2;
                p1 = i + 1;
                if (i + 2 <= players.size()) {
                    p2 = i + 2;
                } else {
                    p2 = i + 2 - players.size();
                }
                LOGGER.log(Level.FINER, MessageFormat.format("moving from player {0} to player {1}", p1, p2));

                // go to turn start and increment player e.g. p1 -> p2 ect...

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // round loop -> exit condition, no available play/ no tiles available in turn player's hand
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void awaitPlay() {
        //TODO imp, create a waiting state for the game whilst the player is thinking, should break out when focused
        // player makes a move and confirms it as final. Must only allow a play if the tiles required are in the hand

    }

    private boolean awaitChallenge() {
        //TODO imp, should wait for a set length of time or the other players click a dont want to challenge button.
        // Should then return true if a word challenge has been issued by any player, else return false
        return false;
    }

    private void checkGameOver() {
        //TODO imp, add game over conditions and pass appropriate params to do so
        this.gameOver = false;
    }


    private void playerDefaultSetup() {
        //TODO imp, make it pull player setup from param for testing/
        this.players.add(new Player("player1name"));
        this.players.add(new Player("player2name"));
        LOGGER.log(Level.FINE, "{0} players in game", players.size());

        players.get(0).fillHand(tileBag);
        players.get(1).fillHand(tileBag);
    }
}
