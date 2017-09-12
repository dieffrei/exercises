package BeginnerExercises;

import java.util.Scanner;

public class ExerciseNineMain {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		ExerciseNine pegar = new ExerciseNine();

		System.out.println("Digite o valor de saque: ");
		int valor = scanf.nextInt();

		pegar.setSaquereal(valor);

		pegar.realizaSaque();

		if (pegar.isSaqueAutorizado()) {
			System.out.println("O seu saque gerou: \n" + pegar.getNotaCem() + " nota(s) de R$ 100,00 \n"
					+ pegar.getNotaCinq() + " nota(s) de R$ 50,00 \n" + pegar.getNotaVinte() + " nota(s) de R$ 20,00 \n"
					+ pegar.getNotaDez() + " nota(s) de R$ 10,00 \n" + pegar.getNotaCinco() + " nota(s) de R$ 5,00 \n"
					+ pegar.getNotaDois() + " nota(s) de R$ 2,00 \n" + pegar.getNotaUm() + " nota(s) de R$ 1,00 \n");
		} else {
			System.out.println("O valor m�ximo de saque � 3000!");
		}
		scanf.close();
	}
}
