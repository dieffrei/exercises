package main.java.BeginnerExercises;

import java.util.Scanner;

public class ExerciseSevenMain {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		ExerciseSeven send = new ExerciseSeven();

		System.out.println("Digite um n�mero de 1 a 1000: ");
		send.fill(scanf.nextInt());
		int valores[] = send.getSequence();

		for (int i = 0; i < valores.length; i++) {
			System.out.println(valores[i]);
		}
		scanf.close();
	}

}
