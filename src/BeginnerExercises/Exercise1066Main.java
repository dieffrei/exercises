package BeginnerExercises;

import java.util.Scanner;

public class Exercise1066Main {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		Exercise1066 read = new Exercise1066();

		for (int i = 1; i < 6; i++) {
			System.out.println("Digite os valores: ");
			read.setEntrada(scanf.nextInt());
			read.sort();
		}
		
		System.out.println("Valor(es) par(es) " + read.getAmountPa());
		System.out.println("Valor(es) impar(es) " + read.getAmountIm());
		System.out.println("Valor(es) positivo(s) " + read.getAmountPo());
		System.out.println("Valor(es) negativo(s) " + read.getAmountNe());
		
		scanf.close();
	}
}
