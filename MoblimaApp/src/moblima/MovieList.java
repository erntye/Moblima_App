package moblima;

import java.util.ArrayList;

public class MovieList {
	public static ArrayList<Movie> movieList;
	//seal jie??
	
	public static void addMovie(Movie movieToAdd){
		movieList.add(movieToAdd);
	}
}
