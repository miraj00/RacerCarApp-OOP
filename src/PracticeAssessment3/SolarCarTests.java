package PracticeAssessment3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolarCarTests {

	// The team field is set from the constructor parameter.
	@Test
	void testConstructorTeam() {
		SolarCar car = new SolarCar("Blue");
		assertEquals("Blue", car.getTeam());
	}

	// The speed field starts at 0.
	@Test
	void testConstructorSpeed() {
		SolarCar car = new SolarCar("Red");
		assertEquals(0, car.getSpeed());
	}

	// Calling accelerate once brings speed to 1.
	@Test
	void testAccelerate1() {
		// Arrange
		SolarCar car = new SolarCar("Pink");
		// Act
		car.accelerate();
		// Assert
		assertEquals(1, car.getSpeed());
	}

	// Calling accelerate twice brings speed to 2.
	@Test
	void testAccelerate2() {
		// Arrange
		SolarCar car = new SolarCar("Pink");
		// Act
		car.accelerate();
		car.accelerate();
		// Assert
		assertEquals(2, car.getSpeed());
	}

	// isFuelEmpty returns false.
	@Test
	void testIsEmpty() {
		SolarCar car = new SolarCar("Red");
		assertEquals(false, car.isFuelEmpty());
	}
}