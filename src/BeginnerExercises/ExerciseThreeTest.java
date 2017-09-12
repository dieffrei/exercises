package BeginnerExercises;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExerciseThreeTest {
	
	@Test
	public void firstExerciseThreeTest() {
		ExerciseThree test = new ExerciseThree();
		test.setRadius(2);
		double radius = 2;
		double area = Math.PI * (Math.pow(radius, radius));
		assertTrue(radius == test.getRadius());
		assertTrue(area == test.getArea());
	}
	
	@Test
	public void secondExerciseThreeTest() {
		ExerciseThree test = new ExerciseThree();
		test.setRadius(3);
		double radius = 3;
		double area = Math.PI * (Math.pow(radius, radius));
		assertTrue(radius == test.getRadius());
		assertTrue(area == test.getArea());
	}
	
	@Test
	public void thirdExerciseThreeTest() {
		ExerciseThree test = new ExerciseThree();
		test.setRadius(4);
		double radius = 4;
		double area = Math.PI * (Math.pow(radius, radius));
		assertTrue(radius == test.getRadius());
		assertTrue(area == test.getArea());
	}
}
