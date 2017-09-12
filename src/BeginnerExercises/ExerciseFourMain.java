package BeginnerExercises;

import java.util.Scanner;
import java.text.ParseException;

public class ExerciseFourMain {
	public static void main(String[] args)  {
		Scanner scanf = new Scanner(System.in);
		ExerciseFour send = new ExerciseFour();
		
		System.out.println("Data inicial: ");
		send.setDateOne(scanf.nextLine());
		System.out.println("Data final: ");
		send.setDateTwo(scanf.nextLine());
		try {
			System.out.println(send.getDaysDifference() + " dias");
		} catch (ParseException erro) {
			System.out.println("A data foi um entrada inv�lida - favor verificar");
			System.out.println("A mensagem de erro original foi " + erro);
		}
		scanf.close();
	}
}
