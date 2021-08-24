package exception;

public class InvalidInputException extends IllegalArgumentException {
    public InvalidInputException(ErrorCode errorCode) {
        super(errorCode.toString());
    }
}
