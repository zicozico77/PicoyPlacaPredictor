package predictor;

public class Time {
	
	private int timeHours;
	private int timeMinutes;
	private int timeSeconds;
	
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
	
	public int getHours(){
		return timeHours;
	}
	
	public int getMinutes() {
		return timeMinutes;
	}
	
	public int getSeconds() {
		return timeSeconds;
	}
	
	public void setHours(int hours) {
		timeHours = hours;
	}
	
	public void setMinutes(int minutes) {
		timeMinutes = minutes;
	}
	
	public void setSeconds(int seconds) {
		timeSeconds = seconds;
	}
	
}

