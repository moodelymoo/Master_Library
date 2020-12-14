import Scrabble.Dictionary.DictionaryController;
import Scrabble.Logic.GameObjects.Board;
import Scrabble.Logic.GameObjects.Exceptions.EmptyFileException;
import Scrabble.Logic.GameObjects.Hand;
import Scrabble.Logic.GameObjects.TileBag;
import Scrabble.Logic.GameObjects.Tiles;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.awt.event.HierarchyBoundsAdapter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.StreamSupport;


public class GameTests {

    DictionaryController newDefaultDictionary(){
        DictionaryController dictionaryController =
                new DictionaryController("src/Scrabble/Dictionary/Dictionary.txt");
        try {
            dictionaryController.importDictionary();
        } catch (IOException | EmptyFileException | NullPointerException e) {
            e.printStackTrace();
        }
        return dictionaryController;
    }

    DictionaryController dictionaryController;

    @BeforeEach
    void setup() {
       this.dictionaryController = newDefaultDictionary();
    }

    @Test
    void changeTurnTest() {
        Assertions.fail();
    }

    @Test
    void newGameSetupTest() {
        Assertions.fail();
    }

    @Test
    void boardDimTest() {
        Assertions.fail();
    }

    @Test
    void boardOutTest() {
        Board board = new Board();
        System.out.println(board.toString());
    }

    @Test
    void scoreMultiplierBoardLayoutTest() {
        Assertions.fail();
    }

    @Test
    void numberOfTilesInBagIs100Test() {
        TileBag tileBag = new TileBag();
        Assertions.assertEquals(100, tileBag.size());
    }

    @Test
    void autoRefillHandOnChangeTurnTest() {
        Assertions.fail();
    }

    @Test
    void checkWordAgainstDictionaryPassTest() {
        Assertions.fail();
    }

    @Test
    void checkWordAgainstDictionaryFailTest() {
        Assertions.fail();
    }

    @Test
    void testFirstWordInDictionaryExists() {
        Assertions.assertEquals("AA", dictionaryController.getDictionary().get(0));
        // first word should be AA
    }

    @Test
    void testFifthWordInDictionaryExists() {
        Assertions.assertEquals("AAHS", dictionaryController.getDictionary().get(4));
    }

    @Test
    void emptyDictionaryFileExceptionTest() {
        Assertions.fail();
    }

    @Test
    void noPathSetForDictionaryFileExceptionTest() {
        Assertions.fail();
    }

    @Test
    void badPathSetForDictionaryFileExceptionTest() {
        Assertions.fail();
    }

    @Test
    void dictionaryTypeSanitizationTest() {
        Assertions.fail();
    }
}
