package moblima;


public class ShowDigital extends Show {
	private static float basePrice;
	
	public ShowDigital(String movie, MovieCalendar showTime, char[][] bookedLayout) {
		super(movie, showTime, bookedLayout);
	}

	public static void setBasePrice(float newBasePrice){
		ShowDigital.basePrice = newBasePrice; 
	}

}
