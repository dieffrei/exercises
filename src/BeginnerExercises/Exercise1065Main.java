package BeginnerExercises;

import java.util.Scanner;

public class Exercise1065Main {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		Exercise1065 par = new Exercise1065(); 
		int[] pares = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("Insira o valor " + i);
			pares[i] = par.verifica(scanf.nextInt());
		}
		System.out.println("Numeros pares:");
		for (int i = 0; i < 5; i++) {
			if (pares[i] != 0) {
				System.out.println(pares[i]);
			}
		}
		scanf.close();
	}
}
