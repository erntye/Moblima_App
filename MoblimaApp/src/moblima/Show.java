package moblima;

import java.util.Date;

//change UML to include Date class and baseprice as static
public abstract class Show {
	private Movie movie;
	private Date showTime;
	private GeneralLayout bookedLayout;
	private float showPrice;
	private static float basePrice;
	
	public Show(){
		
	}
	
	public void bookShow(){
		
	}
	
//change UML for this methods
	public void setTime(Date movieTiming){
		this.showTime = movieTiming;
	}
	
	public void setBasePrice(float newBasePrice){
		Show.basePrice = newBasePrice;
	}

}
