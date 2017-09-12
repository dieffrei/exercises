package main.java.BeginnerExercises.test;

import static org.junit.Assert.*;
import org.junit.Test;

import main.java.BeginnerExercises.ExerciseSix;

public class ExerciseSixTest {
	
	@Test
	public void firstExerciseSixTest() {
		ExerciseSix test = new ExerciseSix();
		test.setWholeOne(3);
		test.setWholeTwo(10);
		assertTrue(24 == test.getAllSum());
	}
	
	@Test
	public void secondExerciseSixTest() {
		ExerciseSix test = new ExerciseSix();
		test.setWholeOne(13);
		test.setWholeTwo(13);
		assertTrue(0 == test.getAllSum());
	}
	
	@Test
	public void thirdExerciseSixTest() {
		ExerciseSix test = new ExerciseSix();
		test.setWholeOne(12);
		test.setWholeTwo(15);
		assertTrue(13 == test.getAllSum());
	}
}
	
