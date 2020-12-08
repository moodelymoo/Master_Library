package Scrabble.Logic;

import Scrabble.Logic.GameObjects.Exceptions.WordNotFoundException;

public class WordChecker {
    //TODO imp, this should check any words placed on the board when the "submit?" button is pressed

    public WordChecker() {
        //placeholder
    }

    public boolean check(String word)throws WordNotFoundException {
        // TODO fix this to return something generated correctly instead of the current placeholder
        if (word.contains("c")){
            return true;
        }
        else{
            throw new WordNotFoundException(word + "is not in the scrabble dictionary");
        }

    }
}
