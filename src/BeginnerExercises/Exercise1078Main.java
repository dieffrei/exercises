package BeginnerExercises;

import java.util.Scanner;

public class Exercise1078Main {
	
	public static void main(String[] args) {
		
		Exercise1078 send = new Exercise1078();
		Scanner scanf = new Scanner(System.in);
		System.out.println("Digite um valor inteiro: ");
		send.setRating(scanf.nextInt());
		send.makeThis();
		
		if(send.getRating() > 1000 || send.getRating() < 2) {
			System.out.println("ERRO! Esse valor n�o � valido tente novamente.");
		} else {
			int[] tabuada = new int[11];
			tabuada = send.getTable();
			for (int i = 1; i < 11; i++) {
				System.out.println(i + " x " + send.getRating() + " = " + tabuada[i]);
			}
		}
		scanf.close();
	}

}
