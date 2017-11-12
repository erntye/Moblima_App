package moblima;
import java.util.Scanner;
import java.util.Calendar;

public class MovieBookingMgr {
	Scanner sc;
	static boolean reset = false;
	private Cineplex cineplex;
	private Cinema cinema;
	private Show show;
	private Movie movie;
	private String showType;
	private char[] seatNumber = new char[2];
	private boolean proceed, confirm;
	private float price;
	
	
	//implement Singleton structure
	private static MovieBookingMgr instance;
	public static MovieBookingMgr getInstance() {
		if(instance == null) {
			instance = new MovieBookingMgr();
		}
		return instance;
	}
	
	public void bookByMovie(){ //need to save seat booking into layout files
		do {
			proceed = false; confirm = false;
			movie = ConsoleBoundary.printMovieList(); if(reset) break;
			proceed = ConsoleBoundary.printMovieInfo(movie); if(reset) break;
			if(proceed) cineplex = ConsoleBoundary.printChooseCineplex(); if(reset) break;
			cinema = ConsoleBoundary.printChooseCinema(cineplex); if(reset) break;
			showType = ConsoleBoundary.printChooseShowType(); if(reset) break;
			show = ConsoleBoundary.printShowsByMovie(movie, cineplex, cinema, showType); if(reset) break;
			price = cinema.calculatePrice(show);
			seatNumber = ConsoleBoundary.printLayout(show); if(reset) break;
			confirm = ConsoleBoundary.printBookingConfirmation(price, cinema); if(reset) break;
			if(confirm) {
				CustAcc c = (CustAcc) LoginMgr.getInstance().loggedInAccount;
				Transaction latest = new Transaction(cineplex, Calendar.getInstance(), movie.getTitle());
				c.transactionList.add(latest);
				ConsoleBoundary.printTransaction(c,latest, show, showType, seatNumber, price); if(reset) break;
			}
		} while (!reset);
		
	}
	
//	public void bookByCineplex(){
//		do {
//			Cineplex cineplex = ConsoleBoundary.printCineplexList();
//			Show show = ConsoleBoundary.printShowsByCineplex(cineplex);
//			String[] seatNumber = ConsoleBoundary.printLayout(show);
//			int confirm = ConsoleBoundary.printBookingConfirmation(show, seatNumber); if(reset) break;
//			ConsoleBoundary.printTransaction(confirm); if(reset) break;
//		} while (!reset);
//	}
}