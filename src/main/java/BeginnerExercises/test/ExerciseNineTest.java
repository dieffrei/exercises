package main.java.BeginnerExercises.test;

import static org.junit.Assert.*;
import org.junit.Test;

import main.java.BeginnerExercises.ExerciseNine;

public class ExerciseNineTest {
	
	@Test
	public void firstExerciseNineTest() {
		ExerciseNine test = new ExerciseNine();
		test.setSaquereal(13);
		test.realizaSaque();
		assertTrue(1 == test.getNotaUm());
		assertTrue(1 == test.getNotaDois());
		assertTrue(0 == test.getNotaCinco());
		assertTrue(1 == test.getNotaDez());
		assertTrue(0 == test.getNotaVinte());
		assertTrue(0 == test.getNotaCinq());
		assertTrue(0 == test.getNotaCem());
		assertTrue(true == test.isSaqueAutorizado());
	}
	
	@Test
	public void secondExerciseNineTest() {
		ExerciseNine test = new ExerciseNine();
		test.setSaquereal(1305);
		test.realizaSaque();
		assertTrue(0 == test.getNotaUm());
		assertTrue(0 == test.getNotaDois());
		assertTrue(1 == test.getNotaCinco());
		assertTrue(0 == test.getNotaDez());
		assertTrue(0 == test.getNotaVinte());
		assertTrue(0 == test.getNotaCinq());
		assertTrue(13 == test.getNotaCem());
		assertTrue(true == test.isSaqueAutorizado());
	}
	
	@Test
	public void thirdExerciseNineTest() {
		ExerciseNine test = new ExerciseNine();
		test.setSaquereal(3001);
		test.realizaSaque();
		assertTrue(false == test.isSaqueAutorizado());
	}
}
