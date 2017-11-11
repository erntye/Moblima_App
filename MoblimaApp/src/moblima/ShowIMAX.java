package moblima;


public class ShowIMAX extends Show {
	private static float basePrice;
	
	public ShowIMAX(String movie, MovieCalendar showTime, char[][] bookedLayout) {
		super(movie, showTime, bookedLayout);
	}

	public static void setBasePrice(float newBasePrice){
		ShowIMAX.basePrice = newBasePrice; 
	}

}
