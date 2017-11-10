package moblima;

import java.util.ArrayList;

public class CinemaPlatinum extends Cinema{
	
	private static float premium;
	
	public CinemaPlatinum(ArrayList<Show> shows, String name){
		super(shows, name);
	}
	
	public static void setPremium(float newPremium){
		CinemaPlatinum.premium = newPremium;
	}
}
