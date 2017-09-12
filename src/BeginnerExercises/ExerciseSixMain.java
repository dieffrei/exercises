package BeginnerExercises;

import java.util.Scanner;

public class ExerciseSixMain {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		ExerciseSix send = new ExerciseSix();
		System.out.println("Digite o primeiro inteiro: ");
		send.setWholeOne(scanf.nextInt());
		System.out.println("Digite o segundo inteiro: ");
		send.setWholeTwo(scanf.nextInt());
		System.out.println("Total = " + send.getAllSum());
		scanf.close();
	}

}
