package main.java.BeginnerExercises.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import main.java.BeginnerExercises.Exercise1078;

public class Exercise1078Test {
	
	@Test
	public void firstExercise1078Test() {
		Exercise1078 test = new Exercise1078();
		int[] table = new int[11];
		test.setRating(13);
		test.makeThis();
		table = test.getTable();
		for (int i = 1; i < 11; i++) {
			assertTrue(i*13 == table[i]);
		}
	}
	
	@Test
	public void secondExercise1078Test() {
		Exercise1078 test = new Exercise1078();
		int[] table = new int[11];
		test.setRating(7);
		test.makeThis();
		table = test.getTable();
		for (int i = 1; i < 11; i++) {
			assertTrue(i*7 == table[i]);
		}
	}
	
	@Test
	public void thirdExercise1078Test() {
		Exercise1078 test = new Exercise1078();
		int[] table = new int[11];
		test.setRating(55);
		test.makeThis();
		table = test.getTable();
		for (int i = 1; i < 11; i++) {
			assertTrue(i*55 == table[i]);
		}
	}
}
