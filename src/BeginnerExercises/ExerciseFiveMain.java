package BeginnerExercises;

import java.util.Scanner;

public class ExerciseFiveMain {

	public static void main (String args[]) {
		Scanner scanf = new Scanner(System.in);
		ExerciseFive send = new ExerciseFive();
		
		System.out.println("Digite um n�mero de 1 a 1000: ");
		send.fill(scanf.nextInt());
		int amount[] = send.getSequence();

		for (int i = 0; i < amount.length; i++) {
			System.out.println(amount[i]);
		}
		scanf.close();
	}

}
