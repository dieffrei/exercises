package BeginnerExercises;

public class ExerciseThree {
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		double area = Math.PI * (Math.pow(this.radius, this.radius));
		return area;
	}
	
}
