package main.java.BeginnerExercises.test;

import static org.junit.Assert.*;
import java.text.ParseException;
import org.junit.Test;

import main.java.BeginnerExercises.ExerciseFour;

public class ExerciseFourTest {
	
	@Test
	public void firstExerciseFourTest() throws ParseException {
		ExerciseFour test = new ExerciseFour();
		test.setDateOne("03/11/2017");
		test.setDateTwo("24/11/2017");
		double days = 21;
		assertTrue(days == test.getDaysDifference());
	}
	
	@Test
	public void secondExerciseFourTest() throws ParseException {
		ExerciseFour test = new ExerciseFour();
		test.setDateOne("24/11/2017");
		test.setDateTwo("03/12/2017");
		double days = 9;
		assertTrue(days == test.getDaysDifference());
	}
	
	@Test
	public void thirdExerciseFourTest() throws ParseException {
		ExerciseFour test = new ExerciseFour();
		test.setDateOne("13/07/2017");
		test.setDateTwo("13/07/2017");
		double days = 0;
		assertTrue(days == test.getDaysDifference());
	}

}
