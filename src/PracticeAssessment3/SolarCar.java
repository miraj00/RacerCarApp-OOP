package PracticeAssessment3;

public class SolarCar extends Racer {
	public SolarCar(String team) {
		super(team, 0);
	}

	@Override
	public void accelerate() {
		this.speed++;
	}

	@Override
	public boolean isFuelEmpty() {
		return false;
	}
}