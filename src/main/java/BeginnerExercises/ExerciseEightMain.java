package main.java.BeginnerExercises;

import java.util.Scanner;

public class ExerciseEightMain {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("Informe um valor: ");
		String numero = scanf.nextLine();
		ExerciseEightExtensive e = new ExerciseEightExtensive();
		String str = e.interpret(numero);
		System.out.println(str);	
		scanf.close();
	}

}
