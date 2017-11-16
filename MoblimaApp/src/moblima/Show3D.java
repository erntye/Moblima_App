package moblima;
import java.util.Calendar;
/**
 * Inherits from <code> Account</code> class.
 * @author DanSeb
 * @see Show
 */
public class Show3D extends Show {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3166998096548624910L;
	/**
	 * Stores the <code>Base Price</code> of a <code> Digital Show </code>.
	 */
	private static float basePrice;
	
	public Show3D(String movie, Calendar showTime, char[][] cinemaLayout) {
		super(movie, showTime, cinemaLayout);
	}
	/**
	 * @return <code>float</code> value of <code>Show3D</code>'s base price.
	 */
	public static float getBasePrice() {
		return basePrice;
	}
	/**
	 * Allows <code>StaffAcc</code> to set the <code>Base Price</code> of an <code>IMAX Show</code>.
	 */
	public static void setBasePrice(float newBasePrice){
		Show3D.basePrice = newBasePrice; 
	}
	
	/**
	 * @return <code>String</code> containing show type.
	 */
	public String getShowType() {
		return "3D";
	}

}
