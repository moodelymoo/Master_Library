package Scrabble;

import Scrabble.Logic.TileBag;

public class TestingSpace {
    public static void main(String[] args) {
        TileBag tileBag = new TileBag();
        tileBag.newBag();
        tileBag.shuffleBag();

        System.out.println(tileBag.bagSize());
        System.out.println(tileBag.drawTile());
        System.out.println(tileBag.bagSize());
    }
}
