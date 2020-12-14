import Scrabble.Logic.GameObjects.Hand;
import Scrabble.Logic.GameObjects.Tiles;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayerHandTests {

    private Hand hand;

    @BeforeEach
    void setup() {
        this.hand = new Hand();

    }

    @Test
    void testAddTile() {
        this.hand.addTile(Tiles.A);
        ArrayList<Tiles> tmp = new ArrayList<>();
        tmp.add(Tiles.A);
        Assertions.assertEquals(tmp, hand.getHand());
    }

    @Test
    void testRemoveTile() {
        this.hand.addTile(Tiles.A);
        ArrayList<Tiles> tmp = new ArrayList<>();
        this.hand.removeTile(this.hand.getHand().get(0));
        Assertions.assertEquals(tmp, hand.getHand());
    }

    @Test
    void testGetHand() {
        ArrayList<Tiles> tmp = new ArrayList<>();
        Assertions.assertEquals(tmp, this.hand.getHand());
    }
}
