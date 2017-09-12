package main.java.BeginnerExercises;

public class Exercise1066 {
	private static final int QUANTIDADE_NUMEROS = 6;
	private int entrada;
	private int amountPo;
	private int amountNe;
	private int amountIm;
	private int amountPa;
	
	public void setAmountPo(int amountPo) {
		this.amountPo = amountPo;
	}

	public void setAmountNe(int amountNe) {
		this.amountNe = amountNe;
	}
	
	public void setAmountIm(int amountIm) {
		this.amountIm = amountIm;
	}
	
	public void setAmountPa(int amountPa) {
		this.amountPa = amountPa;
	}
	
	public int getAmountPo() {
		return this.amountPo;
	}
	
	public int getAmountNe() {
		return this.amountNe;
	}
	
	public int getAmountIm() {
		return this.amountIm;
	}
	
	public int getAmountPa() {
		return this.amountPa;
	}
	
	public void sort() {
		if (getPares() == true) {
			this.amountPa = this.amountPa + 1;
		}
		if (getImpares() == true) {
			this.amountIm = this.amountIm + 1;
		}
		if (getPositivos() == true) {
			this.amountPo = this.amountPo + 1;
		}
		if (getNegativos() == true) {
			this.amountNe = this.amountNe + 1;
		}
	}
	
	public boolean getPositivos() {
		if (entrada >= 0 && entrada != 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean getNegativos() {
		if (entrada < 0 && entrada != 0) {
			return true;
		} else {
			return false;
		}
	}

	public int getEntrada() {
		return entrada;
	}

	public void setEntrada(int entrada) {
		this.entrada = entrada;
	}

	public boolean getImpares() {
		if (entrada % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean getPares() {
		if (entrada % 2 == 0) {
			return true;
		}
		return false;
	}

	public static int getQuantidadeNumeros() {
		return QUANTIDADE_NUMEROS;
	}
}
