package moblima;
import java.util.Calendar;
import java.io.*;
/**
 * Transactions for Customer's booking history
 * @author DanSeb
 *
 */
public class Transaction implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3688580483418018261L;
	/**
	 * Transaction ID in XXXYYYYMMDDhhmm.
	 */
	private String tid;
	/**
	 * Date of transaction.
	 */
	private String date;
	/**
	 * Title of movie booked.
	 */
	private String movieTitle;
	
	/**
	 * Transaction Constructor.
	 * @param cineplex
	 * @param date
	 * @param movieTitle
	 */
	public Transaction (Cineplex cineplex, Calendar date, String movieTitle) {
		String code = cineplex.getCode();
		String year = Integer.toString(date.get(Calendar.YEAR));
		String month = Integer.toString(date.get(Calendar.MONTH)+1);
		String day = Integer.toString(date.get(Calendar.DAY_OF_MONTH));
		if(date.get(Calendar.DAY_OF_MONTH)<10) {
			day = "0" + day;
		}
		String hour = Integer.toString(date.get(Calendar.HOUR_OF_DAY));
		String minute = Integer.toString(date.get(Calendar.MINUTE));
		this.date = year+month+day+hour+minute;
		this.tid = code + this.date;
		this.movieTitle = movieTitle;
	}
	
	public String getTid() {
		return tid;
	}
	
	public String getMovieTitle() {
		return movieTitle;
	}
	
	public String getDate() {
		return date;
	}
	

}

