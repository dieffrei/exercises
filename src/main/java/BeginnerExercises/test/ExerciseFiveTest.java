package main.java.BeginnerExercises.test;

import static org.junit.Assert.*;
import org.junit.Test;

import main.java.BeginnerExercises.ExerciseFive;

public class ExerciseFiveTest {
		
	@Test
	public void firstExerciseFiveTest() {
		ExerciseFive test = new ExerciseFive();
		test.fill(13);
		int amount[] = test.getSequence();
		int val = amount[1];
		assertTrue(13 == val);
	}
	
	@Test
	public void secondExerciseFiveTest() {
		ExerciseFive test = new ExerciseFive();
		test.fill(13);
		int amount[] = test.getSequence();
		int val = amount[0];
		assertTrue(0 == val);
	}
	
	@Test
	public void thirdExerciseFiveTest() {
		ExerciseFive test = new ExerciseFive();
		test.fill(13);
		int amount[] = test.getSequence();
		int val = amount[999];
		assertTrue(12987 == val);
	}
	
}
