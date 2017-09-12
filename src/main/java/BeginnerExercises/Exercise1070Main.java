package main.java.BeginnerExercises;

import java.util.Scanner;

public class Exercise1070Main {
	public static void main(String args[]){
		Scanner scanf = new Scanner(System.in);
		Exercise1070 verifica = new Exercise1070();
		
		System.out.println("Digite um n�mero positivo qualquer: ");
		verifica.setNumero(scanf.nextInt());
		
		int[] impares = verifica.getImpares();
		
		for (int i = 0; i < impares.length; i++) {
			int cont = i + 1;
			System.out.println("[" + cont + "] = " + impares[i]);
		}
		scanf.close();
	}
}
