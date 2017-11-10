package moblima;

import java.util.ArrayList;

public class Movie {
	
	public enum Showing_Status {
		ComingSoon, NowShowing,Ended
	}
	
	public enum CENSORSHIP_RATING {
		G,PG, PG13,NC16,M18,R21
	}
	
	private String title;
	private Showing_Status showingStatus;
	private String synopsis;
	private String director;
	private String[] cast;
	private float aveRating;
	private ArrayList<Reviews> reviews;
	private int reviewCount = 0; //usually set to 0;
	private float sales;
	private CENSORSHIP_RATING censorshipRating;

	
	public Movie(String title, Showing_Status showingStatus, String synopsis,
			String director, String[] cast, float aveRating, ArrayList<Reviews> reviews,
			int reviewCount, float sales, CENSORSHIP_RATING censorshipRating){
		this.title = title; 
		this.showingStatus =  showingStatus;
		this.synopsis = synopsis;
		this.director = director;
		this.cast = cast; 
		this.aveRating = aveRating;
		this.reviews = reviews;
		this.reviewCount = reviewCount; 
		this.sales = sales;
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
	
}
