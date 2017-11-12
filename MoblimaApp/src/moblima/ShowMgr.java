package moblima;

import java.util.Calendar;

public class ShowMgr {
	
	//implement Singleton structure
	private static ShowMgr instance;
	public static ShowMgr getInstance() {
		if(instance == null) {
			instance = new ShowMgr();
		}
		return instance;
	}
	
	public void addShow() {
		Cinema cinemaToAddTo = ConsoleBoundary.printAddShow();
		Movie movieToAdd = ConsoleBoundary.printMovieList();
		Calendar showTime = ConsoleBoundary.getShowTime();
		cinemaToAddTo.createShow(movieToAdd.getTitle(), showTime);
		//calls printChooseCinema(), returns Cinema
		//takes back cinema object
		//calls printMovieList(), takes movie object
		//calls boundary to get show time. take Calendar object //create console ask for show time.
		//calls cinema.createShow(movie, showTime)
	}
	
	public void removeShow() {
		
	}
	
	public void editShow() {
		
	}
	
	public void showOps() {
		boolean loop = true;
		while(loop) {
			int opsChoice = ConsoleBoundary.printShowOps();
			switch(opsChoice) {
			case 1: addShow();break;
			case 2: removeShow(); break;
			case 3: editShow(); break;
			case 9: loop = false; break;
			}
		}
	}
}
