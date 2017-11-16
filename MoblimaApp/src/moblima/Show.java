package moblima;
import java.util.Calendar;
import java.util.Comparator;
import java.io.*;
/**
 * <code>Show</code> objects represents the different shows available for a particular <code>Movie</code>.
 * <code> Show</code> objects are stored under a particular <code> Cinema</code>'s <code>Show List</code>.
 * @author DanSeb
 * @see Cinema
 */
//change UML to include Date class and baseprice as static
public class Show implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8999338132604198550L;
	/**
	 * Stores the associated <code>Movie Title</code> of the <code>Show</code>.
	 */
	private String movie;
	/**
	 * Stores the associated <code>Date</code> & <code>Time<code> of the <code>Show</code>.
	 */
	private Calendar showTime;
	/**
	 * Stores the associated <code>Booked Seat Layout</code> of the <code>Show</code>, allowing customers to view available seats.
	 * <code>Seat Layout</code> takes the <code>Layout</code> of the <code> Cinema</code> which screens this particular <code>Show</code>. 
	 * @see Cinema
	 */
	private char[][] bookedLayout;
	/**
	 * Stores the <code>Base Price</code> of a <code> Show </code>.
	 */
	private static float basePrice;
	
//basePrice is not set in constructor, it is set in main before instantialization of show objects
//the first time Show is created, it takes in the array of the Cinema class to create an empty array of fixed size
	public Show(String movie,Calendar showTime,char[][] cinemaLayout){
		this.movie = movie;
		this.showTime = showTime;
		this.bookedLayout = cinemaLayout;
	}

	/**
	 * Allows <code>StaffAcc</code> to set the date & time of a <code>Show</code>.
	 */
//	change UML for this methods
	public void setTime(Calendar movieTiming){
		this.showTime = movieTiming;
	}
	/**
	 * @return <code>float</code> value of <code>Show</code>'s base price.
	 */
	public static float getBasePrice() {
		return basePrice;
	}
	/**
	 * Allows <code>StaffAcc</code> to set the base price of a <code>Show</code>.
	 */
	public static void setBasePrice(float newBasePrice){
		Show.basePrice = newBasePrice;
	}
	
//	/**
//	 * Marks out a seat with a 'X' once it has been booked by a customer in the <code>bookedLayout</code> array.
//	 * @param row
//	 * @param column
//	 */
////	remove the need for layout class and place the functions in show	
//	public void bookSeats(char row, int column) {
//		int tempRow = Character.getNumericValue(row) - 10;
//		bookedLayout[tempRow][column] = 'X';
//		
//	}
	
//	/**
//	 * Checks if the customer's chosen seat has been booked.
//	 * If it has been booked, then the booking fails.
//	 * @param row
//	 * @param column
//	 * @return boolean indicating whether a chosen seat has previously been booked.
//	 * @see MovieBookingMgr
//	 */
//	public boolean isOccupied(char row, int column) {
//		int tempRow = Character.getNumericValue(row) - 10;
//		if (bookedLayout[tempRow][column] == 'X')
//			return true;
//		else 
//			return false;
//	}
	
	/**
	 * @return <code>Date</code> object containing the <code>Show</code>'s date & time.
	 */
	public Calendar getShowTime() {
		return showTime;
	}
	
	/**
	 * @return <code>String</code> object containing the <code>Show</code>'s date & time.
	 */
	public String getShowTimeString(){
		return new String(showTime.get(Calendar.DAY_OF_MONTH) + "/" + (showTime.get(Calendar.MONTH)+1) + " " + 
				showTime.get(Calendar.HOUR_OF_DAY) + ":"+ showTime.get(Calendar.MINUTE));
	}
	
	/**
	 * @return <code>String</code> object containing the <code>Show</code>'s movie title.
	 */
	public String getMovieTitle() {
		return movie;
	}
	/**
	 * Allows <code>StaffAcc</code> to set the movie Title of a <code>Show</code>.
	 */
	public void setMovieTitle(String movieTitle) {
		movie = movieTitle;
	}
	/**
	 * @return <code>char[][]</code> containing this <code>Show</code>'s booked layout.
	 */
	public char[][] getBookedLayout() {
		return bookedLayout;
	}
	

	/**
	 * @return <code>String</code> containing show type.
	 */
	public String getShowType() {
		return " ";
	}

	/**
	 * Checks if the customer's chosen seat has been booked.
	 * If it has been booked, then the booking fails.
	 * Otherwise, the chosen seat will be marked with 'X' in the <code>bookedLayout</code> array.
	 * @param seatNumber
	 * @return <code> Boolean</code> value indicating success of seat booking.
	 * @see MovieBookingMgr
	 */
	public Boolean setBookedLayout(String[] seatNumber) {
		if(bookedLayout[Character.getNumericValue(seatNumber[0].charAt(0))-10][Integer.parseInt(seatNumber[1])] == 'X') {
			return false;
		};
		bookedLayout[Character.getNumericValue(seatNumber[0].charAt(0))-10][Integer.parseInt(seatNumber[1])] = 'X';
		return true;
	}
	
	/**
	 * Compares the show times between <code> Show</code> objects, which is used to sort them by date & time inside the <code>ArrayList&lt;Show&gt;</code> within the associated <code>Cinema</code> object.
	 * @see Cinema
	 */
	public static Comparator<Show> ShowTimeComparator = new Comparator<Show>() { // not sure how to represent in class diagram

		public int compare(Show s1, Show s2) {
		   Calendar showTime1 = s1.getShowTime();
		   Calendar showTime2 = s2.getShowTime();

		   //ascending order
		   return showTime1.compareTo(showTime2);
		   
		   //descending order
		   //return (int) (movieAveRating2 - movieAveRating1);

		   
	    }
	};

}