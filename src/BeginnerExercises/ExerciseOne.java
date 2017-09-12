package BeginnerExercises;

public class ExerciseOne {
	private int termo1;
	private int termo2;
	
	public int getTermo1() {
		return termo1;
	}
	public void setTermo1(int termo1) {
		this.termo1 = termo1;
	}
	public int getTermo2() {
		return termo2;
	}
	public void setTermo2(int termo2) {
		this.termo2 = termo2;
	}
	public int getTotal() {
		int total = this.termo1 + this.termo2;
		return total;
	}
	
}