package moblima;

//import java.util.ArrayList;

public class CinemaGold extends Cinema{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4127083264271994397L;
	private static float premium;
	
	public CinemaGold(String name, int layoutNumber){
		super(name, layoutNumber);
	}
	
	public static void setPremium(float newPremium){
		CinemaGold.premium = newPremium;
	}
	
	public float calculatePrice(Show show, CustAcc custAcc) { 
		float price = show.getBasePrice() + premium;
		if(PublicHolidayCalendar.isPubHol(show.getShowTime()))
			price += PublicHolidayCalendar.getPublicHolidayPremium();
		switch(custAcc.getAgeCat()) {
		case CHILD:
			price *= 0.25;
			break;
		case STUDENT:
			price *= 0.50;
			break;
		case ADULT:
			break;
		case SENIOR_CITIZEN:
			price *= 0.50;
			break;
		}
		
		return price;
	}
}

