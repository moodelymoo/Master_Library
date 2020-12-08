import Scrabble.Dictionary.DictionaryController;
import Scrabble.Logic.GameObjects.Exceptions.EmptyFileException;
import Scrabble.Logic.GameObjects.Hand;
import Scrabble.Logic.GameObjects.TileBag;
import Scrabble.Logic.GameObjects.Tiles;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.io.IOException;


public class GameTests {


    @BeforeEach
    void setup() {

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
    void scoreMultiplierBoardLayoutTest() {
        Assertions.fail();
    }

    @Test
    void numberOfTilesInBagIs100Test() {
        Assertions.fail();
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
    void testFirstWordInDictionary() {
        Assertions.fail();
        // first word should be AA
    }

    @Test
    void testFifthWordInDictionary() {
        DictionaryController dictionaryController =
                new DictionaryController("src/Scrabble/Dictionary/Dictionary.txt");
        try {
            dictionaryController.importDictionary();
        } catch (IOException | EmptyFileException | NullPointerException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(dictionaryController.getDictionary().get(i));
        }
        //        Assertions.fail();
        // AAHS is fifth word
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
