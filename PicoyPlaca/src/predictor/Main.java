package predictor;

public class Main {

	public static void main(String[] args) {
		int licensePlate = Integer.parseInt(args[0]);
		String date = args[1];
		Time time = new Time(Integer.parseInt(args[2]),
					Integer.parseInt(args[3]),
					Integer.parseInt(args[4]))
		Predictor checker = new Predictor;
		if(checker.check(licensePlate, date, time)) {
			System.out.print("Car can transit safely");
		} else {
			System.out.print("Car can not transit currently due to Pico y Placa");
		}
				
	}

}
