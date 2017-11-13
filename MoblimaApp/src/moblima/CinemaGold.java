package moblima;

import java.util.ArrayList;

public class CinemaGold extends Cinema{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4127083264271994397L;
	private static float premium;
	
	public CinemaGold(String name, char[][] seatLayout){
		super(name, seatLayout);
	}
	
	public static void setPremium(float newPremium){
		CinemaGold.premium = newPremium;
	}
}

