package moblima;

import java.util.ArrayList;

public class CineplexList {

//public so that everyone can access cineplex list
	public static ArrayList<Cineplex> cineplexList; //add functions addCinema, addShows

	
	public static void addCineplex(String cineplexName){
		cineplexList.add(new Cineplex(cineplexName));
	}
	
//	public static void addCinema(String cinemaName) { // not sure how to add seatLayout because we're gonna read 2d array from csv file?
//		cinemas.add(new Cinema(cinemaName, null)); //ArrayList<Cinema> newCinema= new ArrayList<Cinema>();
//		
//	}
	
}