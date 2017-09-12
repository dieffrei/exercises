package main.java.BeginnerExercises;

public class Exercise1078 {
	private int[] table = new int[11]; 
	private int rating;
	
	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public int[] getTable() {
		return table;
	}

	public void setTable(int[] table) {
		this.table = table;
	}
	
	public void makeThis() {
		for (int i = 1; i < 11; i++) {
			this.table[i] = this.rating * i; 
		}
	}
	
}
