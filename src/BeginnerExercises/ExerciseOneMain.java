package BeginnerExercises;

import java.util.Scanner;

public class ExerciseOneMain {

	public static void main(String[] args) {
		ExerciseOne calculo = new ExerciseOne();
		Scanner scanf = new Scanner(System.in);
		System.out.println("Termo 1: ");
		calculo.setTermo1(scanf.nextInt());
		System.out.println("Termo 2: ");
		calculo.setTermo2(scanf.nextInt());
		System.out.println("Total = " + calculo.getTotal());
		scanf.close();
	}

}