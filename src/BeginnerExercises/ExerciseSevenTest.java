package BeginnerExercises;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ExerciseSevenTest {
	
	@Test
	public void firstExerciseSevenTest() {
		ExerciseSeven test = new ExerciseSeven();
		test.fill(13);
		int amount[] = test.getSequence();
		int val = amount[0];
		assertTrue(0 == val);
	}
	
	@Test
	public void secondExerciseSevenTest() {
		ExerciseSeven test = new ExerciseSeven();
		test.fill(24);
		int amount[] = test.getSequence();
		int val = amount[49];
		assertTrue(24 == val);
	}
	
	@Test
	public void thirdExerciseSevenTest() {
		ExerciseSeven test = new ExerciseSeven();
		test.fill(13);
		int amount[] = test.getSequence();
		int val = amount[13];
		assertTrue(13 == val);
	}
}
