package BeginnerExercises;

public class Exercise1064 {
	private int amountPos = 0;
	private double sumPos = 0;
	private double averagePos = 0;
	
	public void positiveOrNegative(double number) {
		if (number > 0) {
			this.amountPos = this.amountPos + 1;
			this.sumPos = this.sumPos + number;
		} 
	}

	public int getAmountPos() {
		return amountPos;
	}

	public void setAmountPos(int amountPos) {
		this.amountPos = amountPos;
	}

	public double getSumPos() {
		return sumPos;
	}

	public void setSumPos(double sumPos) {
		this.sumPos = sumPos;
	}
	
	public double getAveragePos() {
		this.averagePos = this.sumPos/this.amountPos;
		return this.averagePos;
	}
	
}
