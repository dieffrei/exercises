package main.java.BeginnerExercises.test;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

import main.java.BeginnerExercises.Exercise1065;

public class Exercise1065Test {

	@Test
	public void firstExercise1065Test() {
		Exercise1065 test = new Exercise1065();
		int[] space = new int[5]; 
		space[0] = 8;
		space[1] = 12;
		space[2] = 1;
		space[3] = -13;
		space[4] = 4;
		assertTrue(8 == test.verifica(space[0]));
		assertTrue(12 == test.verifica(space[1]));
		assertTrue(0 == test.verifica(space[2]));
		assertTrue(0 == test.verifica(space[3]));
		assertTrue(4 == test.verifica(space[4]));
	}

	@Test
	public void secondExercise1065Test() {
		Exercise1065 test = new Exercise1065();
		int[] space = new int[5]; 
		space[0] = 18;
		space[1] = 12;
		space[2] = 7;
		space[3] = 28;
		space[4] = 64;
		assertTrue(18 == test.verifica(space[0]));
		assertTrue(12 == test.verifica(space[1]));
		assertTrue(0 == test.verifica(space[2]));
		assertTrue(28 == test.verifica(space[3]));
		assertTrue(64 == test.verifica(space[4]));
	}

	@Test
	public void thirdExercise1065Test() {
		Exercise1065 test = new Exercise1065();
		int[] space = new int[5]; 
		space[0] = 3;
		space[1] = 82;
		space[2] = 1;
		space[3] = -13;
		space[4] = 55;
		assertTrue(0 == test.verifica(space[0]));
		assertTrue(82 == test.verifica(space[1]));
		assertTrue(0 == test.verifica(space[2]));
		assertTrue(0 == test.verifica(space[3]));
		assertTrue(0 == test.verifica(space[4]));
	}
}
