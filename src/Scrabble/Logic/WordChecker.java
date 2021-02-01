package Scrabble.Logic;

import Scrabble.Logic.GameObjects.Exceptions.WordNotFoundException;
import java.util.List;

public class WordChecker {
    //TODO imp, this should check any words placed on the board when the "submit?" button is pressed

    public WordChecker(){}

    public boolean check(List<String> dictionary, String word)throws WordNotFoundException {
        // TODO fix this to return something generated correctly instead of the current placeholder
        if (dictionary.contains(word.toUpperCase())){
            return true;
        }
        else{
            throw new WordNotFoundException(word + " is not in the scrabble dictionary");
        }

    }
}
