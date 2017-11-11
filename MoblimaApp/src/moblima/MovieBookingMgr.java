package moblima;
import java.util.Scanner;
import java.util.Calendar;

public class MovieBookingMgr {
	Scanner sc;
	static boolean reset = false;
	Cineplex cineplex;
	Cinema cinema;
	Show show;
	Movie movie;
	String showType;
	String[] seatNumber = new String[2];
	boolean proceed, confirm;
	
	
	//implement Singleton structure
	private static MovieBookingMgr instance;
	public static MovieBookingMgr getInstance() {
		if(instance == null) {
			instance = new MovieBookingMgr();
		}
		return instance;
	}
	
	public void bookByMovie(){
		do {
			movie = ConsoleBoundary.printMovieList(); if(reset) break;
			proceed = ConsoleBoundary.printMovieInfo(movie); if(reset) break;
			if(proceed) cineplex = ConsoleBoundary.printChooseCineplex(); if(reset) break;
			cinema = ConsoleBoundary.printChooseCinema(cineplex); if(reset) break;
			showType = ConsoleBoundary.printChooseShowType(); if(reset) break;
			show = ConsoleBoundary.printShowsByMovie(movie, cineplex, cinema, showType); if(reset) break;
			seatNumber = ConsoleBoundary.printLayout(show); if(reset) break;
			confirm = ConsoleBoundary.printBookingConfirmation(); if(reset) break;
			if(confirm) {
				CustAcc c = (CustAcc) LoginMgr.getInstance().loggedInAccount;
				ConsoleBoundary.printTransaction(c); if(reset) break;
				c.addTransaction(new Transaction(cineplex, Calendar.getInstance(), movie));
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