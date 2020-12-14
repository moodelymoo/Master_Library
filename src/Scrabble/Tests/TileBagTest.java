import Scrabble.Logic.GameObjects.TileBag;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TileBagTest {


    @Test
    void testNewBag() {
        TileBag tileBag = new TileBag();
        tileBag.newBag();
        Assertions.assertEquals(100, tileBag.size());
    }

    @Test
    void testShuffleBag() {
        TileBag tileBag = new TileBag();
        TileBag original = new TileBag();
        original.newBag();
        tileBag.newBag();
        tileBag.shuffleBag();
        Assertions.assertNotSame(original.getBag(), tileBag.getBag());
    }

    @Test
    void testDrawTile() {
        TileBag tileBag = new TileBag();
        tileBag.newBag();
        int original = tileBag.size();
        tileBag.drawTile();
        Assertions.assertEquals(original - 1, tileBag.size());
    }
}
