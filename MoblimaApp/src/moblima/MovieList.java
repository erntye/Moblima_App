package moblima;
import java.util.*;
import java.util.ArrayList;

public class MovieList {
	public static ArrayList<Movie> movieList;
	
	public static void addMovie(Movie movieToAdd){
		movieList.add(movieToAdd);
	}
	
	public static void removeMovie(Movie movieToRemove){
		movieList.remove(movieToRemove);
	}
	
	public static void sortByRating() {
		Collections.sort(movieList, Movie.MovieRatingComparator);
	}
	
	public static void sortBySales() {
		Collections.sort(movieList, Movie.MovieSalesComparator);
	}
}
