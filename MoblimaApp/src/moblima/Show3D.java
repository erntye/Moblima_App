package moblima;

public class Show3D extends Show {
	private static float basePrice;
	
	public Show3D(String movie, MovieCalendar showTime, char[][] bookedLayout) {
		super(movie, showTime, bookedLayout);
	}

	public static void setBasePrice(float newBasePrice){
		Show3D.basePrice = newBasePrice; 
	}

}
