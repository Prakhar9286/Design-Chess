package exceptions;

public class InvalidGameException extends Exception {
    public InvalidGameException() {
        super("The Provided configuration for the game is not valid. Retry!!");
    }
}
