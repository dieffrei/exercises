package BeginnerExercises;

public class ExerciseTwo {
	private String name;
	private double tot_v;
	private double sal_m;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal_m() {
		return sal_m;
	}
	public void setSal_m(double sal_m) {
		this.sal_m = sal_m;
	}
	public double getTot_v() {
		return tot_v;
	}
	public void setTot_v(double tot_v) {
		this.tot_v = tot_v;
	}
	public double getResult() {
		double result = this.tot_v * 0.15;
		return result;
	}
	
}