package BeginnerExercises;

public class Exercise1070 {
	private int numero;
	private int[] impares = new int[6];

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int[] getImpares() {
		int somaInicial;
		
		if(numero % 2 == 0){
			somaInicial = 1;
		} else {
			somaInicial = 0;
		}
		
		int valor = somaInicial + numero;
		for (int i = 0; i < impares.length; i++) {
			impares[i] = valor;
			valor = valor + 2;
		}
		return impares;
	}
}
