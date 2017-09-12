package main.java.BeginnerExercises.test;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

import main.java.BeginnerExercises.Exercise1070;

public class Exercise1070Test {
	
	@Test
	public void firstExercise1070Test() {
		Exercise1070 test = new Exercise1070();
		test.setNumero(8);
		int[] oddT = new int[6];
		int[] odd = test.getImpares();
		oddT[0] = 9;
		oddT[1] = 11;
		oddT[2] = 13;
		oddT[3] = 15;
		oddT[4] = 17;
		oddT[5] = 19;
		for (int i = 0; i < 6; i++) {
			assertTrue(oddT[i] == odd[i]);
		}
	}
	
	@Test
	public void secondExercise1070Test() {
		Exercise1070 test = new Exercise1070();
		test.setNumero(55);
		int[] oddT = new int[6];
		int[] odd = test.getImpares();
		oddT[0] = 55;
		oddT[1] = 57;
		oddT[2] = 59;
		oddT[3] = 61;
		oddT[4] = 63;
		oddT[5] = 65;
		for (int i = 0; i < 6; i++) {
			assertTrue(oddT[i] == odd[i]);
		}
	}
	
	@Test
	public void thirdExercise1070Test() {
		Exercise1070 test = new Exercise1070();
		test.setNumero(13);
		int[] oddT = new int[6];
		int[] odd = test.getImpares();
		oddT[0] = 13;
		oddT[1] = 15;
		oddT[2] = 17;
		oddT[3] = 19;
		oddT[4] = 21;
		oddT[5] = 23;
		for (int i = 0; i < 6; i++) {
			assertTrue(oddT[i] == odd[i]);
		}
	}
}
