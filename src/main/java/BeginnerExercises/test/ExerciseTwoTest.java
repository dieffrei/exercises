package main.java.BeginnerExercises.test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.BeginnerExercises.ExerciseTwo;

public class ExerciseTwoTest {

	@Test
	public void firstExerciseTwoTest() {
		ExerciseTwo test = new ExerciseTwo();
		test.setName("Carmen");
		test.setSal_m(80000);
		test.setTot_v(25000);
		String name = "Carmen";
		double sal_m = 80000;
		double okay = 3750.0;
		assertEquals(name, test.getName());
		assertTrue(sal_m == test.getSal_m());
		assertTrue(okay == test.getResult());
	}

	@Test
	public void secondExerciseTwoTest() {
		ExerciseTwo test = new ExerciseTwo();
		test.setName("Pedro");
		test.setSal_m(75000);
		test.setTot_v(25000);
		String name = "Pedro";
		double sal_m = 75000;
		double okay = 3750.0;
		assertEquals(name, test.getName());
		assertTrue(sal_m ==  test.getSal_m());
		assertTrue(okay == test.getResult());
	}
	
	@Test
	public void thirdExerciseTwoTest() {
		ExerciseTwo test = new ExerciseTwo();
		test.setName("Anthonella");
		test.setSal_m(100000);
		test.setTot_v(35000);
		String name = "Anthonella";
		double sal_m = 100000;
		double okay = 5250.0;
		assertEquals(name, test.getName());
		assertTrue(sal_m == test.getSal_m());
		assertTrue(okay == test.getResult());
	}	
	
}