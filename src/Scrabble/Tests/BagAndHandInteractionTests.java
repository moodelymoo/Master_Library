import Scrabble.Logic.GameObjects.Hand;
import Scrabble.Logic.GameObjects.TileBag;
import Scrabble.Logic.GameObjects.Tiles;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.ArrayList;
import java.util.List;


public class BagAndHandInteractionTests {


    Hand hand = new Hand();
    TileBag tileBag = new TileBag();

    @BeforeEach
    void resetObjects() {
        this.hand = new Hand();
        this.tileBag = new TileBag();
    }

    @Test
    void addOneTileFromBagToEmptyHand() {
        hand.addTile(Tiles.A);
        Hand tmp = hand;
        TileBag tmpBag = tileBag;
        tmpBag.drawTile();
        hand.addTile(tileBag.drawTile());
        Assertions.assertEquals(tmp, hand);
        Assertions.assertEquals(tmpBag, tileBag);
    }

    @Test
    void addOneTileFromBagToFullHand() {
        List<Tiles> list;
        list = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            list.add(Tiles.A);
        }
        this.hand.setHand(list);
        Assertions.assertEquals(list, hand.getHand());
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> hand.addTile(Tiles.A));
    }

    @Test
    void addOneTileFromBagToHandWithSixTiles() {
        List<Tiles> list;
        list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            list.add(Tiles.A);
        }
        this.hand.setHand(list);
        Assertions.assertDoesNotThrow(() -> hand.addTile(Tiles.A));
    }

}
