package predictor;

public class Predictor {

	public Predictor() {
	}

	public Boolean check(int plate, String date, Time time ){
		int length = String.valueOf(plate).length();
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