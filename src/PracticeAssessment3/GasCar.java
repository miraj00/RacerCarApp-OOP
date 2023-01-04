package PracticeAssessment3;

public class GasCar extends Racer {
	private int fuel;

	public GasCar(String team, int fuel) {
		super(team, 0);
		this.fuel = fuel;
	}

	public GasCar(String team) {
		super(team, 0);
		this.fuel = 10;
	}

	@Override
	public void accelerate() {
		this.speed += 2;
		this.fuel--;
	}

	@Override
	public boolean isFuelEmpty() {
		return fuel <= 0;
	}

	public int getFuel() {
		return fuel;
	}

	public void setFuel(int fuel) {
		this.fuel = fuel;
	}

}