package moblima;
import java.util.Calendar;

public class ShowDigital extends Show {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6262724137447971700L;
	private static float basePrice;
	
	public ShowDigital(String movie, Calendar showTime, char[][] bookedLayout) {
		super(movie, showTime, bookedLayout);
	}

	public float getBasePrice() {
		return basePrice;
	}
	
	public static void setBasePrice(float newBasePrice){
		ShowDigital.basePrice = newBasePrice; 
	}
	
	public String getShowType() {
		return "Digital";
	}

}
