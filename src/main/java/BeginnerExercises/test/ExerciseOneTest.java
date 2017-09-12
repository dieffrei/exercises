package main.java.BeginnerExercises.test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.BeginnerExercises.ExerciseOne;

public class ExerciseOneTest {

	@Test
	public void firstExerciseOneTest() {
		ExerciseOne test = new ExerciseOne();
		int okay = 13;
		test.setTermo1(5);
		test.setTermo2(8);
		assertEquals(okay, test.getTotal());
	}

	@Test
	public void secondExerciseOneTest() {
		ExerciseOne test = new ExerciseOne();
		int okay = -5;
		test.setTermo1(10);
		test.setTermo2(-15);
		assertEquals(okay, test.getTotal());
	}
	
	@Test
	public void thirdExerciseOneTest() {
		ExerciseOne test = new ExerciseOne();
		int okay = 0;
		test.setTermo1(-13);
		test.setTermo2(13);
		assertEquals(okay, test.getTotal());
	}	
	
}
