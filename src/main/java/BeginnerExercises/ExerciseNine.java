package main.java.BeginnerExercises;

public class ExerciseNine {
	private boolean saqueAutorizado = true;

	private int saque, saquereal;
	private int notaCem = 0, notaCinq = 0, notaVinte = 0, notaDez = 0, notaCinco = 0, notaDois = 0, notaUm = 0;

	public boolean isSaqueAutorizado() {
		return saqueAutorizado;
	}

	public int getSaque() {
		return saque;
	}

	public void setSaque(int saque) {
		this.saque = saque;
	}

	public int getSaquereal() {
		return saquereal;
	}

	public void setSaquereal(int saquereal) {
		this.saquereal = saquereal;
		this.saque = saquereal;
	}

	public int getNotaCem() {
		return notaCem;
	}

	public void setNotaCem(int notaCem) {
		this.notaCem = notaCem;
	}

	public int getNotaCinq() {
		return notaCinq;
	}

	public void setNotaCinq(int notaCinq) {
		this.notaCinq = notaCinq;
	}

	public int getNotaVinte() {
		return notaVinte;
	}

	public void setNotaVinte(int notaVinte) {
		this.notaVinte = notaVinte;
	}

	public int getNotaDez() {
		return notaDez;
	}

	public void setNotaDez(int notaDez) {
		this.notaDez = notaDez;
	}

	public int getNotaCinco() {
		return notaCinco;
	}

	public void setNotaCinco(int notaCinco) {
		this.notaCinco = notaCinco;
	}

	public int getNotaDois() {
		return notaDois;
	}

	public void setNotaDois(int notaDois) {
		this.notaDois = notaDois;
	}

	public int getNotaUm() {
		return notaUm;
	}

	public void setNotaUm(int notaUm) {
		this.notaUm = notaUm;
	}

	public void realizaSaque() {
		saquereal = saque;
		if (saque > 0 && saque <= 3000) {
			while (saque >= 100) {
				saque = saque - 100;
				notaCem++;
			}

			while (saque >= 50) {
				saque = saque - 50;
				notaCinq++;
			}

			while (saque >= 20) {
				saque = saque - 20;
				notaVinte++;
			}

			while (saque >= 10) {
				saque = saque - 10;
				notaDez++;
			}

			while (saque >= 5) {
				saque = saque - 5;
				notaCinco++;
			}

			while (saque >= 2) {
				saque = saque - 2;
				notaDois++;
			}

			while (saque >= 1) {
				saque = saque - 1;
				notaUm++;
			}

		} else {
			saqueAutorizado = false;
		}

	}
}
