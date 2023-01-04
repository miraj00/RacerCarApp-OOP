package PracticeAssessment3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GasCarTests {

	// The team and fuel fields are set from the constructor parameters.
	@Test
	void testConstructorTeamFuel() {
		GasCar car = new GasCar("Green", 3);
		assertEquals("Green", car.getTeam());
		assertEquals(3, car.getFuel());
	}

	// fuel defaults to 10, when the constructor with only team is used.
	@Test
	void testConstructorTeam() {
		GasCar car = new GasCar("Pearl");
		assertEquals("Pearl", car.getTeam());
		assertEquals(10, car.getFuel());
	}

	// The speed field starts at 0.
	@Test
	void testConstructorSpeed() {
		GasCar car = new GasCar("Ruby");
		assertEquals(0, car.getSpeed());
	}

	// Calling accelerate once brings speed to 2.
	@Test
	void testAccelerateSpeed1() {
		GasCar car = new GasCar("Silver");
		car.accelerate();
		assertEquals(2, car.getSpeed());
	}

	// Calling accelerate twice brings speed to 4.
	@Test
	void testAccelerateSpeed2() {
		GasCar car = new GasCar("Gold");
		car.accelerate();
		car.accelerate();
		assertEquals(4, car.getSpeed());
	}

	// Calling accelerate once reduces fuel by 1.
	@Test
	void testAccelerateFuel1() {
		GasCar car = new GasCar("Silver", 5);
		car.accelerate();
		assertEquals(4, car.getFuel());
	}

	// Calling accelerate twice reduces fuel by 2.
	@Test
	void testAccelerateFuel2() {
		GasCar car = new GasCar("Gold", 8);
		car.accelerate();
		car.accelerate();
		assertEquals(6, car.getFuel());
	}

	// isFuelEmpty returns true when fuel is 0.
	@Test
	void testAccelerateIsFuelEmptyTrue() {
		GasCar car = new GasCar("Platinum", 0);
		assertEquals(true, car.isFuelEmpty());
	}

	// isFuelEmpty returns false when fuel is greater than 0.
	@Test
	void testAccelerateIsFuelEmptyFalse() {
		GasCar car = new GasCar("Platinum", 1);
		assertEquals(false, car.isFuelEmpty());
	}

}