package predictor;


/**
 * Time object that provides getters and setters for time parameters.
 */
public class Time {
	
	//instance variable for time parameters
	private int timeHours;
	private int timeMinutes;
	private int timeSeconds;
	
	/**
	 * Constructor for the time object
	 */
	public Time(int hours, int minutes, int seconds)
			throws InvalidTimeException {
		if (hours < 0 || hours >= 24 || minutes < 0 || minutes > 60 || 
				seconds < 0 || seconds > 60) {
			throw new InvalidTimeException("time is not valid");
		}
		timeHours = hours;
		timeMinutes = minutes;
		timeSeconds = seconds;
		
	}
	
	/**
	 * getter for hours in the time object
	 */
	public int getHours(){
		return timeHours;
	}
	
	/**
	 * getter for minutes in the time object
	 */
	public int getMinutes() {
		return timeMinutes;
	}
	
	/**
	 * getter for seconds in the time object
	 */
	public int getSeconds() {
		return timeSeconds;
	}
	
	/**
	 * setter for hours in the time object
	 */
	public void setHours(int hours) {
		timeHours = hours;
	}
	
	/**
	 * setter for minutes in the time object
	 */
	public void setMinutes(int minutes) {
		timeMinutes = minutes;
	}
	
	/**
	 * setter for seconds in the time object
	 */
	public void setSeconds(int seconds) {
		timeSeconds = seconds;
	}
	
}

