package main.java.BeginnerExercises;

public class ExerciseSeven {
	private int SIZE = 1000;
	private int start;
	private int[] sequence = new int[SIZE];
	
	public void fill(int startValue) {
		int j = 0;
		int i = 0;
		this.start = startValue;
		while (j < SIZE){
			this.sequence[j] = i;
			j++;
			i++;
			if(i > start){
				i = 0;
			}
		}
	}

	public int getInicial() {
		return start;
	}

	public void setInicial(int start) {
		this.start = start;
	}

	public int[] getSequence() {
		return sequence;
	}
}
