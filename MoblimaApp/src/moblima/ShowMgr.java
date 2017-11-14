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
		if(cinemaToAddTo == null)
			return;
		Movie movieToAdd = ConsoleBoundary.printMovieList();
		if(movieToAdd == null)
			return;
		Calendar showTime = ConsoleBoundary.getShowTime();
		if(showTime == null)
			return;
		String showType = ConsoleBoundary.printChooseShowType();
		if(showType == null)
			return;
		cinemaToAddTo.createShow(movieToAdd.getTitle(), showTime, showType);
	}
	
	public void removeShow() {
		Cinema cinemaToRemoveFrom = ConsoleBoundary.printRemoveShow();
		Show showToRemove = ConsoleBoundary.printShowList(cinemaToRemoveFrom);
		cinemaToRemoveFrom.removeShow(showToRemove);
	}
	
	public void editShow() {
		Cinema cinemaToEditFrom = ConsoleBoundary.printEditShow();
		Show showToEdit = ConsoleBoundary.printShowList(cinemaToEditFrom);
		ConsoleBoundary.printEditShowDetails(showToEdit);
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
			DataBoundary.saveCineplexList(CineplexList.cineplexList);
		}
	}
}
