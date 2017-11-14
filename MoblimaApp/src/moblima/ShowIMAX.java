package moblima;
import java.util.Calendar;

public class ShowIMAX extends Show {
	private static float basePrice;
	
	public ShowIMAX(String movie, Calendar showTime, char[][] cinemaLayout) {
		super(movie, showTime, cinemaLayout);
	}

	public static void setBasePrice(float newBasePrice){
		ShowIMAX.basePrice = newBasePrice; 
	}

}
