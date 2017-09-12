package BeginnerExercises;

public class ExerciseSix {
	private int wholeOne;
	private int wholeTwo;
	
	public int getWholeOne() {
		return wholeOne;
	}
	public void setWholeOne(int wholeOne) {
		this.wholeOne = wholeOne;
	}
	public int getWholeTwo() {
		return wholeTwo;
	}
	public void setWholeTwo(int wholeTwo) {
		this.wholeTwo = wholeTwo;
	}
	public boolean getBoolean() {
		if(this.wholeOne <= this.wholeTwo) {
			return true;
		} else {
			return false;
		}
	}
	public int getAllSum() {
		int sum = 0;
		if(getBoolean() == true) {
			for(int i = this.wholeOne; i < this.wholeTwo; i++) {
				if((i%2)==1) {
					sum = sum + i;
				}
			}
		} 
		return sum;
	}
	
	
}
