package main.java.BeginnerExercises;

public class ExerciseFive {
	private int SIZE = 1000;
	private int[] sequence = new int[SIZE];
	
	public void fill(int startValue) {
		for(int i = 0; i < SIZE; i++){
			sequence[i] = startValue * i;
		}
	}
	
	public int[] getSequence() {
		return sequence; 
	}
	
	public void setSequence (int[] sequence) {
		this.sequence = sequence;
	}

}
