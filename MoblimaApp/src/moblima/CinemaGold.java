package moblima;

//import java.util.ArrayList;

public class CinemaGold extends Cinema{
	
	private static float premium;
	
	public CinemaGold(String name, int layoutNumber){
		super(name, layoutNumber);
	}
	
	public static void setPremium(float newPremium){
		CinemaGold.premium = newPremium;
	}
}

