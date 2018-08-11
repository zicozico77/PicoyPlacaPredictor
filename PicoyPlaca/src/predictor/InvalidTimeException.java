package predictor;

@SuppressWarnings("serial")
public class InvalidTimeException extends RuntimeException {

    public InvalidTimeException() {
        super();
    }

    public InvalidTimeException(String s) {
        super(s);
    }
}
