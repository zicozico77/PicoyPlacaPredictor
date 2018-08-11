package predictor;

/**
 * A predictor class that checks the Pico y Placa rules and verifies if the car can transit
 * safely or not.
 */
public class Predictor {

	/**
	 * Constructor class for the predictor class
	 */
	public Predictor() {
	}

	/**
	 * Main method that checks wheter the car can transit or not based on Pico y Placa.
	 * Takes an integer license plate, string date and Time object 
	 */
	public Boolean check(int plate, String date, Time time ){
		int length = String.valueOf(plate).length();
		// range of license plates between 5 to 3 based on research.
		if (length > 5 || length < 3) {
			throw new RuntimeException("Invalid plate number");
		}
		int digit = plate%10;
		Boolean result = true;
		switch(digit) {
		case 1:
		case 2:
			if(reduceDate(date, "Monday")){
				result = canCirculate(time);
			} 
		case 3:
		case 4:
			if(reduceDate(date, "Tuesday")){
				result = canCirculate(time);
			} 
		case 5:
		case 6:
			if(reduceDate(date, "Wednesday")) {
				result = canCirculate(time);
			} 
		case 7:
		case 8:
			if(reduceDate(date, "Thursday")) {
				result = canCirculate(time);
			} 
		case 9:
		case 0:
			if(reduceDate(date, "Friday")) {
				result = canCirculate(time);
			}
		}
		return result;
	}

	/**
	 * Method that reduces the date to check wheter the date given fits the format and wheter
	 * the date contains the day given. Takes a string date and day name. 
	 */
	public Boolean reduceDate(String date, String day)
			throws InvalidDateException{
		String dateToCheck = date.toLowerCase();
		if (!(dateToCheck.contains("monday") || dateToCheck.contains("tuesday") 
				|| dateToCheck.contains("wednesday") || dateToCheck.contains("thursday") 
				|| dateToCheck.contains("friday") || dateToCheck.contains("saturday") 
				|| dateToCheck.contains("sunday"))){
			throw new InvalidDateException("Date not valid, does not contain day");
		}
		return date.toLowerCase().contains(day.toLowerCase());
	}

	/**
	 * Method that checks wheter the car can transit based on the time of day.
	 * Takes a Time object.
	 */
	public Boolean canCirculate(Time time) {
		Boolean result = true;
		int hourToCheck = time.getHours();
		int minutesToCheck = time.getMinutes();
		if(hourToCheck >= 7 && (hourToCheck <= 9 && minutesToCheck <=30)) {
			result = false;
		} else if (hourToCheck >= 16 && (hourToCheck <= 19 && minutesToCheck <= 30)) {
			result = false;
		}
		return result;
	}

}