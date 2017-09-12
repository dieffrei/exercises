package test.java.BeginnerExercises;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import main.java.BeginnerExercises.Exercise1064;

public class Exercise1064Test {
	
	@Test
	public void firstExercise1064Test() {
		Exercise1064 test = new Exercise1064();
		test.positiveOrNegative(-13.55);
		assertTrue(0 == test.getAmountPos());
		assertTrue(0 == test.getSumPos());
	}
	
	@Test
	public void secondExercise1064Test() {
		Exercise1064 test = new Exercise1064();
		test.positiveOrNegative(13);
		assertTrue(1 == test.getAmountPos());
		assertTrue(13 == test.getSumPos());
	}
	
	@Test
	public void thirdExercise1064Test() {
		Exercise1064 test = new Exercise1064();
		test.positiveOrNegative(0.55);
		assertTrue(1 == test.getAmountPos());
		assertTrue(0.55 == test.getSumPos());
	}
}
