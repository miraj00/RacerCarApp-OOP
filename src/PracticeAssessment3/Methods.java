package PracticeAssessment3;

import java.util.ArrayList;
import java.util.List;

public class Methods {

	public static List<Racer> findRacersWithEmptyFuel(List<Racer> allRacers) {
		List<Racer> result = new ArrayList<Racer>();
		for (Racer racer : allRacers) {
			if (racer.isFuelEmpty()) {
				result.add(racer);
			}
		}
		return result;
	}
	
	public static double findAverageSpeed(Racer[] racers) {
		if (racers.length == 0) {
			return 0.0;
		}
		double sum = 0;
		for (Racer racer : racers) {
			sum += racer.getSpeed();
		}
		return sum / racers.length;
	}
	
	public static Racer getFasterRacer(Racer racerA, Racer racerB) {
		if (racerA.getSpeed() > racerB.getSpeed()) {
			return racerA;
		} else if (racerB.getSpeed() > racerA.getSpeed()) {
			return racerB;
		} else {
			return null;
		}
	}
}