package BeginnerExercises;

import java.util.Scanner;

public class ExerciseThreeMain {

	public static void main(String[] args) {
		ExerciseThree send = new ExerciseThree();
		Scanner scanf = new Scanner(System.in);
		System.out.println("Digite o valor do raio da circunfer�ncia: ");
		send.setRadius(scanf.nextDouble());
		System.out.println("�rea = " + send.getArea());
		scanf.close();
	}

}
