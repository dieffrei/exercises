package main.java.BeginnerExercises;

import java.util.Scanner;

public class ExerciseTwoMain {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		ExerciseTwo send = new ExerciseTwo();
		
		System.out.println("Digite o nome: ");
		send.setName(scanf.nextLine());
		System.out.println("Digite o sal�rio mensal bruto: ");
		send.setSal_m(scanf.nextDouble());
		System.out.println("Digite o total de vendas do m�s: ");
		send.setTot_v(scanf.nextDouble());
		System.out.println("Percentual das vendas = " + send.getResult());
		scanf.close();
	}

}
