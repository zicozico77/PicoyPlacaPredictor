package predictor;

/**
 * An exception that is thrown to indicate an invalid time parameter.
 */
@SuppressWarnings("serial")
public class InvalidTimeException extends RuntimeException {

    public InvalidTimeException() {
        super();
    }

    public InvalidTimeException(String s) {
        super(s);
    }
}
