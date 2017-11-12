package moblima;
import java.util.Calendar;

//change UML to include Date class and baseprice as static
public class Show {
	private String movie;
	private Calendar showTime;
	private char[][] bookedLayout;
	private static float basePrice;
//basePrice is not set in constructor, it is set in main before instantialization of show objects
	
	public Show(String movie,Calendar showTime, char[][] bookedLayout){
		this.movie = movie;
		this.showTime = showTime;
		this.bookedLayout = bookedLayout;
	}

	
//change UML for this methods
	public void setTime(Calendar movieTiming){
		this.showTime = movieTiming;
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

}