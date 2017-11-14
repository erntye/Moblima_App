package moblima;
import java.util.Calendar;
import java.util.Comparator;
import java.io.*;

//change UML to include Date class and baseprice as static
public class Show implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8999338132604198550L;
	private String movie;
	private Calendar showTime;
	private char[][] bookedLayout;
	private static float basePrice;
	
//basePrice is not set in constructor, it is set in main before instantialization of show objects
//the first time Show is created, it takes in the array of the Cinema class to create an empty array of fixed size
	public Show(String movie,Calendar showTime,char[][] cinemaLayout){
		this.movie = movie;
		this.showTime = showTime;
		this.bookedLayout = cinemaLayout;
	}

	
//change UML for this methods
	public void setTime(Calendar movieTiming){
		this.showTime = movieTiming;
	}
	
	public float getBasePrice() {
		return basePrice;
	}
	
	public static void setBasePrice(float newBasePrice){
		Show.basePrice = newBasePrice;
	}
	
//remove the need for layout class and place the functions in show	
	public void bookSeats(char row, int column) {
		int tempRow = Character.getNumericValue(row) - 10;
		bookedLayout[tempRow][column] = 'X';
		
	}

	public boolean isOccupied(char row, int column) {
		int tempRow = Character.getNumericValue(row) - 10;
		if (bookedLayout[tempRow][column] == 'X')
			return true;
		else 
			return false;
	}
	
	public Calendar getShowTime() {
		return showTime;
	}
	
	public String getMovieTitle() {
		return movie;
	}
	
	public void setMovieTitle(String movieTitle) {
		movie = movieTitle;
	}
	
	public char[][] getBookedLayout() {
		return bookedLayout;
	}
	

	
	public String getShowType() {
		return " ";
	}
	
	public static Comparator<Show> ShowTimeComparator = new Comparator<Show>() {

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