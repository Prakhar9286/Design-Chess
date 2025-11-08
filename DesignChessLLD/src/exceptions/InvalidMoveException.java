package exceptions;

public class InvalidMoveException extends Exception {
    public InvalidMoveException() {
        super("The move you are trying to execute is invalid. Please try another move.");
    }
}
