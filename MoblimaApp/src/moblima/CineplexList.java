package moblima;

import java.util.ArrayList;

public class CineplexList {

//public so that everyone can access cineplex list
	public static ArrayList<Cineplex> cineplexList;

	public static void addCineplex(Cineplex cineplexToAdd){
		cineplexList.add(cineplexToAdd);
	}
	
}