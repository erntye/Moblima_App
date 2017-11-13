package moblima;

import java.util.ArrayList;

public class CineplexList {

//public so that everyone can access cineplex list
	public static ArrayList<Cineplex> cineplexList; //add functions addCinema, addShows
	public static ArrayList<Cinema> cinemas;
	public static ArrayList<Show> shows;
	
	public static void addCineplex(String name){
		cineplexList.add(new Cineplex(name));
		
	}
	
	public static void addCinema(String cinemaName) {
		cinemas.add(new Cinema(cinemaName, null)); //ArrayList<Cinema> newCinema= new ArrayList<Cinema>();
		
	}
		
	}
	
	public static void addShows(String shows) {
		shows.add(new Show(movie, showTime, bookedLayout));
		
	}
	
}