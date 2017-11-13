package moblima;
import java.util.Calendar;

public class Show3D extends Show {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3166998096548624910L;
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
