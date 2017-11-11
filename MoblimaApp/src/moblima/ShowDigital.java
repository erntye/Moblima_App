package moblima;


public class ShowDigital extends Show {
	private static float basePrice;
	
	public ShowDigital(Movie movie, MovieCalendar showTime, char[][] bookedLayout) {
		super(movie, showTime, bookedLayout);
	}

	public static void setBasePrice(float newBasePrice){
		ShowDigital.basePrice = newBasePrice; 
	}

}
