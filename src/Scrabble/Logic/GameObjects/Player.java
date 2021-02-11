package Scrabble.Logic.GameObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Player {
    private final String name;
    private final Hand hand = new Hand();
    private int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;

    }

    public void addToScore(int score){
        this.score = this.score + score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public Hand getHand() {
        return this.hand;
    }

    public TileBag fillHand(TileBag tileBag){
        for (int i = this.hand.getHand().size(); i < this.hand.getMaxHandSize(); i++){
            this.hand.addTile(tileBag.drawTile());
        }
        return tileBag;
    }


    public List<Tiles> play() {
        //TODO imp, actual tile play and waiting here, remove the dummy code that fakes
        // picking tiles and removing from the hand
        this.hand.getHand().remove(0);
        this.hand.getHand().remove(0);
        this.hand.getHand().remove(0);

        return new ArrayList<>(Arrays.asList(Tiles.A, Tiles.T, Tiles.E));
    }
}
