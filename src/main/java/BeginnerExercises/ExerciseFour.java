package main.java.BeginnerExercises;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExerciseFour
{		
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

	private String dateOne;
	private String dateTwo;
	
	public String getDateOne() {
		return dateOne;
	}

	public void setDateOne(String dateOne) {
		this.dateOne = dateOne;
	}

	public String getDateTwo() {
		return dateTwo;
	}

	public void setDateTwo(String dateTwo) {
		this.dateTwo = dateTwo;
	}

	public double getDaysDifference() throws ParseException {
		Date start = dateFormat.parse(getDateOne());
		Date end = dateFormat.parse(getDateTwo());
		Date BUG = start;

		long milliseconds = BUG.getTime();
		double DaysDifference = (double) (end.getTime() - milliseconds) / (1000 * 60 * 60 * 24);
		return DaysDifference;
	}


}
