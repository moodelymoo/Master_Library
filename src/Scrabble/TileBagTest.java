package Scrabble;

import Scrabble.Logic.TileBag;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TileBagTest {

    @Test
    void newBag(){
        TileBag tileBag = new TileBag();
        tileBag.newBag();
        Assertions.assertEquals(100, tileBag.bagSize());
    }

    @Test
    void shuffleBag() {
        TileBag tileBag = new TileBag();
        TileBag original = new TileBag();
        original.newBag();
        tileBag.newBag();
        tileBag.shuffleBag();
        Assertions.assertNotSame(original.getBag(), tileBag.getBag());
    }

    @Test
    void drawTile() {
        TileBag tileBag = new TileBag();
        tileBag.newBag();
        int original = tileBag.bagSize();
        tileBag.drawTile();
        Assertions.assertEquals(original - 1, tileBag.bagSize());
    }


}