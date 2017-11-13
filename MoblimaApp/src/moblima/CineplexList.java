package moblima;

import java.util.ArrayList;

public class CineplexList {

//public so that everyone can access cineplex list
	public static ArrayList<Cineplex> cineplexList; //add functions addCinema, addShows
	public static ArrayList<Cinema> cinemas;
	public static ArrayList<Show> shows;
	
	public static void addCineplex(String cineplexName){
		cineplexList.add(new Cineplex(cineplexName));
		
	}
	
	public static void addCinema(String cinemaName) {
		cinemas.add(new Cinema(cinemaName, null)); //ArrayList<Cinema> newCinema= new ArrayList<Cinema>();
		
	}
		
	
	public static void addShows(String showDetails) {
		shows.add(new Show(showDetails, null, null));
		
	}
	
}