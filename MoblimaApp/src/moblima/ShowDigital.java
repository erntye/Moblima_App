package moblima;
import java.util.Calendar;

public class ShowDigital extends Show {
	private static float basePrice;
	
	public ShowDigital(String movie, Calendar showTime, char[][] bookedLayout) {
		super(movie, showTime, bookedLayout);
	}

	public static void setBasePrice(float newBasePrice){
		ShowDigital.basePrice = newBasePrice; 
	}

}
