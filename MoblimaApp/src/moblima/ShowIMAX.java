package moblima;

import java.util.Date;

public class ShowIMAX extends Show {
	private static float basePrice;
	
	public ShowIMAX(Movie movie, Calendar showTime, char[][] bookedLayout) {
		super(movie, showTime, bookedLayout);
	}

	public static void setBasePrice(float newBasePrice){
		ShowIMAX.basePrice = newBasePrice; 
	}

}
