import Scrabble.Dictionary.DictionaryController;
import Scrabble.Logic.GameObjects.Board;
import Scrabble.Logic.GameObjects.Exceptions.EmptyFileException;
import Scrabble.Logic.GameObjects.Exceptions.WordNotFoundException;
import Scrabble.Logic.GameObjects.TileBag;
import Scrabble.Logic.WordChecker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.Arrays;


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
        Board board = new Board();
        System.out.println("Expecting 15 x 15 board, fails if not those dims");
        // TODO add custom board size support in testing
        Assertions.assertEquals("[15, 15]", Arrays.toString(board.getBoardDims()));
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
    void checkWordAgainstDictionaryPassTest() throws WordNotFoundException {
        WordChecker wordChecker = new WordChecker();
        Assertions.assertTrue(wordChecker.check(dictionaryController.getDictionary(), "banana"));
    }

    @Test
    void checkWordAgainstDictionaryFailTest() {
        WordChecker wordChecker = new WordChecker();
        System.out.println("testing word that is not in the dictionary throws word not found error");
        Assertions.assertThrows(WordNotFoundException.class,
                () -> wordChecker.check(dictionaryController.getDictionary(), "kjhbasdlhiujfsdalihjf"));
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
    void incorrectDictionaryFileHeaderFormatTest() throws IOException, EmptyFileException {
        System.out.println("tests if the dictionary file has the correct header formatting or is empty");
        DictionaryController dictionaryController = new DictionaryController(
                "src/Scrabble/Tests/TestResources/EmptyDictionary.txt");
        Assertions.assertThrows(EmptyFileException.class, dictionaryController::importDictionary);
    }

    @Test
    void noPathSetForDictionaryFileExceptionTest() {
        DictionaryController dictionaryController = new DictionaryController("null");
        System.out.println("check if exception thrown when a bad path is given");
        Assertions.assertThrows(NoSuchFileException.class, dictionaryController::importDictionary);
    }

    @Test
    void dictionaryTypeSanitizationTest() {
        System.out.println("make sure that the dictionary file is single words separated by a newline");
        //TODO imp, not super needed as of right now
        Assertions.fail();
    }
}
