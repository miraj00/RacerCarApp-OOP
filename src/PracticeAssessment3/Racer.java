package PracticeAssessment3;

public abstract class Racer {

	protected String team;
	protected int speed;
	
	public abstract void accelerate();
	public abstract boolean isFuelEmpty();

	public Racer(String team, int speed) {
		super();
		this.team = team;
		this.speed = speed;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	// Add a public getter only.
	public int getSpeed() {
		return speed;
	}

}