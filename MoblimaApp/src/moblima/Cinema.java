package moblima;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.*;

public class Cinema {
	private ArrayList<Show> shows;
	private static float premium;
	private String name;
	private int rows, columns;
	private char[][] seatLayout;

//premium is a static which needs to be set by initializer
	public Cinema (String name, char[][] seatLayout)
	{
		this.shows = new ArrayList<Show>();
		this.name = name;
		this.seatLayout = seatLayout;
		
	}

	public float calculatePrice(Show show) { 
		return show.getBasePrice() + premium;
	}
	
	public static void setPremium(float newPremium){
		Cinema.premium = newPremium;
	}

	public void createShow(String movie, Calendar showTime){
		shows.add(new Show(movie,showTime, seatLayout));
	}
	
	public String getName() {
		return name;
	}
	
	public ArrayList<Show> getShows() {
		return shows;
	}
	
	public void sortShowsByTime() {
		Collections.sort(shows, Show.ShowTimeComparator);
	}

}
