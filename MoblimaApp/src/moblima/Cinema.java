package moblima;

import java.util.ArrayList;

public class Cinema {
	private ArrayList<Show> shows;
	private static float premium;
	private String name;

	public Cinema (ArrayList<Show> shows, String name)
	{
		this.shows = shows;
		this.name = name;
	}

	public float calculatePrice(float basePrice, float premium) { //change UML diagram
		return basePrice + premium;
	}
	
	public static void setPremium(float newPremium){
		Cinema.premium = newPremium;
	}


}
