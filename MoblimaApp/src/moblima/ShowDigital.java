package moblima;
import java.util.Calendar;
/**
 * Inherits from <code> Account</code> class.
 * @author DanSeb
 * @see Account
 *
 */
public class ShowDigital extends Show {
	/**
	 * Stores the <code>Base Price</code> of an <code> Digital Show </code>.
	 */
	private static final long serialVersionUID = -6262724137447971700L;
	private static float basePrice;
	
	public ShowDigital(String movie, Calendar showTime, char[][] cinemaLayout) {
		super(movie, showTime, cinemaLayout);
	}

	public static float getBasePrice() {
		return basePrice;
	}
	/**
	 * Allows <code>StaffAcc</code> to set the <code>Base Price</code> of an <code>Digital Show</code>.
	 */
	public static void setBasePrice(float newBasePrice){
		ShowDigital.basePrice = newBasePrice; 
	}
	
	public String getShowType() {
		return "Digital";
	}

}
