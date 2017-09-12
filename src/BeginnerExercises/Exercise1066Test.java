package BeginnerExercises;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Exercise1066Test {
	
	@Test
	public void firstExercise1066Test() {
		Exercise1066 test = new Exercise1066();
		test.setEntrada(0);
		test.sort();
		assertTrue(true == test.getPares());
		assertTrue(false == test.getImpares());
		assertTrue(false == test.getPositivos());
		assertTrue(false == test.getNegativos());
	}
	
	@Test
	public void secondExercise1066Test() {
		Exercise1066 test = new Exercise1066();
		test.setEntrada(55);
		test.sort();
		assertTrue(false == test.getPares());
		assertTrue(true == test.getImpares());
		assertTrue(true == test.getPositivos());
		assertTrue(false == test.getNegativos());
	}
	
	@Test
	public void thirdExercise1066Test() {
		Exercise1066 test = new Exercise1066();
		test.setEntrada(12);
		test.sort();
		assertTrue(true == test.getPares());
		assertTrue(false == test.getImpares());
		assertTrue(true == test.getPositivos());
		assertTrue(false == test.getNegativos());
	}
	
	@Test
	public void fourthExercise1066Test() {
		Exercise1066 test = new Exercise1066();
		test.setEntrada(-13);
		test.sort();
		assertTrue(false == test.getPares());
		assertTrue(true == test.getImpares());
		assertTrue(false == test.getPositivos());
		assertTrue(true == test.getNegativos());
	}
	
	@Test
	public void fifthExercise1066Test() {
		Exercise1066 test = new Exercise1066();
		test.setEntrada(-14);
		test.sort();
		assertTrue(true == test.getPares());
		assertTrue(false == test.getImpares());
		assertTrue(false == test.getPositivos());
		assertTrue(true == test.getNegativos());
	}
}
