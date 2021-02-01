package Scrabble.Logic.GameObjects;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private static final int MAX_HAND_SIZE = 7;
    private List<Tiles> hand = new ArrayList<>();

    public Hand() {

    }

    public void addTile(Tiles tile) throws IndexOutOfBoundsException {
        // check size of hand, if hand < 7, allow add
        if (this.hand.size() < MAX_HAND_SIZE) {
            this.hand.add(tile);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public void removeTile(Tiles tile) {
        hand.remove(tile);
    }

    public List<Tiles> getHand() {
        return hand;
    }

    public void setHand(List<Tiles> hand) {
        this.hand = hand;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "hand=" + hand +
                '}';
    }
}
