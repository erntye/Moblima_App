package moblima;
import java.util.Scanner;

public class MovieBookingMgr {
	Scanner sc;
	
	
	//implement Singleton structure
	private static MovieBookingMgr instance;
	public static MovieBookingMgr getInstance() {
		if(instance == null) {
			instance = new MovieBookingMgr();
		}
		return instance;
	}
	
	public Movie chooseMovie(){
		return ConsoleBoundary.printMovieList();	
	}
	
	public void chooseCineplex(){
		
	}
}