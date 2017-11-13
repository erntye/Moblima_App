package moblima;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.*;
import java.io.*;

public class Cinema implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1100625453212704609L;
	private ArrayList<Show> shows;
	private static float premium;
	private String name;
	private int rows, columns;
	private char[][] seatLayout;

//maybe constructor may not take in an array list, but construct the arraylist by calling the addshow function
	public Cinema (String name, int layoutNumber)
	{
		this.shows = new ArrayList<Show>();
		this.name = name;
		this.seatLayout = CSVBoundary.getLayout(layoutNumber);
		
	}

	public float calculatePrice(Show show) { //change UML diagram
		return show.getBasePrice() + premium;
	}
	
	public static void setPremium(float newPremium){
		Cinema.premium = newPremium;
	}

	public void createShow(String movie, Calendar showTime, String showType){
		switch(showType) {
		case "Digital":
			shows.add(new ShowDigital(movie,showTime, seatLayout.clone()));
		case "3D":
			shows.add(new Show3D(movie,showTime, seatLayout.clone()));
		case "IMAX":
			shows.add(new ShowIMAX(movie,showTime, seatLayout.clone()));
		}
	}
	
	public void removeShow(Show showToRemove) {
		if(shows.remove(showToRemove)) {
			System.out.println("Show successfully removed!");
		}
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
