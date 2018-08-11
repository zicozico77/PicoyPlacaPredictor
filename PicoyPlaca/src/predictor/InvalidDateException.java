package predictor;

/**
 * An exception that is thrown to indicate an invalid date parameter that does not have a day name.
 */
@SuppressWarnings("serial")
public class InvalidDateException extends RuntimeException{
	
    public InvalidDateException() {
        super();
    }

    public InvalidDateException(String s) {
        super(s);
    }
}
