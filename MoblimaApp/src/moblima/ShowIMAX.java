package moblima;
import java.util.Calendar;

public class ShowIMAX extends Show {
	/**
	 * 
	 */
	private static final long serialVersionUID = -9014464972543649951L;
	private static float basePrice;
	
	public ShowIMAX(String movie, Calendar showTime, char[][] bookedLayout) {
		super(movie, showTime, bookedLayout);
	}

	public float getBasePrice() {
		return basePrice;
	}
	
	public static void setBasePrice(float newBasePrice){
		ShowIMAX.basePrice = newBasePrice; 
	}
	
	public String getShowType() {
		return "IMAX";
	}

}
