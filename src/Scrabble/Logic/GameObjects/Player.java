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
        for (int i = 0; i < (getHand().getMaxHandSize()
                - getHand().getHand().size()); i++){
            getHand().addTile(tileBag.drawTile());
        }
        return tileBag;
    }

    public List<Tiles> play() {
        //TODO imp actual tile play and waiting here
        System.out.println("Still a pass return of some dummy tiles");
        return new ArrayList<>(Arrays.asList(Tiles.A, Tiles.T, Tiles.E));
    }
}
