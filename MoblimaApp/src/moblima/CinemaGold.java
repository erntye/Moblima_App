package moblima;

import java.util.ArrayList;

public class CinemaGold extends Cinema{
	
	private static float premium;
	
	public CinemaGold(String name, char[][] seatLayout){
		super(name, seatLayout);
	}
	
	public static void setPremium(float newPremium){
		CinemaGold.premium = newPremium;
	}
}

