package moblima;

import java.util.ArrayList;

/**
 * Contains a reference to the list of <code>Cineplex</code> objects. 
 * <br>Manages the cineplex objects, namely adding and removing.
 * @see Cineplex
 */
public class CineplexList {

//public so that everyone can access cineplex list
	/**
	 * <code>ArrayList&lt;Cineplex&gt;</code> of <code>Cineplex</code> objects.
	 */
	public static ArrayList<Cineplex> cineplexList = new ArrayList<Cineplex>();

	/**
	 * Creates a <code>Cineplex</code> and adds it to the list.
	 * @param cineplexName Name of cineplex.
	 * @param cineplexCode Cineplex code (should be the first 3 letters of cineplex name).
	 */
	public static void addCineplex(String cineplexName, String cineplexCode){
		cineplexList.add(new Cineplex(cineplexName,cineplexCode));
	}
	
	/**
	 * Removes a <code>Cineplex</code> from the list of cineplexes.
	 * @param cineplexToRemove <code>Cineplex</code> to remove.
	 */
	public static void removeCineplex(Cineplex cineplexToRemove) {
		cineplexList.remove(cineplexToRemove);
	}
}