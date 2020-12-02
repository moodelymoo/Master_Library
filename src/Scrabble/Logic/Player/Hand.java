package Scrabble.Logic.Player;

import Scrabble.Logic.Tiles;
import java.util.List;

public class Hand {
    private static final int MAX_HAND_SIZE = 7;
    private List<Tiles> hand;

    public Hand() {

    }

    public void addTile(Tiles tile){
        // check size of hand, if hand < 7, allow add
        if(this.hand.size() >= MAX_HAND_SIZE){
           this.hand.add(takeOneTileFromBag());
        }

    }

    public void removeTile(Tiles tile){

    }

    public List<Tiles> getHand() {
        return hand;
    }

    public void setHand(List<Tiles> hand) {
        this.hand = hand;
    }

    public Tiles takeOneTileFromBag(){
        return null;
    }
}
