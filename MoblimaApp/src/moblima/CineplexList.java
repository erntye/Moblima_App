package moblima;

import java.util.ArrayList;

public class CineplexList {

//public so that everyone can access cineplex list
	public static ArrayList<Cineplex> cineplexList;

	
	public static void addCineplex(String cineplexName, String cineplexCode){
		cineplexList.add(new Cineplex(cineplexName,cineplexCode));
	}
	
	public static void removeCineplex(Cineplex cineplexToRemove) {
		cineplexList.remove(cineplexToRemove);
	}
}