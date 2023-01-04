package PracticeAssessment3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class MethodsTests {

	// Do a test case with a list of GasCar where some have no fuel.
	@Test
	void testFindRacersWithEmptyFuel_MixedGasCars() {
		GasCar a = new GasCar("A", 3);
		GasCar b = new GasCar("B", 0);
		GasCar c = new GasCar("C", 10);
		GasCar d = new GasCar("D", 0);
		List<Racer> allRacers = new ArrayList<>(Arrays.asList(a, b, c, d));

		List<Racer> expected = Arrays.asList(b, d);
		assertEquals(expected, Methods.findRacersWithEmptyFuel(allRacers));
	}

	// Do a test case with a list of GasCar where all have no fuel.
	@Test
	void testFindRacersWithEmptyFuel_EmptyGasCars() {
		GasCar a = new GasCar("A", 0);
		GasCar b = new GasCar("B", 0);
		GasCar c = new GasCar("C", 0);
		List<Racer> allRacers = new ArrayList<>(Arrays.asList(a, b, c));

		List<Racer> expected = Arrays.asList(a, b, c);
		assertEquals(expected, Methods.findRacersWithEmptyFuel(allRacers));
	}

	// Do a test case with a list of GasCar where none have no fuel. (Expect an
	// empty list as the result.)
	@Test
	void testFindRacersWithEmptyFuel_NonEmptyGasCars() {
		GasCar a = new GasCar("A", 3);
		GasCar b = new GasCar("B", 2);
		GasCar c = new GasCar("C", 1);
		List<Racer> allRacers = new ArrayList<>(Arrays.asList(a, b, c));

		List<Racer> expected = Arrays.asList();
		assertEquals(expected, Methods.findRacersWithEmptyFuel(allRacers));
	}

	// Do a test case with a list of SolarCar. (Expect an empty list as the
	// result.)
	@Test
	void testFindRacersWithEmptyFuel_SolarCars() {
		SolarCar a = new SolarCar("A");
		SolarCar b = new SolarCar("B");
		SolarCar c = new SolarCar("C");
		List<Racer> allRacers = new ArrayList<>(Arrays.asList(a, b, c));

		List<Racer> expected = Arrays.asList();
		assertEquals(expected, Methods.findRacersWithEmptyFuel(allRacers));
	}

	// Do a test case with a list that has a mix of SolarCar and GasCar.
	@Test
	void testFindRacersWithEmptyFuel_Mix() {
		SolarCar a = new SolarCar("A");
		SolarCar b = new SolarCar("B");
		GasCar c = new GasCar("C", 10);
		GasCar d = new GasCar("D", 0);
		List<Racer> allRacers = new ArrayList<>(Arrays.asList(a, b, c, d));

		List<Racer> expected = Arrays.asList(d);
		assertEquals(expected, Methods.findRacersWithEmptyFuel(allRacers));
	}

	// Do a test case with an empty list. (Expect an empty list as the result.)
	@Test
	void testFindRacersWithEmptyFuel_Empty() {
		List<Racer> allRacers = new ArrayList<>(Arrays.asList());

		List<Racer> expected = Arrays.asList();
		assertEquals(expected, Methods.findRacersWithEmptyFuel(allRacers));
	}

	// Do a test case with an array of GasCar with different speeds.
	@Test
	void testFindAverageSpeed_Gas() {
		GasCar a = new GasCar("A"); // speed = 4
		a.accelerate();
		a.accelerate();
		GasCar b = new GasCar("B"); // speed = 6
		b.accelerate();
		b.accelerate();
		b.accelerate();
		GasCar c = new GasCar("C"); // speed = 2
		c.accelerate();
		Racer[] racers = new Racer[] { a, b, c };

		assertEquals(4.0, Methods.findAverageSpeed(racers), 0.001);
	}

	// Do a test case with an array that has a mix of SolarCar and GasCar with
	// different speeds.
	@Test
	void testFindAverageSpeed_Mix() {
		GasCar a = new GasCar("A"); // speed = 6
		a.accelerate();
		a.accelerate();
		a.accelerate();
		SolarCar b = new SolarCar("B"); // speed = 3
		b.accelerate();
		b.accelerate();
		b.accelerate();
		GasCar c = new GasCar("C"); // speed = 0
		SolarCar d = new SolarCar("D"); // speed = 1
		b.accelerate();
		Racer[] racers = new Racer[] { a, b, c, d };

		assertEquals(2.5, Methods.findAverageSpeed(racers), 0.001);
	}

	// Do a test case with an array of cars that all have 0 speed. (Expect 0.)
	@Test
	void testFindAverageSpeed_Zero() {
		GasCar a = new GasCar("A"); // speed = 0
		SolarCar b = new SolarCar("B"); // speed = 0
		GasCar c = new GasCar("C"); // speed = 0
		SolarCar d = new SolarCar("D"); // speed = 0
		Racer[] racers = new Racer[] { a, b, c, d };

		assertEquals(0.0, Methods.findAverageSpeed(racers), 0.001);
	}

	// Do a test case with an empty array. (Expect 0.)
	@Test
	void testFindAverageSpeed_Empty() {
		Racer[] racers = new Racer[0];
		assertEquals(0.0, Methods.findAverageSpeed(racers), 0.001);
	}

	// Test with racerA faster.
	@Test
	void testGetFasterRacer_A() {
		SolarCar a = new SolarCar("A"); // speed = 3
		a.accelerate();
		a.accelerate();
		a.accelerate();
		SolarCar b = new SolarCar("B"); // speed = 2
		b.accelerate();
		b.accelerate();

		assertSame(a, Methods.getFasterRacer(a, b));
	}

	// Test with racerB faster.
	@Test
	void testGetFasterRacer_B() {
		SolarCar a = new SolarCar("A"); // speed = 1
		a.accelerate();
		SolarCar b = new SolarCar("B"); // speed = 2
		b.accelerate();
		b.accelerate();

		assertSame(b, Methods.getFasterRacer(a, b));
	}

	// Test with both racers the same speed.
	@Test
	void testGetFasterRacer_Same() {
		SolarCar a = new SolarCar("A"); // speed = 2
		a.accelerate();
		a.accelerate();
		SolarCar b = new SolarCar("B"); // speed = 2
		b.accelerate();
		b.accelerate();

		assertNull(Methods.getFasterRacer(a, b));
	}

	// Repeat one of the above with a different mix GasCar and SolarCar in the
	// parameters.
	@Test
	void testGetFasterRacer_Mix() {
		GasCar a = new GasCar("A"); // speed = 4
		a.accelerate();
		a.accelerate();
		SolarCar b = new SolarCar("B"); // speed = 3
		b.accelerate();
		b.accelerate();
		b.accelerate();

		assertSame(a, Methods.getFasterRacer(a, b));
	}

}