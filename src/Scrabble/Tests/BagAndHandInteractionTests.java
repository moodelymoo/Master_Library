import Scrabble.Logic.Player.Hand;
import Scrabble.Logic.TileBag;
import jdk.jfr.Description;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BagAndHandInteractionTests {


    @BeforeAll
    static void setup(){
        TileBag tileBag = new TileBag();
        tileBag.newBag();
        Hand hand = new Hand();

    }


    @Test
    @Description("add one tile from the bag to the hand, making sure that the bag removes the " +
            "correct tile and the hand gains the correct tile")
    void addOneTileFromBagToHand(){

    }

}
