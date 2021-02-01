package Scrabble.Logic.GameObjects;

import Scrabble.Dictionary.DictionaryController;
import Scrabble.Logic.GameObjects.Exceptions.EmptyFileException;
import Scrabble.Logic.GameObjects.Exceptions.WordNotFoundException;
import Scrabble.Logic.WordChecker;

import java.io.IOException;
import java.util.List;

public class Scoring {
    //TODO add appropriate scoring to each tile
    //TODO add score multiplier from DW & TL and so on

    private final Board board = new Board();

    public Scoring() {
    }



    public int calculateScore(List<Tiles> tiles, List<Integer> xCoord, List<Integer> yCoord) throws EmptyFileException, IOException, WordNotFoundException {
        // check tiles + modifiers
        // by coords? then check against modifiers per tile
        // calc score
        // for the length of the list of words
        // check word is valid with wordChecker
        // this is directional, going from top to bottom, or left to right
        // (increase in x is horizontal) (increase in y is vertical) must not travel in the negative direction
        // per set of tiles from the first tile (x1 == x2 ^ y1 == y2) && (x1 < x2 ^ y1 < y2)

        System.out.println("Word is Valid in Direction: " + isWordDirectionalityValid(tiles, xCoord, yCoord));
        System.out.println("Word is in dictionary: " + isWordInDictionary(tiles));
        int score = 0;
        if (isWordDirectionalityValid(tiles, xCoord, yCoord) && isWordInDictionary(tiles)){

            for (int i = 0; i < tiles.size(); i++) {
                // normal tile
                // double letter
                // triple letter
                // double word
                // triple word
                switch (board.getBOARDAtCoordinates(xCoord.get(i), yCoord.get(i))) {
                    case "BL" -> score += tiles.get(i).getScore();
                    case "DL" -> score += 2 * tiles.get(i).getScore();
                    case "TL" -> score += 3 * tiles.get(i).getScore();
                    case "DW" -> {
                        score += tiles.get(i).getScore();
                        score = score * 2;
                    }
                    case "TW" -> {
                        score += tiles.get(i).getScore();
                        score = score * 3;
                    }
                }
            }
        }
        return score;
    }

    private boolean isWordDirectionalityValid(List<Tiles> tiles, List<Integer> xCoord, List<Integer> yCoord){
        boolean valid = false;
        int x1;
        int x2 = 0;
        int y1;
        int y2 = 0;

        for (int i = 0; i < tiles.size(); i++){
            if (i == 0){
                // pass this time
                x1 = xCoord.get(i);
                y1 = yCoord.get(i);
            }
            else {
                x1 = xCoord.get(i-1);
                y1 = yCoord.get(i-1);
                x2 = xCoord.get(i);
                y2 = yCoord.get(i);
            }
            if ((x1 == x2 ^ y1 == y2) && (x1 < x2 ^ y1 < y2)){
                valid = true;
            }
        }
        return valid;
    }

    private boolean isWordInDictionary(List<Tiles> tiles) throws IOException, EmptyFileException, WordNotFoundException {
        WordChecker wordChecker = new WordChecker();
        DictionaryController dictionaryController = new DictionaryController("src/Scrabble/Dictionary/Dictionary.txt");
        dictionaryController.importDictionary();
        StringBuilder word = new StringBuilder();

        for (Tiles tile : tiles) {
            word.append(tile);
        }

        return wordChecker.check(dictionaryController.getDictionary(), word.toString());
    }
}
