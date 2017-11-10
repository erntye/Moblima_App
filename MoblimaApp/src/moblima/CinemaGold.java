package moblima;

import java.util.ArrayList;

public class CinemaGold extends Cinema{
	
	private static float premium;
	
	public CinemaGold(ArrayList<Show> shows, String name){
		super(shows, name);
	}
	
	public static void setPremium(float newPremium){
		CinemaGold.premium = newPremium;
	}
}

