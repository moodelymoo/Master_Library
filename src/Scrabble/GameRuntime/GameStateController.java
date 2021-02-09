package Scrabble.GameRuntime;

import Scrabble.Logic.GameObjects.Player;

public class GameStateController {

    public GameStateController() {

        Player[] players;

        // setup

        // assume default setup worked as intended (add error checking and support for non-default params)

        // game loop (round)
            // check for exit conditions
                // if found -> break
                // else -> ignore section

        // turn
            // check no prior challenge turn skip applied

            // p1 turn
            // must play tiles

            // p2 can challenge

                // if no challenge -> refill hand
                // else -> check word

                    // if word exists -> skip p2 turn
                    // else -> remove tiles from board to p1 hand

        // go to turn start and increment player e.g. p1 -> p2 ect...

        // round loop -> exit condition, no available play/ no tiles available in turn player's hand
    }
}
