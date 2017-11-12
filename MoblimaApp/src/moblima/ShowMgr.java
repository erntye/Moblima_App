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
		String showType = ConsoleBoundary.printChooseShowType();
		cinemaToAddTo.createShow(movieToAdd.getTitle(), showTime, showType);
	}
	
	public void removeShow() {
		Cinema cinemaToRemoveFrom = ConsoleBoundary.printRemoveShow();
		
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
