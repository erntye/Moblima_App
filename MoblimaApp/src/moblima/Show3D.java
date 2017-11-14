package moblima;
import java.util.Calendar;

public class Show3D extends Show {
	private static float basePrice;
	
	public Show3D(String movie, Calendar showTime, char[][] cinemaLayout) {
		super(movie, showTime, cinemaLayout);
	}

	public static void setBasePrice(float newBasePrice){
		Show3D.basePrice = newBasePrice; 
	}

}
