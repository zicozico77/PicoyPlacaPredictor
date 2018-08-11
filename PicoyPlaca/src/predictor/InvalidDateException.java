package predictor;
@SuppressWarnings("serial")
public class InvalidDateException extends RuntimeException{
	
    public InvalidDateException() {
        super();
    }

    public InvalidDateException(String s) {
        super(s);
    }
}
