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

//maybe constructor may not take in an array list, but construct the arraylist by calling the addshow function
	public Cinema (String name, char[][] seatLayout)
	{
		this.shows = new ArrayList<Show>();
		this.name = name;
		this.seatLayout = seatLayout;
		
	}

	public float calculatePrice(Show show) { //change UML diagram
		return show.getBasePrice() + premium;
	}
	
	public static void setPremium(float newPremium){
		Cinema.premium = newPremium;
	}

	public void createShow(String movie, Calendar showTime){
		shows.add(new Show(movie,showTime, seatLayout.clone()));
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
	
	public char[][] getSeatLayout() {
		return seatLayout;
	}

}
