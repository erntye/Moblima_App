package moblima;
import java.io.*;

import java.util.ArrayList;
import java.util.Comparator;

public class Movie implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5835831193063619356L;

	public enum Showing_Status {
		ComingSoon, NowShowing,Ended;
	}
	
	public enum Censorship_Rating {
		G,PG, PG13,NC16,M18,R21
	}
	
	private String title;
	private Showing_Status showingStatus;
	private String synopsis;
	private String director;
	private String[] cast;
	private float aveRating = 0; //initialize to 0
	private ArrayList<Reviews> reviews;
	private int reviewCount = 0; //initialize to 0
	private float sales;
	private Censorship_Rating censorshipRating;


//	maybe need this for initialization. check with Garion.
//	public Movie(String title, Showing_Status showingStatus, String synopsis,
//			String director, String[] cast, float aveRating, ArrayList<Reviews> reviews,
//			int reviewCount, float sales, Censorship_Rating censorshipRating){
//		this.title = title; 
//		this.showingStatus =  showingStatus;
//		this.synopsis = synopsis;
//		this.director = director;
//		this.cast = cast; 
//		this.aveRating = aveRating;
//		this.reviews = reviews;
//		this.reviewCount = reviewCount; 
//		this.sales = sales;
//		this.censorshipRating = censorshipRating;	
//	}
	public Movie(String title, Showing_Status showingStatus, String synopsis,
			String director, String[] cast, Censorship_Rating censorshipRating){
		this.title = title; 
		this.showingStatus =  showingStatus;
		this.synopsis = synopsis;
		this.director = director;
		this.cast = cast; 
		this.censorshipRating = censorshipRating;	
	}
	
	
//change class diagram
	public void changeStatus(Showing_Status showingStatus){
		this.showingStatus = showingStatus;
	}
//change class diagram
	public void addReviews(Reviews reviewToAdd){
		this.reviews.add(reviewToAdd);
		updateRatings(reviewToAdd.getRating());
	}
	
	public void updateRatings(int ratingToAdd){
		this.aveRating = (aveRating*reviewCount+ ratingToAdd)/reviewCount;
		this.reviewCount++;
	}
	
	public String getTitle(){
		return title;
	}
	
	public Showing_Status getShowingStatus(){
		return showingStatus;
	}
	
	public Censorship_Rating getCensorshipRating(){
		return censorshipRating;
	}

	public String getSynopsis(){
		return synopsis;
	}
	
	public String getDirector(){
		return director;
	}
	
	public String[] getCast(){
		return cast;
	}
	
	public float getAverageRating(){
		return aveRating;
	}
	
	public ArrayList<Reviews> getReviews(){
		return reviews;
	}
	
	public float getSales() {
		return sales;
	}
	
	// Sort by Rating
	public static Comparator<Movie> MovieRatingComparator = new Comparator<Movie>() {

		public int compare(Movie m1, Movie m2) {
		   float movieAveRating1 = m1.getAverageRating();
		   float movieAveRating2 = m2.getAverageRating();

		   //descending order
		   return (int) (movieAveRating2 - movieAveRating1);
		   
		   //ascending order
		   //return StudentName1.compareTo(StudentName2);

		   
	    }
	};
	
	// Sort by Sales
	public static Comparator<Movie> MovieSalesComparator = new Comparator<Movie>() {

		public int compare(Movie m1, Movie m2) {
		   float movieSales1 = m1.getSales();
		   float movieSales2 = m2.getSales();

		   //descending order
		   return (int) (movieSales2 - movieSales1);
		   
		   //ascending order
		   //return StudentName1.compareTo(StudentName2);

		   
	    }
	};

	
//	@Override
//	public int compareTo(Movie compareMovie) {
//        float compareRating =  ((Movie)compareMovie).getAverageRating();
//        /* For Descending order do like this */
//        return (int) (compareRating - this.aveRating);
//        
//        /* For Ascending order*/
//        //return this.studentage-compareage;
//	}
	
//	@Override
//	public String toString() {
//        return "[Title =" + title + "Average Rating: " + aveRating + "]";
//    }
}
