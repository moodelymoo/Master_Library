package Scrabble.Logic.GameObjects.Exceptions;

public class InvalidFileFormatException extends Exception{
    public InvalidFileFormatException() {
    }

    public InvalidFileFormatException(String message) {
        super(message);
    }

    public InvalidFileFormatException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidFileFormatException(Throwable cause) {
        super(cause);
    }

    public InvalidFileFormatException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
