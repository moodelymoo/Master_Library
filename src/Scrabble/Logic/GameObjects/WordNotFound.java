package Scrabble.Logic.GameObjects;

public class WordNotFound extends Exception{
    public WordNotFound() {
    }

    public WordNotFound(String message) {
        super(message);
    }

    public WordNotFound(String message, Throwable cause) {
        super(message, cause);
    }

    public WordNotFound(Throwable cause) {
        super(cause);
    }

    public WordNotFound(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
