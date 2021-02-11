package Scrabble.Logic.GameObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Player {
    private final String name;
    private Hand hand;
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

    public String getHand() {
        return hand.getHand().toString();
    }

    public List<Tiles> play() {
        //TODO imp actual tile play and waiting here
        System.out.println("Still a pass return of some dummy tiles");
        return new ArrayList<>(Arrays.asList(Tiles.A, Tiles.T, Tiles.E));
    }
}
