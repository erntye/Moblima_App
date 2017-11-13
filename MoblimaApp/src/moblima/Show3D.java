package moblima;
import java.util.Calendar;

public class Show3D extends Show {
	private static float basePrice;
	
	public Show3D(String movie, Calendar showTime, char[][] bookedLayout) {
		super(movie, showTime, bookedLayout);
	}
	
	public float getBasePrice() {
		return basePrice;
	}

	public static void setBasePrice(float newBasePrice){
		Show3D.basePrice = newBasePrice; 
	}
	
	public String getShowType() {
		return "3D";
	}

}
