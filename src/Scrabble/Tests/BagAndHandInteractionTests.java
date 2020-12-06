import Scrabble.Logic.GameObjects.Hand;
import Scrabble.Logic.GameObjects.TileBag;
import Scrabble.Logic.GameObjects.Tiles;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class BagAndHandInteractionTests {

    Hand hand = new Hand();
    TileBag tileBag = new TileBag();

    @Test
    void addOneTileFromBagToHand(){
            hand.addTile(Tiles.A);
            System.out.println(hand.toString());
            Hand tmp = hand;
            hand.addTile(tileBag.drawTile());
            Assertions.assertEquals(tmp, hand);
    }

}
