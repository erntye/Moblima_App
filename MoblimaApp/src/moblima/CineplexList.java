package moblima;

import java.util.ArrayList;

public class CineplexList {

//public so that everyone can access cineplex list
	public static ArrayList<Cineplex> cineplexList; //add functions addCinema, addShows
	public static ArrayList<Cinema> cinemas;
	public static ArrayList<Show> shows;
	
	public static Cineplex addCineplex(String cineplexName){
		Cineplex cineplex = new Cineplex(cineplexName);
		cineplexList.add(cineplex);
		return cineplex;
	}
	
	public static void addCinema(String cinemaName) { // not sure how to add seatLayout because we're gonna read 2d array from csv file?
		cinemas.add(new Cinema(cinemaName, null)); //ArrayList<Cinema> newCinema= new ArrayList<Cinema>();
		
	}
	
}