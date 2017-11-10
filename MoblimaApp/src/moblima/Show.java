package moblima;

import java.util.Date;

//change UML to include Date class and baseprice as static
public abstract class Show {
	private Movie movie;
	private Date showTime;
	private GeneralLayout bookedLayout;
	private static float basePrice;
//basePrice is not set in constructor, it is set in main before instantialization of show objects
	
	public Show(Movie movie,Date showTime, GeneralLayout bookedLayout){
		this.movie = movie;
		this.showTime = showTime;
		this.bookedLayout = bookedLayout;
	}

	
//change UML for this methods
	public void setTime(Date movieTiming){
		this.showTime = movieTiming;
	}
	
	public static void setBasePrice(float newBasePrice){
		Show.basePrice = newBasePrice;
	}

}
