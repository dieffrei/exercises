package main.java.BeginnerExercises;

import java.util.Scanner;

public class Exercise1064Main {

	public static void main(String[] args) {
		Exercise1064 send = new Exercise1064();
		Scanner scanf = new Scanner(System.in);
		for (int i = 0; i < 6; i++) {
			System.out.println("Digite um valor: ");
			send.positiveOrNegative(scanf.nextDouble());
		}
		
		System.out.println(send.getAmountPos() + " valor(es) positivo(s).");
		System.out.println(send.getAveragePos());
		scanf.close();
	}

}
